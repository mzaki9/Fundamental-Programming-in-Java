import java.util.*;

public class Soal5_w3 {
    public static void main(String args[]){
        int plat1,plat2,plat3,plat4;
        Scanner scan = new Scanner(System.in);

        //untuk scan plat nomer
        plat1 = scan.nextInt();
        plat2 = scan.nextInt();
        plat3 = scan.nextInt();
        plat4 = scan.nextInt();
        scan.close();

        //konversi plat nomer ke dalam string
        String s1 = Integer.toString(plat1);
        String s2 = Integer.toString(plat2);
        String s3 = Integer.toString(plat3);
        String s4 = Integer.toString(plat4);

        //menggabungkan plat nomer
        String combine = s1 + s2 + s3 + s4 ;

        //mengembalikan plat nomer ke dalam integer
        long totalplat = Long.parseLong(combine);

        totalplat = totalplat - 999999;
        if (totalplat % 5 == 0){
            System.out.println("berhenti");
        }
        else System.out.println("jalan");
    }
    
}
