package com.goonok;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect // known as aspect
@EnableAspectJAutoProxy
public class Human {

	//Known as Advise 
	//if we specify the qualified name of the class before the function
	//it will only call that classes method according to cross-cutting concept
	@Before("myPointCuts()")
	public void wakeup(JoinPoint j) {
		System.out.println("Good Morning..." + j.getSignature()); //using joinPoint we can get any information
	}
	
	@After("myPointCuts()")
	public void sleep() {
		System.out.println("Good Night...");
	}
	
	@Pointcut("execution(public * study*(..))")
	public void myPointCuts() {
		
	}
}
