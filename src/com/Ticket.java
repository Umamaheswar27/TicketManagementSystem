package com;

public class Ticket 
{
	private String name;
	private int age;
	private String gender;
	private int ticketNumber;
	private int seatNo;
	private  String date;
	private String destinationPoint;
	private String boardingPoint;
	
	
	public Ticket()
	{
		
	}
	
	
	public Ticket(String name, int age, String gender, int ticketNumber, int seatNo, String date,
			String destinationPoint, String boardingPoint) 
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.ticketNumber = ticketNumber;
		this.seatNo = seatNo;
		this.date = date;
		this.destinationPoint = destinationPoint;
		this.boardingPoint = boardingPoint;
	}

	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}


	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	 * @return the ticketNumber
	 */
	public int getTicketNumber() {
		return ticketNumber;
	}


	/**
	 * @param ticketNumber the ticketNumber to set
	 */
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}


	/**
	 * @return the seatNo
	 */
	public int getSeatNo() {
		return seatNo;
	}


	/**
	 * @param seatNo the seatNo to set
	 */
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}


	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}


	/**
	 * @return the destinationPoint
	 */
	public String getDestinationPoint() {
		return destinationPoint;
	}


	/**
	 * @param destinationPoint the destinationPoint to set
	 */
	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}


	/**
	 * @return the boardingPoint
	 */
	public String getBoardingPoint() {
		return boardingPoint;
	}


	/**
	 * @param boardingPoint the boardingPoint to set
	 */
	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}


	public void displayTicketDetails()
	{
		System.out.println("Name				: "+name);
		System.out.println("Age					: "+age);
		System.out.println("Gender				: "+gender);
		System.out.println("Date				: "+date);
		System.out.println("Ticket Number		: "+ticketNumber);
		System.out.println("SeatNo				: "+seatNo);
		System.out.println("Destination point: "+destinationPoint);
		System.out.println("Boarding point	: "+boardingPoint);
		
	}
	
	
}
