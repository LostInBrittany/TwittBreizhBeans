'use strict';

/* Controllers */

function PageCtrl($scope) {
    $scope.navbar = { name: 'navbar', url: 'partials/navbar'};
    $scope.herounit = { name: 'herounit', url: 'partials/herounit'};
}
// Injecting variables
PageCtrl.$inject = ['$scope'];

function AboutCtrl() {}
AboutCtrl.$inject = [];

function SigningCtrl() {}
SigningCtrl.$inject = [];


function  MainCtrl($scope, $location,TwittList) {

    $scope.showSigningPanel = false;

    $scope.signing = function() {
        $scope.showSigningPanel = true;
    }
    $scope.exitSigning = function() {
        $scope.showSigningPanel = false;
    }

    $scope.signingPanelIsShown = function() {
        return   $scope.showSigningPanel
    }


    /*

    $scope.twitt = new Twitt();

    $scope.save = function() {
        Twitt.save($scope.twitt, function(twitt) {
                $location.path('/edit/' + twitt._id.$oid);
            });
    }
    $scope.isClean = function() {
        if (($scope.twitt.user == "")||($scope.twitt.content == "")) {
            return true;
        }
        return false;
    }
    */
}
MainCtrl.$inject = ['$scope','$location','TwittList'];

function  TwittboxCtrl($scope, $location,TwittList,$timeout) {
    $scope.reloadList = function() {
        $scope.twittList = TwittList.query();
        $timeout($scope.reloadList, 5000);
    }
    $scope.reloadList();
}
TwittboxCtrl.$inject = ['$scope','$location','TwittList','$timeout'];