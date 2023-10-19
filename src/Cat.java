public class Cat {

    private String name;

    private int appetite;

    private boolean fullness;  // сытость

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isFullness() {
        return fullness;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= appetite && !fullness) {
            fullness = true;
            plate.setFood(plate.getFood()-appetite);
            System.out.printf("%s наелся\n", name);
        }
        else if (plate.getFood()< appetite && !fullness){
            fullness = false;
            System.out.printf("Еды слишком мало, %s остался голодным\n", name);
        }
        else {
            System.out.printf("%s не голоден\n", name);
        }
    }

}
