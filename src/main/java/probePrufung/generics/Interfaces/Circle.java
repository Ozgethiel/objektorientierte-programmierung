package probePrufung.generics.Interfaces;

public class Circle implements Area{

    private double radius;



    public Circle(double radius) {

        this.radius = radius;
    }


    @Override
    public double calculateArea() {
        return Math.pow(radius, 2)* Math.PI;

    }

}
