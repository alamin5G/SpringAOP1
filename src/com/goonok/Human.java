package com.goonok;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect 
@EnableAspectJAutoProxy
public class Human {

	//Known as Advise 
	@Before("execution(public void study())")
	public void wakeup() {
		System.out.println("Good Morning...");
	}
}
