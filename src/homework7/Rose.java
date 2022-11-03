package homework7;

public class Rose extends Flower {
    private String name;

    public Rose(String name, String country,int shelfLife, int cost) {
        super(country, shelfLife, cost);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Rose{" +
                "name='" + name + '\'' +
                '}';
    }

    private String country;

}

