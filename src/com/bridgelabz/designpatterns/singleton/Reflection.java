package com.bridgelabz.designpatterns.singleton;

import java.lang.reflect.Constructor;

public class Reflection {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		EagerInitialization instanceOne = EagerInitialization.getInstance();
		@SuppressWarnings("unused")
		EagerInitialization instanceTwo = null;
        try {
            @SuppressWarnings("rawtypes")
			Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
            for (@SuppressWarnings("rawtypes") Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitialization) constructor.newInstance();
                System.out.println(instanceTwo);
                System.out.println(instanceOne);
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
	

}
	}
}
