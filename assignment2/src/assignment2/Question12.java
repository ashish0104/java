/* Author's Name           :  Asish Kumar Sahoo
-  *Author's Regd No.       :  2041019056
-  *Author's Semester       :  1st
-  *Author's Branch-Section :  CSE-24
-  *Subject                 :  Introduction to Computer Programming (CSE 1001)
-  *Problem Description     :  (Assignment2,Q12)---If you have N eggs, then you have N/12 dozen eggs, with N%12 eggs left over. (This is 
                           essentially the definition of the / and % operators for integers.) Write a java program that asks the user how many eggs 
                           she has and then tells the user how many dozen eggs she has and how many extra eggs are left over.
                           A gross of eggs is equal to 144 eggs.
 Extend your 
program so that it will tell the user how many gross, how many dozen, and how many left 
over eggs she has. For example, if the user says that she has 1342 eggs, and then your 
program would respond with 
Your number of eggs is 9 gross, 3 dozen, and 10.
*/
package assignment2;
import java.util.*;   // also import java.util.Scanner
public class Question12 {

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter how many eggs do you have : ");
       int eggs = sc.nextInt();
       int gross = eggs/144;
       int left = eggs%144;
       int dozen = left/12;
       int left1 = left%12;
       System.out.println("Your number of eggs is "+ gross +" gross, "+ dozen +" dozen, and "+ left1);
       sc.close();
	}

}
