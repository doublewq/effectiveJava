package com.coderising.rule01;

import com.coderising.rule01.jdbc.Connection;
import com.coderising.rule01.jdbc.DriverManager;

/**
  * Copyright (C), since 2017, wenqing
  * FileName: DriverManagerTest
  * Author:   kingwen
  * Date:     11/19/17 9:03 PM
  * Description: 驱动测试类
  */
public class DriverManagerTest {
    public static void main(String[] args) throws Exception{
        Class.forName("com.coderising.rule01.jdbc.mysql.MySqlDriver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://127.0.0.1/testdb",
                "root","");
        System.out.println(connection);
    }
}
