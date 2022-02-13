import java.util.Scanner;

/**
* <h1>Determine Data Types!</h1>
* Program that determine which primitive data types are capable of properly storing that input.
* simply adds the number of test case and the numbers u want to check and Prints
* the output on the screen.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Muhammad Zaki
* @version 1.0
* @since 2022-02-10
*/

class Soal2 {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 0; i < N; i++){

            try{
            long number = input.nextLong();
            System.out.println(number + " can be fitted in:");
            if (number>= -128 && number <= 127) {System.out.println("* byte");}
            if (number>= Short.MIN_VALUE && number <= Short.MAX_VALUE) {System.out.println("* short");}
            if (number>= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {System.out.println("* integer");}
            if (number>= Long.MIN_VALUE && number <= Long.MAX_VALUE) {System.out.println("* long");}
            
        }
            catch (Exception e) {
            System.out.println(input.next()+" can't be fitted anywhere");
            }
        }
        input.close();
        }
}