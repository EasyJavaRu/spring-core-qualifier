package ru.easyjava.spring.resource;

import org.springframework.stereotype.Component;
import ru.easyjava.spring.Fine;

import javax.annotation.Resource;

@Component
public class AmbiguousResourceFine {
    @Resource(name = "fineDay")
    private Fine fine;

    public String getFine() { return fine.whatIsFine(); }
}
