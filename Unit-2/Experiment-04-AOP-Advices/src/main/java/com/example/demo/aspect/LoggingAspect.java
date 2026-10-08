package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.demo.service.StudentService.*(..))")
    public void beforeAdvice() {
        System.out.println("AOP @Before advice executed before StudentService method.");
    }
}
