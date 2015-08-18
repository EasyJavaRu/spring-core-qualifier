package ru.easyjava.spring.inject;

import org.springframework.stereotype.Component;
import ru.easyjava.spring.Fine;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class AmbiguousInjectFine {
    @Inject
    private List<Fine> fine;

    public String getFine() {
        return "Two options: " + fine.stream()
                .map(Fine::whatIsFine)
                .collect(Collectors.joining(" and "));
    }
}
