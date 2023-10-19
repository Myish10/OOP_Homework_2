public class Program {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Персик", 50);
        Plate plate1 = new Plate(40);
        plate1.info();
        cat1.eat(plate1);
        plate1.info();
        System.out.println("-".repeat(20));

        plate1.addFood(100);
        plate1.info();
        cat1.eat(plate1);
        plate1.info();
        System.out.println("-".repeat(20));

        cat1.eat(plate1);
        plate1.info();
        System.out.println("-".repeat(20));

        Cat[] cats = {
                new Cat("Барсик", 27),
                new Cat("Рыжик", 20),
                new Cat("Пушистик", 25),
                new Cat("Котик", 32),
                new Cat("Снежок", 22)
        };

        for (Cat cat: cats) {
            cat.eat(plate1);
        }

        System.out.println();
        plate1.info();
        plate1.addFood(100);
        plate1.info();
        System.out.println("-".repeat(20));

        for (Cat cat: cats) {
            cat.eat(plate1);
        }

        System.out.println();
        plate1.info();

    }
}
