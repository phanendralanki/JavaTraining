package com.oops.inheritance;

public class Execute {
	public static void main(String[] args) {
		//Parent  p = new Parent();
		//p.house();
		//p.car();
		//p.laptop();
		//p.phone();
		//p.bike();
		
//		Child c = new Child();
//		c.bike();
//		c.phone();
//		c.house();
//		//c.car();
//		c.laptop();
//		
//		System.out.println(c.bankBalance);
//		System.out.println(c.cash);
//		//System.out.println(c.withdraw);
//		System.out.println(c.personalExpense);
		
		
		//grand Parent
//		Child c = new Child();
//		c.farmHouse();
//		c.farmLand();
//		Parent pc = new Parent();
//		pc.farmHouse();
//		pc.farmLand();
//		System.out.println(c.cow);
//		System.out.println(pc.cow);
		
//		Hierarichal
		
	
		
		Parent p = new Parent();
		p.house();
		//p.bike();
		
		Child c1 = new Child();
		c1.house();
		c1.bike();
		
		Child2 c2 = new Child2();
//		Child2.study();
//		Child2.toys();
//		Child2.house();
		c2.house();
		c2.toys();
	}
}
