package com.bridgelabz.designpatterns.singleton;

public class StaticBlockMain {
public static void main(String[] args) {
	StaticBlockSingleton blockSingleton=StaticBlockSingleton.getInstance();
	System.out.println(blockSingleton);
//	StaticBlockSingleton blockSingleton2=new StaticBlockSingleton();
}
}
