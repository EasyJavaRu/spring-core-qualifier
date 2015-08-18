package ru.easyjava.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import ru.easyjava.spring.Fine;

import javax.inject.Named;

@Named
public class AmbiguousAutowiredFine {
    @Autowired
    @Named("fineDay")
    private Fine fine;

    public String getFine() { return fine.whatIsFine(); }
}
