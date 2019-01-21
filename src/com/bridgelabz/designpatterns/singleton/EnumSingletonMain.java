package com.bridgelabz.designpatterns.singleton;

public class EnumSingletonMain {
	public static void main(String[] args) {
		EnumSingleton enumSingleton=(EnumSingleton) EnumSingleton.doSomething(EnumSingleton.INSTANCE);
	}

}
