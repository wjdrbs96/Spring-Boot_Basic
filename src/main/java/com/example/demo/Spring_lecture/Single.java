package com.example.demo.Spring_lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {

    @Autowired
    private Proto proto;



    public Proto getProto() {
        return proto;
    }
}
