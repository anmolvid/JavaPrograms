package com.bridgelabz.designpatterns.singleton;

public class EagerInitializedMain {
public static void main(String[] args) {
	EagerInitialization eagerInitialization=EagerInitialization.getInstance();
	System.out.println(eagerInitialization);
	System.out.println(eagerInitialization.hashCode());
	EagerInitialization eagerInitialization2=EagerInitialization.getInstance();
	System.out.println(eagerInitialization2);
	System.out.println(eagerInitialization2.hashCode());

}
}
