package ru.easyjava.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.easyjava.spring.Fine;

@Component
public class AmbiguousAutowiredFine {
    @Autowired
    private Fine fine;

    public String getFine() { return fine.whatIsFine(); }
}
