package ru.easyjava.spring.resource;

import org.springframework.stereotype.Component;
import ru.easyjava.spring.Fine;

import javax.annotation.Resource;

@Component
public class AmbiguousResourceFine {
    @Resource
    private Fine fineDay;

    public String getFine() { return fineDay.whatIsFine(); }
}
