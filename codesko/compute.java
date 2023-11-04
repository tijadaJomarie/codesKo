/**
 * README
 * @title: My Mini Calculator
 * @author: Jomarie Tijada
 * @version: 11-03-23
 * @description: This program can input five integer values from the user and computes their sum, difference, product, and average.
 */
import java.util.Scanner; //Import java scanner to make it accessible to the class.
public class compute {
    public static void main (String [] args){
        //input stage
        Scanner input = new Scanner (System.in); //This prompts the user to enter the integer values.
        System.out.print("Enter the first number: ");//This tells the user to input an integer value.
        int num1 = input.nextInt();//This reads the inputted integer value from the user and stores it in the variable num1.

        System.out.print("Enter the second number: ");//This tells the user to input an integer value.
        int num2 = input.nextInt();//This reads the inputted integer value from the user and stores it in the variable num2.

        System.out.print("Enter the third number: ");//This tells the user to input an integer value.
        int num3 = input.nextInt();//This reads the inputted integer value from the user and stores it in the variable num3.

        System.out.print("Enter the fourth number: ");//This tells the user to input an integer value.
        int num4 = input.nextInt();//This reads the inputted integer value from the user and stores it in the variable num4.

        System.out.print("Enter the fifth number: ");//This tells the user to input an integer value.
        int num5 = input.nextInt();//This reads the inputted integer value from the user and stores it in the variable num4.

        //Computation 
        int SUM = num1 + num2 + num3 + num4 + num5;//This calculates the sum of the inputted integer values by using the + operator.
        int DIFFERENCE = num1 - num2 - num3 - num4 - num5;//This calculates the difference of the inputted integer values by using the - operator.
        int PRODUCT = num1 * num2 * num3 * num4 * num5;//This calculates the product of the inputted integer values by using the * operator.
        double AVERAGE = SUM/5;/**This calculates the average of the inputted integer values by dividing the sum of the 
                                    five numbers to five.**/

        System.out.println();//This prints a blank line to separate the input stage to the result stage.

        //Result stage
        //These lines of code use concatenation with the symbol + to combine the string message and the variables assigned for the result
        System.out.println("The sum is " + SUM);//This prints the value of the variable SUM to the console.
        System.out.println("The difference is " + DIFFERENCE);//This prints the value of the variable DIFFERENCE to the console.
        System.out.println("The product is " + PRODUCT);//This prints the value of the variable PRODUCT to the console.
        System.out.println("The average is " + AVERAGE);//This prints the value of the variable AVERAGE to the console.

        input.close();//This closes the scanner used, to prevent memory leaks.
    }
}
