package ru.easyjava.spring.inject;

import org.springframework.stereotype.Component;
import ru.easyjava.spring.Fine;

import javax.inject.Inject;

@Component
public class AmbiguousInjectFine {
    @Inject
    private Fine fine;

    public String getFine() { return fine.whatIsFine(); }

}
