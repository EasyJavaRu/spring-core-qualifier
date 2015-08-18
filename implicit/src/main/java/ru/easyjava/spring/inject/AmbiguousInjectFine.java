package ru.easyjava.spring.inject;

import org.springframework.stereotype.Component;
import ru.easyjava.spring.Fine;

import javax.inject.Inject;

@Component
public class AmbiguousInjectFine {
    @Inject
    private Fine fineDay;

    public String getFine() { return fineDay.whatIsFine(); }

}
