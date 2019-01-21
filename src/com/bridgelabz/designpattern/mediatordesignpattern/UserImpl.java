package com.bridgelabz.designpattern.mediatordesignpattern;

public class UserImpl extends User {

	public UserImpl(ChatMediator med, String name) {
		super(med, name);
	}

	@Override
	public void send(String msg){
		System.out.println(this.name+": Sending Message="+msg);
		mediator.sendMessage(msg, this);
	}
	public void receive(String msg) {
		System.out.println(this.name+": Received Message:"+msg);
	}

}
