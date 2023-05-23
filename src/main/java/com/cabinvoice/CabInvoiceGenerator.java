package com.cabinvoice;

public class CabInvoiceGenerator {
	
	public static final double costperkm = 10.0;
	public static final double costpermin = 1.0;
	public static final double min_fare = 5.0;
	
	public double calculateFare(double distance,int time) {
		double totalfare = (distance * costperkm) + (time * costpermin);
			if(totalfare < 5) {
				return min_fare;
			}
			return totalfare;
			}
	}
	


