public class Shape {
    private String color;
    private boolean filled;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //Constructor
    public Shape(){
        this.color ="green";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }


    public String toString() {
        String filled;
        
        if (!isFilled()){
            filled = "Not Filled";
        } else filled = "filled";

        return "{" + "A shape with color of "+getColor()+  " and " + filled + 
            "}";
    }

}
