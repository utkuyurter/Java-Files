package election;

// ************************************************************
// Election.java
//
// This file contains a program that tallies the results of
// an election. It reads in the number of votes for each of
// two candidates in each of several precincts. It determines
// the total number of votes received by each candidate, the
// percent of votes received by each candidate, the number of
// precincts each candidate carries, and the
// maximum winning margin in a precinct.
// ************************************************************

import java.util.Scanner;

public class Election 
{
    public static void main(String[] args) 
    {
        int votesForPolly = 0; // number of votes for Polly in each precinct
        int votesForErnest = 0; // number of votes for Ernest in each precinct
        int totalPolly = 0; // running total of votes for Polly
        int totalErnest = 0; // running total of votes for Ernest
        String response; // answer (y or n) to the "more precincts" question
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Election Day Vote Counting Program");
        System.out.println();
        // Initializations
        //System.out.println("Enter the number of votes for Polly: ");
        ////votesForPolly = scan.nextInt();
        //System.out.println("Enter the number of votes for Ernest: ");
        //votesForErnest = scan.nextInt();
        // Loop to "process" the votes in each precinct
        do
        {
           
            
            System.out.print("Enter the number of votes for Polly: ");
            votesForPolly = scan.nextInt();
            totalPolly += votesForPolly ;
            System.out.print("Enter the number of votes for Ernest: ");
            votesForErnest = scan.nextInt();
            totalErnest += votesForErnest;
            System.out.print("Any more precinct? (y or n)");
            response = scan.next();
            
        }
        while (response.equalsIgnoreCase("y"));
        
        System.out.println("Total votes for Polly: " + totalPolly);
        System.out.println("Total votes for Ernest: " + totalErnest);
        System.out.printf("Total percentage votes for Polly: %.2f%% \n" ,  ((double) totalPolly / (totalPolly + totalErnest)) * 100);
        System.out.printf("Total percentage votes for Ernest: %.2f%% " , ((double) totalErnest / (totalPolly + totalErnest)) * 100);
    }   
}
