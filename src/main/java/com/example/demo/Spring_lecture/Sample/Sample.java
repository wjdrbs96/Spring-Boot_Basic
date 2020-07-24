package com.example.demo.Spring_lecture.Sample;

import org.springframework.stereotype.Component;

@Component
public class Sample {
    private int data = 200;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
