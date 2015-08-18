package ru.easyjava.spring.autowired;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.easyjava.spring.FineDay;
import ru.easyjava.spring.HeavyFine;

import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class AmbiguousAutowiredFineIT {
    @Inject
    private ApplicationContext context;

    @Configuration
    @ComponentScan("ru.easyjava.spring.autowired")
    public static class SpringConfig {
        @Bean
        public FineDay fineDay() { return new FineDay(); }

        @Bean
        public HeavyFine hardFine() { return new HeavyFine(); }
    }

    @Test
    public void testSpring() {
        AmbiguousAutowiredFine testedObject = context.getBean(AmbiguousAutowiredFine.class);

        assertThat(testedObject.getFine(), is("A day is fine"));
    }
}