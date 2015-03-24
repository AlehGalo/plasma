'use strict';

angular.module('plasmaApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


