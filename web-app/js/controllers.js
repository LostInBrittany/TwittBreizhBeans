'use strict';

/* Controllers */

function PageCtrl($scope) {
    $scope.navbar = { name: 'navbar.html', url: 'partials/navbar.html'};
}
// Injecting variables
PageCtrl.$inject = ['$scope'];

function AboutCtrl() {}
AboutCtrl.$inject = [];


function  MainCtrl($scope, $location,Twitt) {

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

}
MainCtrl.$inject = ['$scope','$location','Twitt'];
