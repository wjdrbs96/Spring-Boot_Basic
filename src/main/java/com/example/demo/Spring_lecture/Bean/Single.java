package com.example.demo.Spring_lecture.Bean;

import com.example.demo.Spring_lecture.Bean.Proto;
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
