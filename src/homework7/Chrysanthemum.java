package homework7;

public class Chrysanthemum extends Flower {
    private String name;

    public Chrysanthemum(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chrysanthemum{" +
                "name='" + name + '\'' +
                '}';
    }
    private String country;

    public Chrysanthemum(String country, String country1) {
        super(country);
        this.country = country1;
    }
}
