/**
* <h1>Strings!</h1>
* Program that determine how long is the string that we input, determine lexicographically between 2 string and print the string with capitalize on the first letter.
* simply adds the string that u want to check and Prints
* the output on the screen.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author Muhammad Zaki
* @version 1.0
* @since 2022-02-13
*/





import java.util.Scanner;


public class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letterA = input.nextLine();
        String letterB = input.nextLine();

        System.out.println(letterA.length()+letterB.length());      // this line is used to add the lenght between 2 strings
        if (letterA.compareTo(letterB) > 0 ){                       // this line is used to compare lexicographically between 2 strings            
            System.out.println("Yes");
        }
        else {System.out.println("No");}

        System.out.println(letterA.substring(0,1).toUpperCase() + letterA.substring(1).toLowerCase() +" "+ letterB.substring(0,1).toUpperCase() + letterB.substring(1).toLowerCase()); // this line is used to make the first letter of the string capitalize
    }
}
