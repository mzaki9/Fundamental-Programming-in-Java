import java.util.*;

/* this program is used to split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. 
Then, print the number of tokens, followed by each token on a new line. */ 

public class Soal1_w3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter = scan.nextLine().trim();         // trim() digunakan untuk menghilangkan spasi di awal dan akhir string
        scan.close();
        
        String[] S = letter.split("[\\s!,?._'@]+");    // (\\s digunakan agar spasi atau whitespace tidak ikut terhitung)
        System.out.println(S.length);                  // digunakan untuk memprint banyak word
        for(int i=0;i<S.length;i++) {                  // loop digunakan untuk memprint word
            System.out.println(S[i]);
        }
        }
        
    
}
