package com;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class UserDetails 
{
	Ticket ticketObject;
	
	public UserDetails()
	{
		
	}
	
	public UserDetails(Ticket ticketObject) 
	{
	
		this.ticketObject = ticketObject;
	}

	/**
	 * @return the tickeObject
	 */
	public Ticket getTicketObject() {
		return ticketObject;
	}

	/**
	 * @param tickeObject the tickeObject to set
	 */
	public void setTickeObject(Ticket tickeObject) {
		this.ticketObject = tickeObject;
	}




	Scanner sc=new Scanner(System.in);
	ArrayList<Ticket> ticketArrayObject=new ArrayList<Ticket>();
	
	
	/*-----------------------------------------------Booking the ticket*----------------------------------------------*/
	
	public void bookTicket(Ticket ticketObject)
	{
		ticketArrayObject.add(ticketObject);
		System.out.println("Ticked booked succesfully");
	}
	
	 
	/*----------------------------------------------Displaying ticket details------------------------------------------*/
	
	public void displayTicket()
	{
		if(ticketArrayObject.isEmpty())
		{
			throw new NoTicketBookedException();
		}
		else
		{
			for(Ticket ticket:ticketArrayObject)
			{
				ticket.displayTicketDetails();
			}
		}
	}
	
	
	
	/*--------------------------------------------Changing boarding station------------------------------------------*/
	
	public void changeBoardingStation(int ticketId)
	{
		ListIterator<Ticket> listIteratorCursor=ticketArrayObject.listIterator();
		boolean isTicket=false;
		if(ticketArrayObject.isEmpty())
		{
			throw new NoTicketBookedException();
		}
		else
		{
			while(listIteratorCursor.hasNext())
			{
				Ticket ticket=listIteratorCursor.next();
				if(ticket.getTicketNumber()==ticketId)
				{
					System.out.println("Enter the  new boarding station: ");
					String newBoarding=sc.next();
					ticket.setBoardingPoint(newBoarding);
					System.out.println("Boarding changed successfully");
					isTicket=true;
				}
			}
		}
		if(isTicket==false)
		{
			throw new InvalidTicketNumberException();
		}
		
	}
	
	
	
	/*----------------------------------------Change Destination address*--------------------------------------------*/
	
	public void changeDestinationStation(int ticketId)
	{
		ListIterator<Ticket> listIteratorCursor=ticketArrayObject.listIterator();
		boolean isChanged=false;
		if(ticketArrayObject.isEmpty())
		{
			throw new NoTicketBookedException();
		}
		else
		{
			while(listIteratorCursor.hasNext())
			{
				Ticket ticket=listIteratorCursor.next();
				if(ticket.getTicketNumber()==ticketId)
				{
					System.out.println("Enter the  new destination station: ");
					String newDestination=sc.next();
					ticket.setDestinationPoint(newDestination);
					System.out.println("Destination changed successfully");
					isChanged=true;
				}
			}
		}
		if(isChanged==false)
		{
			throw new InvalidTicketNumberException();
		}
	}
	
	
	
	/*----------------------------------------------Change journey date-----------------------------------------------*/
	
	public void changeDate(int ticketId)
	{
		ListIterator<Ticket> listIteratorCursor=ticketArrayObject.listIterator();
		boolean isChanged=false;
		if(ticketArrayObject.isEmpty())
		{
			throw new NoTicketBookedException();
		}
		else
		{
			while(listIteratorCursor.hasNext())
			{
				Ticket ticket=listIteratorCursor.next();
				if(ticket.getTicketNumber()==ticketId)
				{
					System.out.println("Enter the  new date: ");
					String newDate=sc.next();
					ticket.setDate(newDate);
					System.out.println("Date changed successfully");
					isChanged=true;
				}
			}
		}
		if(isChanged==false)
		{
			throw new InvalidTicketNumberException();
		}
	}
	
	
	
	/*----------------------------------------------Cancel ticket----------------------------------------------------*/
	
	public void cancelTicket(int ticketId)
	{
		ListIterator<Ticket> listIteratorCursor=ticketArrayObject.listIterator();
		boolean isCancelled=false;
		if(ticketArrayObject.isEmpty())
		{
			throw new NoTicketBookedException();
		}
		else
		{
			while(listIteratorCursor.hasNext())
			{
				Ticket ticket=listIteratorCursor.next();
				if(ticket.getTicketNumber()==ticketId)
				{
					listIteratorCursor.remove();
					System.out.println("Ticker cancelled successfully");
					isCancelled=true;
				}
			}
			
		}
		if(isCancelled==false)
		{
			throw new InvalidTicketNumberException();
		}
	}
	
	
	
	/*------------------------------------------Displaying particular ticket-------------------------------------------*/
	
	public void displayJourneyDetails(int ticketId)
	{
		boolean isTicketCheck=false;
		if(ticketArrayObject.isEmpty())
		{
			throw new NoTicketBookedException();
		}
		else
		{
			for(Ticket ticket:ticketArrayObject)
			{
				if(ticket.getTicketNumber()==ticketId)
				{
					ticket.displayTicketDetails();
					isTicketCheck=true;
				}
			}
		}
		if(isTicketCheck==false)
		{
			throw new InvalidTicketNumberException();
		}
	}
}
