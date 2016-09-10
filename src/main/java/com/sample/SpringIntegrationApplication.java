package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationApplication.class, args);
		//runDemo("message-generator-demo.xml");
		//runDemo("queue-demo.xml");
		runDemo("wire-tap-demo.xml");
	}

	private static void runDemo(String springXMLFile) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(springXMLFile);
		try {
			Thread.sleep(10 * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		((ClassPathXmlApplicationContext) ac).close();
	}
}
