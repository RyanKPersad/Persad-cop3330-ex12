package Simple_Interest;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 12 Solution
 *  Copyright 2021 Ryan Persad
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner myObj = new Scanner(System.in);
        String principle;
        String interestRate;
        String NumYears;


        System.out.print("Enter the principal: " );
        principle = myObj.nextLine();

        System.out.print( "Enter the rate of interest: " );
        interestRate = myObj.nextLine();

        System.out.print( "Enter the number of years: " );
        NumYears = myObj.nextLine();

        Double newPrinciple = Double.parseDouble(principle);
        Double newInterestRate = Double.parseDouble(interestRate);
        Double newNumYears = Double.parseDouble(NumYears);

        //Calculations

        Double interestRate2 = newInterestRate/100;
        Double math1 = interestRate2 * newNumYears;
        Double math2 = 1 + math1;
        Double finalMath = newPrinciple * math2;

        String print = String.format("$%.2f.", finalMath);
        System.out.println("After " +NumYears + " years at " +interestRate+ ",the investment will be worth " + print);
    }
}
