package ru.easyjava.spring.inject;

import ru.easyjava.spring.Fine;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class AmbiguousInjectFine {
    @Inject
    @Named("fineDay")
    private Fine fine;

    public String getFine() { return fine.whatIsFine(); }

}
