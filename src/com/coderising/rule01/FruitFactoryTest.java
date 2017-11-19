package com.coderising.rule01;

import com.coderising.rule01.api.Fruit;
import com.coderising.rule01.api.FruitFactory;

/**
  * Copyright (C), since 2017, wenqing
  * FileName: FruitFactoryTest
  * Author:   kingwen
  * Date:     11/18/17 8:14 PM
  * Description: test
  */
public class FruitFactoryTest {
    public static void main(String[] args) {
        Fruit f1= FruitFactory.create(2);
        System.out.println(f1);
        System.out.println("aaa");
    }
}
