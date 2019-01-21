package com.bridgelabz.designpatterns.singleton;

public enum EnumSingleton {
INSTANCE;
    
    public static EnumSingleton doSomething(EnumSingleton in){
        if(in==INSTANCE) {
        	System.out.println("Instance created");
        	System.out.println(INSTANCE.hashCode());
        }
		return in;
    }


}
