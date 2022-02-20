import java.util.Scanner;

public class Soal3_w3 {
    public static void main (String args[]){

        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        String operator = scan.next();
        int B = scan.nextInt();
        scan.close();
        switch (operator){
        case "+" : System.out.println(A + B);break;
        case "-" : System.out.println(A - B);break;
        case "*" : System.out.println(A * B);break;
        case "/" : System.out.println(A / B);break;
        case "%" : System.out.println(A % B);break;
        }
    }
}
