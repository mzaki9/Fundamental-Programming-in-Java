public class Square extends Rectangle {
   

   

    public Square(){
        super();
    }

    public Square(double side){
        setWidth(side);
        setLength(side);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
    }



    @Override
    public String toString() {
        return  "{" + "A square with side = "+getSide()+  " which is a subclass of  " + super.toString() + 
        "}";
    }
}
