package com.mogualafric.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class PaymentApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(PaymentApplication.class, args);

		MyNewClass myNewClass = ctx.getBean(MyNewClass.class);
		myNewClass.sayHello();  // Correct method name and case
	}

	@Bean
	public MyNewClass myNewClass(){
		return new MyNewClass();
	}
}
