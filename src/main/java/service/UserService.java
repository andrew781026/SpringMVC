package service;


import VO.Gender;
import VO.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private UserService(){}
    private static List<User> userList = initUserList();
    private static List<User> initUserList(){

        List<User> userList = new ArrayList<>();

        User user1 = new User(2013000001,"張三", Gender.M,"0911120111","台北市士林區");
        User user2 = new User(2013000002,"李四", Gender.M,"0911120112","新北市土城區");
        User user3 = new User(2013000003,"王五", Gender.M,"0911120113","新北市三重區");
        User user4 = new User(2013000004,"陳二", Gender.F,"0911120114","台北市信義區");
        User user5 = new User(2013000005,"孫九", Gender.F,"0911120115","台北市中山區");

        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);

        return userList;
    }

    public static List<User> list(){
        return userList ;
    }

}
