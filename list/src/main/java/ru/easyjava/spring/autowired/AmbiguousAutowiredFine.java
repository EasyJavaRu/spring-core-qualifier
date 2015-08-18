package ru.easyjava.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.easyjava.spring.Fine;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AmbiguousAutowiredFine {
    @Autowired
    private List<Fine> fine;

    public String getFine() {
        return "Two options: " + fine.stream()
                .map(Fine::whatIsFine)
                .collect(Collectors.joining(" and "));
    }
}
