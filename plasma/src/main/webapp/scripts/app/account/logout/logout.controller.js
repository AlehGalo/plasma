'use strict';

angular.module('plasmaApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });
