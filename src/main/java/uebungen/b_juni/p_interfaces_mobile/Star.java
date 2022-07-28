package uebungen.b_juni.p_interfaces_mobile;

public class Star implements Mobile {

    private final double weight;


    public Star(double weight){
        this.weight= weight;

        }


    @Override
    public double weight() {
        return weight;
    }

    @Override
    public void balance() {

    }
    @Override
    public String toString(){
        return "Star[" + weight + "]";
    }

}
