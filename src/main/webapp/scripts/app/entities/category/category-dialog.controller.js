'use strict';

angular.module('refugeesApp').controller('CategoryDialogController',
    ['$scope', '$stateParams', '$uibModalInstance', 'entity', 'Category', 'Size',
        function($scope, $stateParams, $uibModalInstance, entity, Category, Size) {

        $scope.category = entity;
        $scope.sizes = Size.query();
        $scope.load = function(id) {
            Category.get({id : id}, function(result) {
                $scope.category = result;
            });
        };

        var onSaveSuccess = function (result) {
            $scope.$emit('refugeesApp:categoryUpdate', result);
            $uibModalInstance.close(result);
            $scope.isSaving = false;
        };

        var onSaveError = function (result) {
            $scope.isSaving = false;
        };

        $scope.save = function () {
            $scope.isSaving = true;
            if ($scope.category.id != null) {
                Category.update($scope.category, onSaveSuccess, onSaveError);
            } else {
                Category.save($scope.category, onSaveSuccess, onSaveError);
            }
        };

        $scope.clear = function() {
            $uibModalInstance.dismiss('cancel');
        };
}]);
