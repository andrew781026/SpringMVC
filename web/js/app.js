/**
 * Created by andrew on 2017/3/24.
 */


var userApp = angular.module('userApp',[]);

userApp.controller('MainCtrl',['$http',function ($http) {
    var self = this ;

    self.users = [] ;

    self.query = {
        gender: '男',
        name:'',
        phoneNumber:''
    };

    self.search = function () {

        /*
        var querys = {
            name:$('#name').val(),
            phoneNumber:$('#phoneNumber').val(),
            gender:$('input[name=gender]:checked').val()
        };



        console.log( querys );
        */

        $http({
            method: 'GET',
            url: './users.do',
            params: self.query
        }).success(function (data, status, header, config) {
            console.log(data.data);
            self.users = data.data ;
        }).error(function (data, status, header, config) {
            console.log('Ajax request 發生錯誤');
        });

    };

    self.search();



}]);