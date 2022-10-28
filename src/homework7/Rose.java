package homework7;

public class Rose extends Flower {
    private String name;

    public Rose(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "name='" + name + '\'' +
                '}';
    }

    private String country;

    public Rose(String country, String country1) {
        super(country);
        this.country = country1;
    }

}

