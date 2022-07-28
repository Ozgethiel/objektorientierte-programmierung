package uebungen.b_juni.p_interfaces_mobile;

public class Wire implements Mobile {

    private final Mobile m1;
    private final Mobile m2;
    private double lenght;

    private double left;
    private double right;

    public Wire(Mobile m1, Mobile m2, double lenght) {

            this.m1 = m1;
            this.m2 = m2;

    }

    @Override
    public double weight() {

        return m1.weight() + m2.weight();
    }

    @Override
    public void balance() {
        m1.balance();
        m2.balance();
        double length = left + right;
        double totalWeight = m1.weight() + m2.weight();
        left = m2.weight() * length / totalWeight;
        right = m1.weight() * length / totalWeight;

    }
    @Override
    public String toString(){
        return String.format("Mobile%g", left);
    }
}
