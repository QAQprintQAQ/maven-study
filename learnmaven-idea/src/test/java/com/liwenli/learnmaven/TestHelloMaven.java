package com.liwenli.learnmaven;

import com.liwenli.learnmaven.*;
import org.junit.Test;

public class TestHelloMaven {

    public static void main(String[] args) {
        //这个main函数也可以用来测试，但是我们这里不用main函数，而用junit测试！
        System.out.println("========main test addNumber======");

    }

    @Test//需要导入junit包
    public void testAddNumber(){

        HelloMaven helloMaven = new HelloMaven();
        int result = helloMaven.addNumber(3, 7);
        System.out.println("======junit test addNumber======");
        System.out.println(result);

    }
}

