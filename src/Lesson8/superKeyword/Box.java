package Lesson8.superKeyword;

public class Box {
    protected double wight;
    protected double height;
    protected double depth;

    public Box(double wight, double height, double depth) {
        this.wight = wight;
        this.height = height;
        this.depth = depth;
    }

    public Box() {
    };

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "wight=" + wight +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

}
