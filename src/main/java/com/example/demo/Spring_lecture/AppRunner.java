package com.example.demo.Spring_lecture;

import com.example.demo.Spring_lecture.NotNull.EventServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    EventServiceTest eventServiceTest;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(eventServiceTest.createEvent(null));
    }
}