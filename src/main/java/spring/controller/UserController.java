package spring.controller;


import VO.Gender;
import VO.ReturnParam;
import VO.User;
import org.springframework.web.bind.annotation.*;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {


    // 參考網頁 -- http://www.mkyong.com/spring-mvc/spring-3-mvc-and-json-example/
    @RequestMapping("/users")
    public @ResponseBody ReturnParam queryUser( @RequestParam(value = "name",defaultValue = "") String name ,
                                                @RequestParam(value = "phoneNumber",defaultValue = "") String phoneNumber ,
                                                @RequestParam(value = "gender",defaultValue = "") String gender  ) {

        List<User> userList = UserService.list();
        List<User> returnList = new ArrayList<>();
        boolean flag = true ;
        System.out.println("userList = " + userList);

        for ( User user : userList ){

            if ( name != null && !"".equals(name) ){
                System.out.println("name = " + name);
                flag = String.valueOf( user.getName() ).contains(name);
            }

            if ( phoneNumber != null && !"".equals(phoneNumber) && flag != false ){
                System.out.println("phoneNumber = " + phoneNumber);
                flag = String.valueOf( user.getPhoneNumber() ).contains(phoneNumber);
            }

            if ( gender != null && !"".equals(gender)  && flag != false ){
                System.out.println("gender = " + gender);
                System.out.println("user.getGender() = " + user.getGender());
                flag = String.valueOf( user.getGender() ).equalsIgnoreCase(gender);
            }

            if ( flag ){
                returnList.add(user);
            }

            flag = true ;
        }

        ReturnParam<User> returnParam = new ReturnParam<>();
        returnParam.setData(returnList);

        return returnParam ;
    }




}