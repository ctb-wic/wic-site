var wicApp = angular.module('wicApp', ['ngRoute', 'ngResource', 'ui.bootstrap.tabs', 'WicApplication.Topic']);

wicApp.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/showTopic', {
        templateUrl: '/apps/seminar/topic/index.html',
        controller: 'TopicCtrl'
      }).
      when('/mypage', {
        templateUrl: '/apps/user/mypage.html',
        controller: 'MyPageCtrl'
      }).
      otherwise({
        redirectTo: '/showTopic'
      });
  }
]);

wicApp.controller('MyPageCtrl', function($scope) {
  $scope.message = 'My Page ...';
});