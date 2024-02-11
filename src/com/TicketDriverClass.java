package com;

import java.util.Scanner;

public class TicketDriverClass 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		UserDetails userDetailsObject=new UserDetails();
		boolean status=true;
		while(status)
		{
			System.out.println();
			System.out.println("-------------------------------------------------------WELCOME TO TICKET RESERVATION SYSTEM----------------------------------------------");
			System.out.println("Enter your choice: \n 1: Book ticket \n 2: Display ticket \n 3: Change BoardingPoint \n 4: Change DestinationPoint \n 5: Change Journey Date \n 6: Cancel ticket \n 7: Journey Details \n 8:Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					{
						System.out.println("Enter your name: ");
						String name=sc.next();
						System.out.println("Enter your age: ");
						int age=sc.nextInt();
						System.out.println("Enter your gender: ");
						String gender=sc.next();
						System.out.println("Enter your journery date: ");
						String date=sc.next();
						System.out.println("Ticket Number: ");
						int ticketNumber=sc.nextInt();
						System.out.println("SeatNo: ");
						int seatNo=sc.nextInt();
						System.out.println("Destination point: ");
						String destinationPoint=sc.next();
						System.out.println("Boarding point: ");
						String boardingPoint=sc.next();
						
						userDetailsObject.bookTicket(new Ticket(name, age, gender, ticketNumber, seatNo, date, destinationPoint, boardingPoint));
						System.out.println();
					}
				break;
				
				case 2:
					{
						userDetailsObject.displayTicket();
						System.out.println();
						
					}
				break;
				
				case 3:
					{
						System.out.println("Enter your ticket number: ");
						int ticketId=sc.nextInt();
						userDetailsObject.changeBoardingStation(ticketId);
						System.out.println();
						
					}
				break;
				
				case 4:
					{
						System.out.println("Enter your ticket number: ");
						int ticketId=sc.nextInt();
						userDetailsObject.changeDestinationStation(ticketId);
						System.out.println();
					}
				break;
				
				case 5:
					{
						System.out.println("Enter your ticket number: ");
						int ticketId=sc.nextInt();
						userDetailsObject.changeDate(ticketId);
						System.out.println();
						
					}
				break;
				
				case 6:
				{
					System.out.println("Enter your ticket number: ");
					int ticketId=sc.nextInt();
					userDetailsObject.cancelTicket(ticketId);
					System.out.println();
					
				}
				break;
				
				case 7:
				{
					System.out.println("Enter your ticket number: ");
					int ticketId=sc.nextInt();
					userDetailsObject.displayJourneyDetails(ticketId);
					System.out.println();
					
				}
				break;
				
				case 8:
				{
					System.out.println("THANK YOU");
					System.out.println();
				}
				break;
				
				default:
				{
					System.out.println("Enter correct choice.");
				}
			}
		}
		
	}
}
