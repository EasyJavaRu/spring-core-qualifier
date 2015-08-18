package ru.easyjava.spring;

import org.springframework.stereotype.Component;

@Component
@FineDayQualifier
public class FineDay implements Fine {
    @Override
    public String whatIsFine() {
        return "A day is fine";
    }
}
