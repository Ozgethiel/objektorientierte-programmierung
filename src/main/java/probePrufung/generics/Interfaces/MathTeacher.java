package probePrufung.generics.Interfaces;

public class MathTeacher {

    public static void main(String[]args){
        Circle circle = new Circle(3d);
        Rectangle rectangle= new Rectangle(10d,5d);

        System.out.println("Das Rechteck hat die Fläche" + rectangle.calculateArea());
        double area = circle.calculateArea();
        System.out.println(area);
        System.out.println(String.format("%.2f", area));

    }
}
