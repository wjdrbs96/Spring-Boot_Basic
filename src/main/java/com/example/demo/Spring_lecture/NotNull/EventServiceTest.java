package com.example.demo.Spring_lecture.NotNull;

import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class EventServiceTest {

    @NotNull
    public String createEvent(@NotNull String name) {
        return "hello " + name;
    }
}
