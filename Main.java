// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

/**
Filename: W2U1A4A1_Alishba_Tariq_ChangeMe
Author: Alishba Tariq 
Date:  Wednesday, February 14, 2024
Purpose:  To demonstrate the use of div (/) and mod (%) to solve the problem of making change.
*/

import java.util.Scanner;  

class Main {
  public static void main(String[] args) {
      Scanner keyedInput = new Scanner(System.in);  
      String inputAmount = "";  
      float inputAmountFloat;
      int totalCents, totalQuarters, totalDimes, totalNickels, totalPennies;
      int dollarsNo, totalDollars, totalLoonies, totalToonies, totalFiveDollars, totalTenDollars, totalTwentyDollars, totalFiftyDollars, totalHundredDollars;
      int leftoverCents = 0;
      int leftoverDollars = 0;

      System.out.println("Enter the amount of money: ");

      inputAmount = keyedInput.nextLine();

      //get the amount in dollars and cents (e.g., $15.26)
      inputAmountFloat = Float.parseFloat(inputAmount);
    totalDollars = (int)(inputAmountFloat);
    dollarsNo = (totalDollars*100);
    totalCents = (int)(inputAmountFloat*100);
    leftoverCents = (totalCents - dollarsNo);
    System.out.println("total dollars: " + totalDollars);
    System.out.println(" total cents: " + leftoverCents);
      totalHundredDollars =(int)(inputAmountFloat/100);
      leftoverDollars= (int)(inputAmountFloat%100);
      totalFiftyDollars = (int)(leftoverDollars/50);
      leftoverDollars = (int)(leftoverDollars%50);
      totalTwentyDollars = (int)(leftoverDollars/20);
      leftoverDollars = (int)(leftoverDollars%20);
      totalTenDollars = (int)(leftoverDollars/10);
      leftoverDollars = (int)(leftoverDollars%10);
      totalFiveDollars = (int)(leftoverDollars/5);
      leftoverDollars = (int)(leftoverDollars%5);
      totalToonies = (int)(leftoverDollars/2);
      leftoverDollars = (int)(leftoverDollars%2);
      totalLoonies = (int)(leftoverDollars);

      System.out.println(totalHundredDollars + " $100 bills,");
      System.out.println(totalFiftyDollars + " $50 bills,");
     System.out.println(totalTwentyDollars + " $20 bills,");
     System.out.println(totalTenDollars + " $10 bills,");
     System.out.println(totalFiveDollars + " $5 bills,");
     System.out.println(totalToonies + " toonies,");
     System.out.println(totalLoonies + " loonies,");



      //convert to find the number of quarters and determine leftover amount
      totalQuarters = leftoverCents/25;
      leftoverCents = leftoverCents%25;


      //convert to find the number of dimes and determine leftover amount
      totalDimes = leftoverCents/10;
      leftoverCents = leftoverCents%10;

      //convert to find the number of nickels and the leftover amount will be the number of pennies
      totalNickels = leftoverCents/5;
      totalPennies = leftoverCents%5;

      //output solution to screen
      System.out.println("$" + inputAmount +" has the change of: ");
      System.out.println(totalQuarters + " quarters,");
      System.out.println(totalDimes + " dimes,");
      System.out.println(totalNickels + " nickels, and"); 
      System.out.println(totalPennies + " pennies."); 
  }
}