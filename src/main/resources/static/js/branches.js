var app = angular.module("photo", []);

app.controller("AppCtrl", function ($http, $scope) {

    $scope.entries = [];
    $http.get('/api/branches').then(function (response){
        $scope.entries=response.data;
        console.log(response);
    });
    this.del_entry = function del(id) {
        $http.get('/api/branches/del?id='+id).then(function (response){
            window.location.reload();
            window.alert('Вітку було видалено!');
        });
    };

    this.start_insert_entry = function add() {
    };

    this.insert = function insert() {
        var branchAddress = document.getElementById("Address").value;
        var branchAmountOfWorkplaces = document.getElementById("AmountOfWorkplaces").value;

        $http.get('/api/branches/insert?branchAddress='+branchAddress+'&branchAmountOfWorkplaces='+branchAmountOfWorkplaces)
            .then(function (response){
                window.location.reload();
                window.alert('Вітку було успішно додано!');
            });
    };
    var thisId;

    this.start_update_entry = function upd(id, branchAddress, branchAmountOfWorkplaces) {
        thisId = id;
        window.alert("In update_entry");
        document.getElementById("AddressUPD").value=branchAddress;
        document.getElementById("BranchAmountOfWorkplacesUPD").value=branchAmountOfWorkplaces;
    };
    this.update_entry = function update_entry() {
        var branchAddress = document.getElementById("AddressUPD").value;
        var branchAmountOfWorkplaces = document.getElementById("AmountOfWorkplacesUPD").value;
        window.alert("In update");

        $http.get('/api/branches/update?id='+thisId+'&branchAddress='+branchAddress+'&branchAmountOfWorkplaces='
            +branchAmountOfWorkplaces).then(function (response){
            window.alert("In get");
            window.location.reload();
        });
    };
    // function checkAdd() {
    //     var branchAddress = document.getElementById("BranchAddress").value;
    //     var branchAmountOfWorkplaces = document.getElementById("BranchAmountOfWorkplaces").value;
    //
    //     var button = $(".btn-apply");
    //     button.prop('disabled', true);
    //
    //     if (branchAddress.length > 0 && branchAmountOfWorkplaces.length > 0) {
    //         button.prop('disabled', false);
    //     }
    // }
    //
    // $("#BranchAddressUPD, #BranchAmountOfWorkplacesUPD").bind('input', function() { checkUpdate(); });
    //
    // function checkUpdate() {
    //     var branchAddress = document.getElementById("BranchAddressUPD").value;
    //     var branchAmountOfWorkplaces = document.getElementById("BranchAmountOfWorkplacesUPD").value;
    //
    //     var button = $(".btn-apply");
    //     button.prop('disabled', true);
    //
    //     if (branchAddress.length > 0 && branchAmountOfWorkplaces.length > 0) {
    //         button.prop('disabled', false);
    //     }
    // }
});