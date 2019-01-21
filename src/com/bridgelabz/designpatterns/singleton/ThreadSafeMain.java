package com.bridgelabz.designpatterns.singleton;

public class ThreadSafeMain {
public static void main(String[] args) {
	ThreadSafeSingleton thread=ThreadSafeSingleton.getInstance();
	System.out.println(thread);
}
}
