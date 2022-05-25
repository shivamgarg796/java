package com.question2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ticket tc=new Ticket();

		System.out.println("Enter no of bookings:");
		int numBook=sc.nextInt();
		
		System.out.println("Enter the available tickets:");
		int at=sc.nextInt();
		tc.setAvailableTickets(at);
		
		for(int i=0;i<numBook;i++) {
		System.out.println("Enter the ticketid:");
		int tid=sc.nextInt();
		
		System.out.println("Enter the price:");
		int p=sc.nextInt();
		tc.setPrice(p);
		
		System.out.println("Enter the no of tickets:");
		int not=sc.nextInt();
		
		
		System.out.println("Available tickets:"+tc.getAvailableTickets());
		
		
		System.out.println("Total Amount:"+tc.calculateTicketCost(not));
		
		System.out.println("Available Tickets after booking:"+tc.getAvailableTickets());
		}
		
		

	}

}
