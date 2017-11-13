package com.icicibank.loans.homeloans;

public class HomeLoans extends Abstract

{ // class is a collection of objects 
	//class plan contains properties & behavior
	
	int sal = 60000;
	public void TotalSal()
	
	{
	System.out.println("Per annum salary");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeLoans obj = new HomeLoans();
		obj.TotalSal();
        System.out.println(obj.sal);
        
        HomeLoans obj1 = new HomeLoans();
		obj1.TotalSal();
        System.out.println(obj1.sal);
        obj1.TotalSal();
	}

	public void Totalsal() {
		// TODO Auto-generated method stub
		System.out.println("I have implimented sal  emthod from HomePackage Interface");
		
	}

}
