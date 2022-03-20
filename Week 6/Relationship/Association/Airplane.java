class Airplane {
    private String airplaneName;

    public String getAirplaneName() {
        return this.airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    @Override
    public String toString(){
        return airplaneName;
    }
}
