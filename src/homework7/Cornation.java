package homework7;

public class Cornation extends Flower{
    private String name;

    public Cornation(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cornation{" +
                "name='" + name + '\'' +
                '}';
    }
    private String country;

    public Cornation(String country, String country1) {
        super(country);
        this.country = country1;
    }
}
