package com.josamtechie.springbootdemo.service;

import com.josamtechie.springbootdemo.constants.Constants;
import org.springframework.stereotype.Service;

@Service
public class CacheService {

    public String postMethod(){
        //caching

        if(Constants.CONSTANT_MAP.get("MyKey") ==null){
            Constants.CONSTANT_MAP.put("MyKey","Data set in my cache..");
            System.out.println(Constants.CONSTANT_MAP.get("MyKey")+"Step 1 -->>set to Cache");
        }else{
            System.out.println(Constants.CONSTANT_MAP.get("MyKey")+"Step 2 -->>get from Cache");
        }

        return "Hello Viewers";
    }
}
