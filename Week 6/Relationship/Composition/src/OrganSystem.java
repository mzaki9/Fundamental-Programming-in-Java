import java.util.List;
    
public class OrganSystem {
    
    private final List<Organ> organs;

    OrganSystem (List<Organ> organs){
        this.organs = organs;
    }

    public List<Organ> getTotalOrgansInSystem(){
        return organs;
    }
}

