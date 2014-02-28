package com.taxi.booking;

import java.awt.*;
import javax.swing.*;

public class Controller extends JApplet
{
	private static final long serialVersionUID = 1L;
	
	//2 tabs 
	JTabbedPane tabs = new JTabbedPane();
	//2 Panels: 1.Log Bookings 2.Booking Status
	JPanel logBookings, bookingStatus;
	//5 Labels: 1.Name 2.Number 3.Door no. 4.Street 5.City
	JLabel custNameLabel, phoneNoLabel, doorNoLabel, streetLabel, cityLabel;
	//5 Text Fields 1.Name 2.Number 3.Door no. 4.Street 5.City
	JTextField custNameField, phoneNoField, doorNoField, streetField, cityField;
	
	public void init()
	{
		setSize(1000, 600);
		
		//Log Bookings panel, grid layout (5 rows x 2 columns)
		logBookings = new JPanel(new GridLayout(5, 2));
		//Booking Status panel
		bookingStatus = new JPanel();
		
		//--( Log bookings tab )--
		//Labels
		custNameLabel = new JLabel("Customer Name: ");
		phoneNoLabel = new JLabel("Phone Number: ");
		doorNoLabel = new JLabel("Door number: ");
		streetLabel = new JLabel("Street: ");
		cityLabel = new JLabel("City/Town: ");
		
		//Text fields
		custNameField = new JTextField("Enter name here", 30);
		phoneNoField = new JTextField("Enter phone number here", 30);
		doorNoField = new JTextField("Enter door number here", 30);
		streetField = new JTextField("Enter street here", 30);
		cityField = new JTextField("Enter city here", 30);
		
		//Add labels and text fields to Log Bookings panel
		logBookings.add(custNameLabel);
		logBookings.add(custNameField);
		
		logBookings.add(phoneNoLabel);
		logBookings.add(phoneNoField);
		
		logBookings.add(doorNoLabel);
		logBookings.add(doorNoField);
		
		logBookings.add(streetLabel);
		logBookings.add(streetField);
		
		logBookings.add(cityLabel);
		logBookings.add(cityField);
		
		//--( Booking Status tab )--
		bookingStatus.add(new JLabel("Booking Status Details"));
		
		//Add Log Bookings and Bookings Status panels to tabs
		tabs.add("Log Bookings", logBookings);
		tabs.add("Booking Status", bookingStatus);
		
		//Add tabs to overall container (ie. Applet)
		add(tabs);
	}
	
	//Method for drawing graphics on screen if needed
	public void paint(Graphics g)
	{
		super.paint(g);
		//g.drawString("Testing", 25, 30);
	}
	
	
}
