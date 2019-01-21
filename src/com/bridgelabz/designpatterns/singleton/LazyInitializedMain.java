package com.bridgelabz.designpatterns.singleton;

public class LazyInitializedMain {
	public static void main(String[] args) {
		LazyInitializedSingleton singleton=LazyInitializedSingleton.getInstance();
		System.out.println(singleton);
		//LazyInitializedSingleton lazyInitializedSingleton=new LazyInitializedSingleton();
	}

}
