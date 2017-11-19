package com.coderising.rule01.jdbc;

import java.util.ArrayList;
import java.util.List;

/**
  * Copyright (C), since 2017, wenqing
  * FileName: DriverManager
  * Author:   kingwen
  * Date:     11/19/17 9:08 PM
  * Description: 驱动管理
  */
public class DriverManager {
    private static final List<Driver> drivers=new ArrayList<Driver>();

    public static void registerDriver(Driver driver){
        drivers.add(driver);
    }

    public static Connection getConnection(String url,String name,String passwd){

        for (Driver aDriver:drivers){
            Connection conn=aDriver.getConnetcion(url,name,passwd);
            if(conn!=null){
                return conn;
            }
        }
        return null;
    }
}
