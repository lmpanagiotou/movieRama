angular.module('movieRama', ['resource.moviesResource'])
    .controller("movieRamaController", ['$scope', 'moviesResource', function ($scope, moviesResource) {

        moviesResource.getMovies().then(function(data){
            $scope.allMovies = data;
        });

        $scope.getFormattedDate = function (date) {
            date = date.slice(0, date.length - 5);
            var movieDate = new Date(date);
            return moment(movieDate).fromNow();
        };

    }]);
