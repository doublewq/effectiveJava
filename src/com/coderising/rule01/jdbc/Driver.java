package com.coderising.rule01.jdbc;

/**
 * Copyright (C), since 2017, wenqing
 * FileName: Driver
 * Author:   kingwen
 * Date:     11/19/17 9:33 PM
 * Description: 驱动
 */
public interface Driver {
    Connection getConnetcion(String url,String name,String passwd);
}
