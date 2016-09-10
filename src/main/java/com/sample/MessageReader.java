package com.sample;

public class MessageReader {

	private String name;

	public void printMessage(String message) {
		System.out.println("Mesage received : " + message);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printMessagetoConsoleWithName(String message) {
		System.out.println(name + "\t Mesage received : " + message);
	}

}
