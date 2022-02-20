import java.math.BigInteger;
import java.util.*;

public class Soal6_w3 {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        BigInteger A = scan.nextBigInteger();
        BigInteger B = scan.nextBigInteger();
        BigInteger addResult = A.add(B);
        BigInteger multResult = A.multiply(B);
        scan.close();
        System.out.println(addResult);
        System.out.println(multResult);
    }
    
}
