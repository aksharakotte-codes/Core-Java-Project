package com.multithreading;

class BookMyShow {
	
	int total_avaliable_Tickets = 10;
	
	synchronized void bookMyTicket(String name, int tickets) {
		
		if(total_avaliable_Tickets >= tickets) {
			System.out.println(tickets + "Tickets has booked Successfully for Ms. " + name);
			
			total_avaliable_Tickets = total_avaliable_Tickets - tickets;
			System.out.println("Remaining Tickets Count is : " + total_avaliable_Tickets);
		} else {
			System.err.println("Sorry !! All tickets has been sold out for Ms. " + name);
			System.err.println("Remaining Tickets Count is : " + total_avaliable_Tickets);
		}
		
	}
	
}

class Customer extends Thread{ 
	
	BookMyShow bms;
	String customerName;
	int tickets;
	public Customer(BookMyShow bms, String customerName, int tickets) {
		super();
		this.bms = bms;
		this.customerName = customerName;
		this.tickets = tickets; 
	}
	
	@Override
	public void run() {
		bms.bookMyTicket(customerName, tickets);
	}
	
}
public class TestBookMyShowDemo {


	public static void main(String[] args) {
		System.out.println("Main Method Started !!");
	    BookMyShow bms = new BookMyShow();
		
		Customer c1 = new Customer(bms, "Akshara", 5);
		c1.start();
		
		Customer c2 = new Customer(bms, "Vyshanvi", 3);
		c2.start();
		
		Customer c3 = new Customer(bms, "Honey", 3);
		c3.start();
		
		System.out.println("Main Method Ended !!");
	}

}
