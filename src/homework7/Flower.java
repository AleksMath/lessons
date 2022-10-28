package homework7;

public class Flower {
    String country;
    int shelfLife;
    int cost;
    private static int count = 0;


    public Flower(String country) {
        this.country = country;
        count++;
    }

    public static void main(String[] args) {
        Rose rose = new Rose("Роза");
        //rose.country = "Russia";
        rose.shelfLife = 3;
        rose.cost = 300;

        Tulip tulip = new Tulip("Тюльпан");
        //tulip.country = "Holland";
        tulip.shelfLife = 2;
        tulip.cost = 200;

        Cornation cornation = new Cornation("Гвоздика");
        //cornation.country = "Georgia";
        cornation.shelfLife = 4;
        cornation.cost = 150;

        Chrysanthemum chrysanthemum = new Chrysanthemum("Хризантема");
        //chrysanthemum.country = "Russia";
        chrysanthemum.shelfLife = 5;
        chrysanthemum.cost = 250;


        Flower flowers[] = new Flower[4];
        flowers[0] = rose;
        flowers[1] = cornation;
        flowers[2] = tulip;
        flowers[3] = chrysanthemum;
        for (int i = 0; i < flowers.length; i++) {
            System.out.print(flowers[i]);
        }
        System.out.println();
        for (int i = 0; i < flowers.length; i++) {
            System.out.print(flowers[i]);
        }
        System.out.println();
        for (int i = 0; i < flowers.length; i++) {
            System.out.print(flowers[i]);
        }
        System.out.println();
        System.out.println("Количество цветов " + Flower.count);
    }
}

