package com.goonok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
	Student st = context.getBean("student", Student.class);
	
	Employee em = context.getBean("employee", Employee.class);
	
	//join points (before) because here the advise will call
	st.studyAnything();
	//join points (after)

	System.out.println();
	
	//join points (before) because here the advise will call
	em.studySomething();
	//join points (after)
	}

}
