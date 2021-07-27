angular.module('resource.moviesResource', [])
    .factory('moviesResource', ['$http',
        function ($http) {
            "use strict";

            return {
                getMovies : function () {
                    return $http.get('http://localhost:8080/MovieRama/api/actions/movies').then(function (response) {
                        return response.data;
                    });
                }
            }
        }
    ]);