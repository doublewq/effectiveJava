package com.coderising.rule01.jdbc.mysql;

import com.coderising.rule01.jdbc.Connection;
import com.coderising.rule01.jdbc.Driver;
import com.coderising.rule01.jdbc.DriverManager;

/**
  * Copyright (C), since 2017, wenqing
  * FileName: MySqlDriver
  * Author:   kingwen
  * Date:     11/19/17 9:10 PM
  * Description: 我的sql驱动
  */
public class MySqlDriver implements Driver{
    static {
        DriverManager.registerDriver(new MySqlDriver());
    }


    @Override
    public Connection getConnetcion(String url, String name, String passwd) {
        if(url.contains("mysql")){
            return new MysqlConnection();
        }
        return null;
    }
}
