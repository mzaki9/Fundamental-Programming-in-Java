import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
            Pilot pilot = new Pilot();
            pilot.setPilotName("John Wall");

            Airplane plane = new Airplane();
            plane.setAirplaneName("Boeing 737");
            Airplane plane2= new Airplane();
            plane2.setAirplaneName("F16");

            List<Airplane> empList = new ArrayList<Airplane>();
            empList.add(plane);
            empList.add(plane2);

            pilot.setPilot(empList);

            System.out.println();
            System.out.println();
            System.out.println(pilot.getAirplaness()+" are the name of air plane that "+pilot.getPilotName()+" mastered");
            System.out.println();
            System.out.println();
    }
}
