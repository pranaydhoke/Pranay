package com.pranay;

import java.util.Arrays;
import java.util.HashMap;



public class SeatsBooked {
	public static void main(String[] args) {
		
		int[] numbertobookseat = {1, 2, 3};
		int bookSeatNo=4;
		int[] seatsAvailable = new int[30];
		
		for(int i=0;i<seatsAvailable.length;i++)
		{
			seatsAvailable[i] = 0;
			System.out.println("seats available the seat"+i);
		}
		System.out.println("seats available the seat"+seatsAvailable);
		bookedSeats(seatsAvailable,numbertobookseat);

	}
	
	 private static int[] bookedSeats(int[] seatsAvailable,int[] numbertobookseat) {
		 for(int i=0;i<seatsAvailable.length;i++)
		 {
			 for(int seat: numbertobookseat)
			 {
				 if(i==seat)
				 {
					 seatsAvailable[i]=1;
					 i=i+1;
				 }
			 }
			 
			
			
		 }
		 //bookedSeats(seatsAvailable,numbertobookseat);
		return seatsAvailable;
	 }

}
