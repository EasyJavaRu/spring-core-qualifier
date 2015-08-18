package ru.easyjava.spring.resource;

import ru.easyjava.spring.Fine;

import javax.annotation.Resource;
import javax.inject.Named;

@Named
public class AmbiguousResourceFine {
    @Resource
    @Named("fineDay")
    private Fine fine;

    public String getFine() { return fine.whatIsFine(); }
}
