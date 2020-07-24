package com.example.demo.Spring_lecture;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler {

    @EventListener
    @Async
    public void onApplicationEvent(MyEvent event) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트 받았습니다. 데이터는 " + event.getData());
    }
}
