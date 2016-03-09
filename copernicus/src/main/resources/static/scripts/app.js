"use strict";

var app = angular.module("sampleapp",[]);

app.controller("product", ["$scope", "$http", function ($scope, $http) {
    $scope.products = [];
    $http.get("/product")
        .then(function mySuccess(response) {
            $scope.products = response.data;
        }, function myError(response) {
            alert(response);
        });
}]);