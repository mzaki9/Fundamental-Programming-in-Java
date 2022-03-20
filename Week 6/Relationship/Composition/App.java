import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       Organ organ1 = new Organ("Lungs","process of gas exchange called respiration");
       Organ organ2 = new Organ("Nose", "filters debris and warms and moistens the air");


       List<Organ> organs = new ArrayList<Organ>();
        organs.add(organ1);
        organs.add(organ2);
       

       OrganSystem system = new OrganSystem(organs);

       List<Organ> ogs = system.getTotalOrgansInSystem();
       for(Organ og : ogs){
           System.out.println("==== Respiratory System ====");
           System.out.println("Name : "+ og.name );
           System.out.println("Function : "+og.function);
           System.out.println();
       }
    }
}
