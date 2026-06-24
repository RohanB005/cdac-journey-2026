package com.app.main;

import com.app.dao.MyUserDAO;
import com.app.model.MyUser;

public class App {

    public static void main(String[] args) {

        MyUser user = new MyUser();

        user.setId(1);
        user.setName("Rohan");
        user.setMobile("9665433586");
        user.setEmail("rohanbarkade80@gmail.com");

        MyUserDAO dao = new MyUserDAO();

        dao.saveUser(user);
    }
}