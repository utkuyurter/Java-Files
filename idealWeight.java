/*
 * Author: Utku Yurter      Program Name: idealWeight.java
 *
 * Program Description: This program calculates the ideal weight and range for males and females 
 * depending on their height.
 */
package idealweight;

import java.util.Scanner ;
        
public class IdealWeight 
{
    public static void main(String[] args) 
    {
      Scanner scan = new Scanner(System.in) ;
      
      int heightFeet;
      int heightInches;
      int height ;
      int idealWeight ;
      int rangeLowest ;
      int rangeHighest ;
      
      System.out.print("Your height in feet:");
      heightFeet = scan.nextInt() ;
      System.out.print("Your height in inches:");
      heightInches = scan.nextInt() ;
      
      height = (heightFeet * 12) + heightInches ;
      
      idealWeight = 106 + ((height - 60) * 6) ;
      
      rangeHighest = (int) ((idealWeight * 0.15) + idealWeight) ;
      rangeLowest = (int) (idealWeight - (idealWeight * 0.15)) ;
         
      System.out.println("Your ideal weight is " + idealWeight + " if you are a male.");  
      System.out.println("The ideal weight range is " + rangeLowest + "---" + rangeHighest) ;
             
      idealWeight = 100 + ((height - 60) * 5) ;
      
      rangeHighest = (int) ((idealWeight * 0.15) + idealWeight) ;
      rangeLowest = (int) (idealWeight - (idealWeight * 0.15)) ;
              
      System.out.println("Your ideal weight is " + idealWeight + " if you are a female."); 
      System.out.println("The ideal weight range is " + rangeLowest + "---" + rangeHighest) ;
        
    }    
}
