package homework7;

public class Tulip extends Flower {

    private String name;

    public Tulip(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "name='" + name + '\'' +
                '}';
    }
    private String country;

    public Tulip(String country, String country1) {
        super(country);
        this.country = country1;
    }
}
