'use strict';


// Declare app level module which depends on filters, and services
angular.module('twittBreizhBeans', ['twittBreizhBeans.filters', 'twittBreizhBeans.services',
                'twittBreizhBeans.directives', 'twittBreizhBeans.grails']).
  config(['$routeProvider', function($routeProvider) {
		$routeProvider.when('/about', {templateUrl: 'partials/about', controller: AboutCtrl});
        $routeProvider.when('/signing', {templateUrl: 'partials/signing', controller: SigningCtrl});
        $routeProvider.when('/main', {templateUrl: 'partials/main', controller: MainCtrl});
        $routeProvider.otherwise({redirectTo: '/main'});
  }]);
