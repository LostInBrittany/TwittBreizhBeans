/**
 * Created with IntelliJ IDEA.
 * User: horacio
 * Date: 2/25/13
 * Time: 11:37 PM
 * To change this template use File | Settings | File Templates.
 */
// This is a module for cloud persistance in mongolab - https://mongolab.com
angular.module('twittBreizhBeans.mongolab', ['ngResource']).
    factory('Twitt', function($resource) {
        var Twitt = $resource('https://api.mongolab.com/api/1/databases' +
            '/testdb/collections/test',
            { apiKey: '1tH412ntVswsD7mRLLrTiILKvDfgHs-6' },
            {});

        return Twitt;
    });