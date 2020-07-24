package com.example.demo.Spring_lecture.Validator;

import com.example.demo.Spring_lecture.Sample.Event;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class EventValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Event.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // default 에러코드로 메세지를 찾지 못했을 때 사용함
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "title", "notempty", "Empty title is now allow");
    }
}
