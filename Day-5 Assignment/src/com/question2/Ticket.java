package com.question2;

public class Ticket {

	 private int ticketid; 
	 private int price; 
	 private static int availableTickets; 
	 
	 public void setTicketId(int ticketid) {
		 this.ticketid=ticketid;
	 }
	 public int getticketid() {
		 return ticketid;
	 }
	 
	 public void setPrice(int price) {
		 this.price=price;
	 }
	 public int getPrice() {
		 return price;
	 }
	 
	 public void setAvailableTickets(int availableTickets) {
		 if(availableTickets>0)
		 Ticket.availableTickets=availableTickets;
	 }
	 public int getAvailableTickets() {
		 return availableTickets;
	 }
	 
	 public int calculateTicketCost(int nooftickets) {
		 if(getAvailableTickets()==0) {
			 return -1;
		 }
		 else {
			 int leftTickets=getAvailableTickets()-nooftickets;
			 setAvailableTickets(leftTickets);
			 int totalAmount=nooftickets*getPrice();
			 return totalAmount;
		 }
	 }
}
