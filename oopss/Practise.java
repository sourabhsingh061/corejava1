package com.rays.oopss;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public static void main(String[] args)  throws ParseException {
		Person p = new Person();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dob = sdf.parse("20/07/2000");
		String b = sdf.format(dob);
	
		p.setdob(b);