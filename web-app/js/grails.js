/**
 * Created with IntelliJ IDEA.
 * User: horacio
 * Date: 2/27/13
 * Time: 2:08 AM
 * To change this template use File | Settings | File Templates.
 */

// This is a module for JSON communication with grail frontend
angular.module('twittBreizhBeans.grails', ['ngResource']).

    factory('TwittList', function($resource) {
        var TwittList = $resource('/TwittBreizhBeansGrails/twitt/list',
            {  },
            { 'query' : {method: 'GET', isArray: false} });

        return TwittList;
    });