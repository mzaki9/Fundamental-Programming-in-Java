public class Circle extends Shape {
    private double radius;

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return Math.PI * 2 *radius;
    }


    @Override
    public String toString() {
        return "{" +
            "A circle with radius=" + getRadius() + "which is a subclass of " + super.toString() +
            "}";
    }


}
