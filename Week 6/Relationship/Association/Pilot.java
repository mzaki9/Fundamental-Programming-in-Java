import java.util.List;

class Pilot {
    private String pilotName;
    List<Airplane> airplanes;
    
    public String getPilotName() {
        return this.pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }
    

    public List<Airplane> getAirplanes() {
        return this.airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public List<Airplane> getAirplaness(){
        return airplanes;
    }
    
    public void setPilot(List<Airplane> airplanes){
        this.airplanes = airplanes;
    }
}
