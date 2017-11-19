package com.coderising.rule01.api;/**
  * Copyright (C), since 2017, wenqing
  * FileName: FruitFactory
  * Author:   kingwen
  * Date:     11/18/17 8:05 PM
  * Description: 工厂类
  */
public class FruitFactory {

    public static Fruit create(int type) {
        if(type==1){
            return new Apple();
        }
        if(type==2){
            return new Orange();
        }
        return null;
    }
}
