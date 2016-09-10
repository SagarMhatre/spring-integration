package com.sample;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageGenerator {

	private SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

	public String generateHelloWorldMessage() {
		return "Hello World\t" + sdf.format(Calendar.getInstance().getTime());
	}

}
