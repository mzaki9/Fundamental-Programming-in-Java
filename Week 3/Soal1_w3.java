import java.util.*;

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
