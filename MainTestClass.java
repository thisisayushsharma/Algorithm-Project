import java.io.*;
import java.util.*;

import java.text.NumberFormat;
import java.text.DecimalFormat;

//WARNING THIS IS THE MAIN TESTING FILE, PLEASE DUPLICATE,CALL THIS SOMETHING ELSE,
// DO WHAT YOU GOTTA DO AND THEN C&P WHAT YOU NEED INTO THIS MAIN FILE HERE.


public class MainTestClass{
	public static void main(String[] args) {
		/*
		here we will create our graphs initially 
		and whatever else we will need


		*/

		/*
		run time class link: https://stackoverflow.com/questions/5204051/how-to-calculate-the-running-time-of-my-program
		use crtl + F and c&p the sys.out line that looks like "Execution time for rows is " + formatter.format((end - start) / 1000"
		this way it will bring you to the comment i used.

		GENERAL RUNTIME EXECUTION MEASURE PROCEDURE:
			long start = System.currentTimeMillis();
				//INSERT METHOD WE ARE TESTING HERE 
			long end = System.currentTimeMillis();

			NumberFormat formatter = new DecimalFormat("#0.00000");
			System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
				
				from here if we want to test another method we simply call it like:

			start = System.currentTimeMillis();
				//INSERT METHOD WE ARE TESTING HERE 
			end = System.currentTimeMillis();

			NumberFormat formatter = new DecimalFormat("#0.00000");
			System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
		*/ 



		/*
			We can even store our times into a variable, maybe the numberformat,
			so that way we can get times, find avgs, means, idk what ever we want with our data.


			Should we test each method for a number of repeated times, then get avg?
		*/
	}

}// end class