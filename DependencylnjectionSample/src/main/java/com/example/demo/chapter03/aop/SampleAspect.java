package com.example.demo.chapter03.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class SampleAspect {

	@Before("execution(* com.exemple.demo.chapter03.used.*Greet.*(..))")
	public void beforeAdvice(JoinPoint joinPoint) {

		System.out.println("--Before Advice--");

		System.out.println(String.format("メソッド:%s", joinPoint.getSignature().getName()));
		}
	}



