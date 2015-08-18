package ru.easyjava.spring;

import org.springframework.stereotype.Component;

@Component
public class HeavyFine implements Fine {
    @Override
    public String whatIsFine() {
        return "A fine is heavy";
    }
}
