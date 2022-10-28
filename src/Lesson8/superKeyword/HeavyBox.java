package Lesson8.superKeyword;

public class HeavyBox extends Box {

    private double weight;

    public HeavyBox(double wight, double height, double depth, double weight) {
        super(wight, height, depth);
        this.weight = weight;
    };

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "HeavyBox{" +
                "weight=" + weight +
                '}';
    }
}
