package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		int km = 0;
		int age = 0;
				
		
		Scanner input = new Scanner(System.in);
		System.out.print("Quanti chilometri vuoi percorrere: ");
		km = input.nextInt();
		System.out.print("Quanti anni hai: ");
		age = input.nextInt();
		
		double ticketPrice = (km * 0.21);
		
		if(age < 18) {
				ticketPrice = (ticketPrice - (ticketPrice / 100 * 20));
		}
		else if(age > 65) {
			ticketPrice = (ticketPrice - (ticketPrice / 100 * 40));
		}
		
		
		System.out.println("Prezzo del biglietto:" + ticketPrice);
		
		input.close();
	}

}
