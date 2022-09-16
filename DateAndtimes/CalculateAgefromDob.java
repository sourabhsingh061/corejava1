package com.rays.DateAndtimes;

import java.util.Date;

public class CalculateAgefromDob {

	public static void main(String[] args) {

		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String d1 = sdf.format(d);
		System.out.println(d1);
		
		String d2 = "15/09/2000";
		
        Date d3 = sdf.parse(d2);
        System.out.println(d3);
	}

}
