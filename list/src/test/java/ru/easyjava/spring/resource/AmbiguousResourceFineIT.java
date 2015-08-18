package ru.easyjava.spring.resource;

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
public class AmbiguousResourceFineIT {
    @Inject
    private ApplicationContext context;

    @Configuration
    @ComponentScan("ru.easyjava.spring.resource")
    public static class SpringConfig {
        @Bean
        public FineDay fineDay() { return new FineDay(); }

        @Bean
        public HeavyFine hardFine() { return new HeavyFine(); }
    }

    @Test
    public void testSpring() {
        AmbiguousResourceFine testedObject = context.getBean(AmbiguousResourceFine.class);

        assertThat(testedObject.getFine(), is("Two options: A day is fine and A fine is heavy"));
    }
}