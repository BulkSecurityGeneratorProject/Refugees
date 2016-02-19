'use strict';

angular.module('refugeesApp')
    .factory('Offer', function ($resource, DateUtils) {
        return $resource('api/offers/:id', {}, {
            'query': { method: 'GET', isArray: true},
            'get': {
                method: 'GET',
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    data.expiration = DateUtils.convertDateTimeFromServer(data.expiration);
                    return data;
                }
            },
            'update': { method:'PUT' }
        });
    });
