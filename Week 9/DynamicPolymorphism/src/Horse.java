public class Horse extends Animal {

    @Override
    public void sound(){
        System.out.println("Neigh!");
    }
    public static void main(String[] args) throws Exception {
        Animal obj = new Horse();
        obj.sound();
    }
}
