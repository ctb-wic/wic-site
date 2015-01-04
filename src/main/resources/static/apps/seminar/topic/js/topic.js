/**
 * 
 */
var topicApp = angular.module('WicApplication.Topic', ['ngResource']);

topicApp.controller("TopicCtrl", function($scope, $http) {

  function findAllTopics() {
    $http.get('/api/topics').success(function(data, status, headers, config) {
      if(data._embedded != null){
        $scope.infos = data._embedded.topics;
      }
    })
    .error(function(data, status, headers, config) {
    });
  }
  
  $scope.newTopic = function() {
    $http.post('/api/topics', {'name': $scope.topicname})
      .success(function(data, status, headers, config) {
        findAllTopics();
      }).error(function(data, status) {
      });
  };
  
  findAllTopics();
});