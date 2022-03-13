/**
* <h1>Introduction to Inheritance!</h1>
* @author Muhammad Zaki
* @version 1.0
* @since 2022-03-13
*/

public class Sasuke extends Itachi {
    String Dojutsu = "Sharingan";

    void printDojutsu() {
        super.printDojutsu(); //Memanggil printDojutsu dari superclassnya yaitu itachi
        System.out.println(this.Dojutsu);
    }
}
