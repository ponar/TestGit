package com.jarek;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("To jest g³ówna klasa ");
		System.out.println("Aktualna data jest dzisiaj:");
		metoda();
		//
		my_version();
	}
	//
	public static void metoda(){
		//
		Date today = new Date();
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
		String date = DATE_FORMAT.format(today);
		System.out.println("Dzisiaj jest: " + date);
		//
	}
	//sprawdzenie wersji javy
	public static void my_version(){
		System.out.println(System.getProperty("java.version"));
	}

}
