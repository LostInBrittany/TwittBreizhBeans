'use strict';


// Declare app level module which depends on filters, and services
angular.module('twittBreizhBeans', ['twittBreizhBeans.filters', 'twittBreizhBeans.services',
                'twittBreizhBeans.directives', 'twittBreizhBeans.grails']).
  config(['$routeProvider', function($routeProvider) {
		$routeProvider.when('/about', {templateUrl: 'partials/about.html', controller: AboutCtrl});
    $routeProvider.when('/main', {templateUrl: 'partials/main.html', controller: MainCtrl});
    $routeProvider.otherwise({redirectTo: '/main'});
  }]);
