/*
 * Author: Utku Yurter      Program Name: idealWeight.java
 * Program Description: This program calculates the ideal weight for males and females.
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
      int idealWeightMale ;
      int idealWeightFemale ;
      int rangeLowest ;
      int rangeHighest ;
      
      System.out.print("Your height in feet:");
      heightFeet = scan.nextInt() ;
      System.out.print("Your height in inches:");
      heightInches = scan.nextInt() ;
      
      height = (heightFeet * 12) + heightInches ;
      
      idealWeightMale = 106 + ((height - 60) * 6) ;
      
      rangeHighest = (int) ((idealWeightMale * 0.15) + idealWeightMale) ;
      rangeLowest = (int) (idealWeightMale - (idealWeightMale * 0.15)) ;
         
      System.out.println("Your ideal weight is " + idealWeightMale + " if you are a male.");  
      System.out.println("The ideal weight range is " + rangeLowest + "---" + rangeHighest) ;
             
      idealWeightFemale = 100 + ((height - 60) * 5) ;
      
      rangeHighest = (int) ((idealWeightFemale * 0.15) + idealWeightFemale) ;
      rangeLowest = (int) (idealWeightFemale - (idealWeightFemale * 0.15)) ;
              
      System.out.println("Your ideal weight is " + idealWeightFemale + " if you are a female."); 
      System.out.println("The ideal weight range is " + rangeLowest + "---" + rangeHighest) ;
        
    }
}
