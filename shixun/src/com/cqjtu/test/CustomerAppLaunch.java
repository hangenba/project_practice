package com.cqjtu.test;


import com.cqjtu.service.CustomerService;
import com.cqjtu.util.CustomerUtils;

import java.util.Scanner;

public class CustomerAppLaunch {
    private static CustomerService cs=new CustomerService(4);

    public static void main(String[] args) {

        while (true){
            CustomerUtils.List();
            cs.dispathRequest();
        }

    }
}
