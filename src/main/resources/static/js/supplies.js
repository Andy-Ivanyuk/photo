var app = angular.module("photo", []);

app.controller("AppCtrl", function ($http, $scope) {

    $scope.entries = [];
    $http.get('/api/supplies').then(function (response){
        $scope.entries = response.data;
        console.log(response);
    });
    this.del_entry = function del(id) {
        $http.get('/api/supplies/del?id='+id).then(function (response){
            window.location.reload();
            window.alert('Замовлення було видалено!');
        });
    };

    this.start_insert_entry = function add() {

        $http.get('/api/kiosks').then(function (response){
            var kiosks = response.data;
            var selector = document.getElementById("Kiosks");
            $(selector).empty();
            for (var i = 0; i < kiosks.length; i++) {
                var option = document.createElement("option");
                option.text = kiosks[i].address;
                option.value = kiosks[i].id;
                selector.add(option);
            }
        });
        $http.get('/api/type_of_supplies').then(function (response){
            var typeOfSupplies = response.data;
            var selector = document.getElementById("TypeOfSupplies");
            $(selector).empty();
            for (var i = 0; i < typeOfSupplies.length; i++) {
                var option = document.createElement("option");
                option.text = typeOfSupplies[i].name;
                option.value = typeOfSupplies[i].id;
                selector.add(option);
            }
        });
        $http.get('/api/clients').then(function (response){
            var clients = response.data;
            var selector = document.getElementById("Clients");
            $(selector).empty();
            for (var i = 0; i < clients.length; i++) {
                var option = document.createElement("option");
                option.text = clients[i].name;
                option.value = clients[i].id;
                selector.add(option);
            }
        });
        var selector2 = document.getElementById("IsDone");
        $(selector2).empty();

        var option2_1 = document.createElement("option");
        option2_1.text = "Завершено";
        option2_1.value = true;
        selector2.add(option2_1);

        var option2_2 = document.createElement("option");
        option2_2.text = "Не завершено";
        option2_2.value = false;
        selector2.add(option2_2);

        var selector3 = document.getElementById("Format");
        $(selector3).empty();

        var option3_1 = document.createElement("option");
        option3_1.text = "JPG";
        option3_1.value = "JPG";
        selector3.add(option3_1);

        var option3_2 = document.createElement("option");
        option3_2.text = "PNG";
        option3_2.value = "PNG";
        selector3.add(option3_2);

        var option3_3 = document.createElement("option");
        option3_3.text = "BMP";
        option3_3.value = "BMP";
        selector3.add(option3_3);
    };

    this.insert_entry = function add() {
        var kiosksIndex = document.getElementById("Kiosks").selectedIndex;
        var kioskId = document.getElementById("Kiosks").options[kiosksIndex].value;
        var typeOfSuppliesIndex = document.getElementById("TypeOfSupplies").selectedIndex;
        var typeOfSupplyId = document.getElementById("TypeOfSupplies").options[typeOfSuppliesIndex].value;
        var price = document.getElementById("Price").value;
        var amountOfPhotosPerFrame = document.getElementById("AmountOfPhotosPerFrame").value;
        var totalAmountOfPhotos = document.getElementById("TotalAmountOfPhotos").value;
        var formatIndex = document.getElementById("Format").selectedIndex;
        var format = document.getElementById("Format").options[formatIndex].value;
        var paperType = document.getElementById("PaperType").value;
        var supplyDate = document.getElementById("SupplyDate").value;
        var isDoneIndex = document.getElementById("IsDone").selectedIndex;
        var isDone = document.getElementById("IsDone").options[isDoneIndex].value;
        var clientsIndex = document.getElementById("Clients").selectedIndex;
        var clientId = document.getElementById("Clients").options[clientsIndex].value;

        $http.get('/api/supplies/insert?kioskId='+kioskId+'&typeOfSupplyId='+typeOfSupplyId+'&price='+price
                +'&amountOfPhotosPerFrame='+amountOfPhotosPerFrame+'&totalAmountOfPhotos='+totalAmountOfPhotos
                +'&format='+format+'&paperType='+paperType+'&supplyDate='+supplyDate+'&isDone='+isDone+'&clientId='+clientId).then(function (response){
            window.location.reload();
            window.alert('Замовлення було успішно додано!');
        });
    };
    var thisId;

    this.start_update_entry = function upd(id, kioskId, typeOfSupplyId, price, amountOfPhotosPerFrame,
                                           totalAmountOfPhotos, format, paperType, supplyDate, isDone,
                                           clientId) {
        thisId=id;
        var kiosksIndex;
        $http.get('/api/kiosks').then(function (response){
            var kiosks = response.data;
            var selector = document.getElementById("KiosksUPD");
            $(selector).empty();
            for (var i = 0; i < kiosks.length; i++) {
                var option = document.createElement("option");
                option.text = kiosks[i].address;
                option.value = kiosks[i].id;
                if(kiosks[i].id === kioskId)
                {
                    kiosksIndex = i;

                }
                selector.add(option);
            }

            document.getElementById("KiosksUPD").selectedIndex=kiosksIndex;
        });
        $http.get('/api/type_of_supplies').then(function (response){
            var typeOfSupplies = response.data;
            var selector = document.getElementById("TypeOfSuppliesUPD");
            $(selector).empty();
            for (var i = 0; i < typeOfSupplies.length; i++) {
                var option = document.createElement("option");
                option.text = typeOfSupplies[i].name;
                option.value = typeOfSupplies[i].id;
                selector.add(option);
                if(typeOfSupplies[i].id == typeOfSupplyId)
                {
                    selector.selectedIndex=i;

                }
            }

            // document.getElementById("TypeOfSuppliesUPD").selectedIndex=typeOfSupplyId;
        });
        var clientsIndex;
        $http.get('/api/clients').then(function (response){
            var clients = response.data;
            var selector = document.getElementById("ClientsUPD");
            $(selector).empty();
            for (var i = 0; i < clients.length; i++) {
                var option = document.createElement("option");
                option.text = clients[i].name;
                option.value = clients[i].id;
                if(clients[i].id === clientId)
                {
                    clientsIndex = i;

                }
                selector.add(option);
            }

            document.getElementById("ClientsUPD").selectedIndex=clientsIndex;
        });

        var selector2 = document.getElementById("IsDoneUPD");
        $(selector2).empty();

        var option2_1 = document.createElement("option");
        option2_1.text = "Завершено";
        option2_1.value = true;
        selector2.add(option2_1);

        var option2_2 = document.createElement("option");
        option2_2.text = "Не завершено";
        option2_2.value = false;
        selector2.add(option2_2);
        if(isDone) selector2.selectedIndex=0;
        else selector2.selectedIndex=1;


        var selector3 = document.getElementById("FormatUPD");
        $(selector3).empty();

        var option3_1 = document.createElement("option");
        option3_1.text = "JPG";
        option3_1.value = "JPG";
        selector3.add(option3_1);
        if(option3_1.value==format)
            selector3.selectedIndex=0;

        var option3_2 = document.createElement("option");
        option3_2.text = "PNG";
        option3_2.value = "PNG";
        selector3.add(option3_2);
        if(option3_2.value==format)
            selector3.selectedIndex=1;

        var option3_3 = document.createElement("option");
        option3_3.text = "BMP";
        option3_3.value = "BMP";
        selector3.add(option3_3);
        if(option3_3.value==format)
            selector3.selectedIndex=2;

        document.getElementById("PriceUPD").value=price;
        document.getElementById("AmountOfPhotosPerFrameUPD").value=amountOfPhotosPerFrame;
        document.getElementById("TotalAmountOfPhotosUPD").value=totalAmountOfPhotos;
        document.getElementById("FormatUPD").value=format;
        document.getElementById("PaperTypeUPD").value=paperType;
        document.getElementById("SupplyDateUPD").value=supplyDate;
        document.getElementById("IsDoneUPD").value=isDone;
    };
    this.update_entry = function update_entry() {
        var kiosksIndex = document.getElementById("KiosksUPD").selectedIndex;
        var kioskId = document.getElementById("KiosksUPD").options[kiosksIndex].value;
        var typeOfSuppliesIndex = document.getElementById("TypeOfSuppliesUPD").selectedIndex;
        var typeOfSupplyId = document.getElementById("TypeOfSuppliesUPD").options[typeOfSuppliesIndex].value;
        var price = document.getElementById("PriceUPD").value;
        var amountOfPhotosPerFrame = document.getElementById("AmountOfPhotosPerFrameUPD").value;
        var totalAmountOfPhotos = document.getElementById("TotalAmountOfPhotosUPD").value;
        var formatIndex = document.getElementById("FormatUPD").selectedIndex;
        var format = document.getElementById("FormatUPD").options[formatIndex].value;
        var paperType = document.getElementById("PaperTypeUPD").value;
        var supplyDate = document.getElementById("SupplyDateUPD").value;
        var isDoneIndex = document.getElementById("IsDoneUPD").selectedIndex;
        var isDone = document.getElementById("IsDoneUPD").options[isDoneIndex].value;
        var clientsIndex = document.getElementById("ClientsUPD").selectedIndex;
        var clientId = document.getElementById("ClientsUPD").options[clientsIndex].value;

        $http.get('/api/supplies/update?id='+thisId+'&kioskId='+kioskId+'&typeOfSupplyId='+typeOfSupplyId+'&price='+price
                +'&amountOfPhotosPerFrame='+amountOfPhotosPerFrame+'&totalAmountOfPhotos='+totalAmountOfPhotos
                +'&format='+format+'&paperType='+paperType+'&supplyDate='+supplyDate+'&isDone='+isDone+'&clientId='
                +clientId).then(function (response){
            window.location.reload();
        });
    };
});