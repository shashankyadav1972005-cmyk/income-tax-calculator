package calculator.tax;

import java.util.Scanner;

public class TaxCalculator {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double income, tax;
	   System.out.print("Enter Annual income:");
			   income = sc.nextDouble();
	        
	        if (income <= 250000) {
	            tax = 0;
	        } else if (income <= 500000) {
	            tax = (income - 250000) * 0.05;
	        } else if (income <= 1000000) {
	            tax = 12500 + (income - 500000) * 0.20;
	        } else {
	            tax = 112500 + (income - 1000000) * 0.30;
	        }

	        System.out.println("Income = " + income);
	        System.out.println("Income Tax = " + tax);

	        sc.close();
	        }
	        }// TODO Auto-generated method stub

	


