package com.ali.design.chapter_06.v02;

public class App {
	
	public static void main(String[] args) {
		Person pp =new Person("小菜");
		
		Tshirt tshirt=new Tshirt();
		BigTrouser bigTrouser=new BigTrouser();
		
		tshirt.decorate(pp);
		bigTrouser.decorate(tshirt);
		bigTrouser.show();
		
	}

}
