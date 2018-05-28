var app = angular.module("photo", []);

app.controller("AppCtrl", function ($http, $scope) {

    $scope.entries = [];
    $http.get('/api/clients').then(function (response){
        $scope.entries=response.data;
        console.log(response);
    });
    this.del_entry = function del(id) {
        $http.get('/api/clients/del?id='+id).then(function (response){
            window.location.reload();
            window.alert('Клієнта було видалено!');
        });
    };

    this.start_insert_entry = function add() {

        $http.get('/api/branches/get').then(function (response){
            var branches = response.data;
            var selector = document.getElementById("Branches");
            $(selector).empty();
            for (var i = 0; i < branches.length; i++) {
                var option = document.createElement("option");
                option.text = branches[i].branchAddress;
                option.value = branches[i].branchId;
                selector.add(option);
            }
        });
    };

    this.insert = function add() {
        var name = document.getElementById("Name").value;
        var discountCard = document.getElementById("DiscountCard").value;
        var branchIndex = document.getElementById("Branches").selectedIndex;
        var branchId = document.getElementById("Branches").options[branchIndex].value;

        $http.get('/api/coach/insert?name='+name+'&discountCard='+discountCard+'&branch='+branchId)
            .then(function (response){
            window.location.reload();
            window.alert('Клієнта було успішно додано!');
        });
    };
    var thisId;

    this.start_update_entry = function upd(id, name, discountCard, branchId) {
        thisId=id;
        var thisIndex;
        $http.get('/api/branches').then(function (response){
            var branches = response.data;
            var selector = document.getElementById("WorkerUPD");
            $(selector).empty();
            for (var i = 0; i < branches.length; i++) {
                var option = document.createElement("option");
                option.text = branches[i].name;
                option.value = branches[i].id;
                if(branches[i].id === branchId)
                {
                    thisIndex = i;

                }
                selector.add(option);
            }

            document.getElementById("BranchesUPD").selectedIndex=thisIndex;
        });
        document.getElementById("NameUPD").value=name;
        document.getElementById("DiscountCardUPD").value=discountCard;
    };
    this.update_entry = function upd() {
        var name = document.getElementById("NameUPD").value;
        var discountCard = document.getElementById("DiscountCardUPD").value;
        var branchIndex = document.getElementById("BranchUPD").selectedIndex;
        var branchId = document.getElementById("BranchUPD").options[branchIndex].value;

        $http.get('/api/agreements/update?id='+thisId+'&name='+name+'&discountCard='+discountCard+'&branch='+branchId).then(function (response){
            window.location.reload();
        });
    };
});