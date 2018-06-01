var app = angular.module("photo", []);

app.controller("AppCtrl", function ($http, $scope) {

    $scope.entries = [];
    $http.get('/api/good_type').then(function (response){
        $scope.entries = response.data;
        console.log(response);
    });
    this.del_entry = function del(id) {
        $http.get('/api/good_type/del?id='+id).then(function (response){
            window.location.reload();
            window.alert('Тип товару було видалено!');
        });
    };

    this.start_insert_entry = function add() {
    };

    this.insert_entry = function add() {
        var name = document.getElementById("Name").value;

        $http.get('/api/good_type/insert?name='+name).then(function (response){
            window.location.reload();
            window.alert('Тип товару було успішно додано!');
        });
    };
    var thisId;

    this.start_update_entry = function upd(id, name) {
        thisId = id;
        document.getElementById("NameUPD").value=name;
    };
    this.update_entry = function update_entry() {
        var name = document.getElementById("NameUPD").value;

        $http.get('/api/good_type/update?id='+thisId+'&name='+name).then(function (response){
            window.location.reload();
        });
    };
});