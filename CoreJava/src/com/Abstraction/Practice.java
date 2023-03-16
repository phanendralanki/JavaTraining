package com.Abstraction;

class Practice extends Abstract{
	public void Reason() {
		System.out.println("working");
	}
	
	public static void main(String[] args) {
		Abstract.leaveDate();
		Abstract.leaveRequest();
		Practice p = new Practice();
		p.Reason();
		
	}
	
}
