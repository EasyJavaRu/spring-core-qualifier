package ru.easyjava.spring.inject;

import org.springframework.stereotype.Component;
import ru.easyjava.spring.Fine;
import ru.easyjava.spring.FineDayQualifier;

import javax.inject.Inject;

@Component
public class AmbiguousInjectFine {
    @Inject
    @FineDayQualifier
    private Fine fine;

    public String getFine() { return fine.whatIsFine(); }

}
