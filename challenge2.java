import java.util.Scanner;

public class challenge2 {

	public static void main (String args[]) 
	{
		double total = 0;
		double mass = 0;
		double accel = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the mass: ");
		mass = scan.nextDouble();

		System.out.println("Please enter the accelaration ");
		accel = scan.nextDouble();

		total = mass * accel;

		System.out.println("Force equals " + total);
	}
}

/*other solution*/

package com.magnus.daily.two_easy;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class two_easy {
 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String from, to;
		Double amount = 0.0;
		BufferedReader br; // user input
 
		// from
		System.out
				.print("Enter currency you want to convert from [NOK, DKK, USD]: ");
		br = new BufferedReader(new InputStreamReader(System.in));
		from = registerUserInput(br);
 
		// to
		System.out
				.print("Enter currency you want to convert to [NOK, DKK, USD]: ");
		br = new BufferedReader(new InputStreamReader(System.in));
		to = registerUserInput(br);
 
		// // amount
		System.out.printf("Enter the amount of %s you want to convert to %s: ",
				from, to);
		br = new BufferedReader(new InputStreamReader(System.in));
		amount = Double.parseDouble(registerUserInput(br));
 
		Converter c = new Converter(from, to, amount);
		System.out.printf("\n%f %s equals %f %s", c.getAmount(), c.getFrom(),
				c.getConverted(), c.getTo());
 
		// /* for testing */
		// doTest("USD", "USD", 101.0);
		// doTest("USD", "NOK", 1.0);
		// doTest("NOK", "USD", 10.0);
		// doTest("NOK", "DKK", 100.0);
		// doTest("DKK", "USD", 17.35);
	}
 
	/**
	 * For getting user input
	 * 
	 * @param br
	 *            BufferedReader
	 * @return The string entered<br/>
	 *         null if something went wrong
	 */
	private static String registerUserInput(BufferedReader br) {
		try {
			return br.readLine();
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		}
	}
 
	/**
	 * For testing.
	 * 
	 * @param from
	 *            Currency to convert from
	 * @param to
	 *            Currency to convert to
	 * @param amount
	 *            The amount to convert
	 */
	private static void doTest(String from, String to, Double amount) {
		Converter c = new Converter(from, to, amount);
		System.out.printf("\n%f %s equals %f %s", c.getAmount(), c.getFrom(),
				c.getConverted(), c.getTo());
	}
 
}
 
class Converter {
	private enum Currencies {
		USD(1.0), // reference
		NOK(0.166364), // 1 NOK to USD
		DKK(0.168831); // 1 DKK to USD
 
		private final double value;
 
		Currencies(double value) {
			this.value = value;
		}
 
		private double value() {
			return value;
		}
 
	}
 
	private String from, to = null;
	private Double amount = 0.0;
 
	public Converter(String from, String to, Double amount) {
		this.from = from;
		this.to = to;
		this.amount = amount;
	}
 
	public double getConverted() {
		return ((amount * Currencies.valueOf(from).value()) / Currencies
				.valueOf(to).value());
	}
 
	public double getAmount() {
		return amount;
	}
 
	public String getTo() {
		return to;
	}
 
	public String getFrom() {
		return from;
	}
 
}

/*another solution*/

import java.util.Scanner;


public class Driver {
    public static void main(String[] args){
        float R = 8.3145f;
        float n, v, t, p;
        String answer, units;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ideal Gas law calculator!");
        System.out.println("What do you want to solve for? Moles = n, Volume = v, Temperature = t, Pressure = p");

        answer = scan.nextLine();

        if(answer.equalsIgnoreCase("n")){

            System.out.println("What is the volume?");
            v = Float.parseFloat(scan.nextLine());

            System.out.println("What units are these in? (mL or L only)");
            units = scan.nextLine();
            if(units.equalsIgnoreCase("ml")){
                v = v/1000;
            }

            System.out.println("What is the Temperature?");
            t = Float.parseFloat(scan.nextLine());

            System.out.println("What units are these in? (C or K only)");
            units = scan.nextLine();
            if(units.equalsIgnoreCase("C")){
                t = t + 273;
            }

            System.out.println("What is the Pressure?");
            p = Float.parseFloat(scan.nextLine());

            System.out.println("What units are these in? (kPa, Pa, mmHG, or atm)");
            units = scan.nextLine();
            if(units.equalsIgnoreCase("kPa")){
                p = (float) (p / 101.325);
            }
            else if(units.equalsIgnoreCase("Pa")){
                p = (float) (p / 101325);
            }
            else if(units.equalsIgnoreCase("mmHg")){
                p = (float) (p / 760);
            }

            n = (p*v)/(R*t);

            System.out.println("There are " + n + " moles!");


        }
        else if(answer.equalsIgnoreCase("v")){

            System.out.println("How many moles? (No scientific notation!)");
            n = Float.parseFloat(scan.nextLine());

            System.out.println("What is the Temperature?");
            t = Float.parseFloat(scan.nextLine());

            System.out.println("What units are these in? (C or K only)");
            units = scan.nextLine();
            if(units.equalsIgnoreCase("C")){
                t = t + 273;
            }

            System.out.println("What is the Pressure?");
            p = Float.parseFloat(scan.nextLine());

            System.out.println("What units are these in? (kPa, Pa, mmHG, or atm)");
            units = scan.nextLine();
            if(units.equalsIgnoreCase("kPa")){
                p = (float) (p / 101.325);
            }
            else if(units.equalsIgnoreCase("Pa")){
                p = (float) (p / 101325);
            }
            else if(units.equalsIgnoreCase("mmHg")){
                p = (float) (p / 760);
            }

            v = (n*R*t) / p;
            System.out.println("There are " + v + " Liters!");

        }
        else if(answer.equalsIgnoreCase("t")){

            System.out.println("How many moles? (No scientific notation!)");
            n = Float.parseFloat(scan.nextLine());

            System.out.println("What is the volume?");
            v = Float.parseFloat(scan.nextLine());

            System.out.println("What units are these in? (mL or L only)");
            units = scan.nextLine();
            if(units.equalsIgnoreCase("ml")){
                v = v/1000;
            }

            System.out.println("What is the Pressure?");
            p = Float.parseFloat(scan.nextLine());

            System.out.println("What units are these in? (kPa, Pa, mmHG, or atm)");
            units = scan.nextLine();
            if(units.equalsIgnoreCase("kPa")){
                p = (float) (p / 101.325);
            }
            else if(units.equalsIgnoreCase("Pa")){
                p = (float) (p / 101325);
            }
            else if(units.equalsIgnoreCase("mmHg")){
                p = (float) (p / 760);
            }

            t = ((p*v)/(n*R)) - 273;
            System.out.println("The temp is " + t + " degrees C!");

        }
        else if(answer.equalsIgnoreCase("p")){

            System.out.println("How many moles? (No scientific notation!)");
            n = Float.parseFloat(scan.nextLine());

            System.out.println("What is the volume?");
            v = Float.parseFloat(scan.nextLine());

            System.out.println("What units are these in? (mL or L only)");
            units = scan.nextLine();
            if(units.equalsIgnoreCase("ml")){
                v = v/1000;
            }

            System.out.println("What is the Temperature?");
            t = Float.parseFloat(scan.nextLine());

            System.out.println("What units are these in? (C or K only)");
            units = scan.nextLine();
            if(units.equalsIgnoreCase("C")){
                t = t + 273;
            }

            p = (n*R*t)/(v);
            System.out.println("The pressure is " + t + " atm!");

        }
        else{
            System.out.println("Invalid Entry. =[");

        }
    }
}