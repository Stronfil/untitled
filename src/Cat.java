public class Cat {
    public String name;
    public int hunger;
    public boolean satiety;



    public Cat(String name, int hunger) {
        this.name = name;
        this.hunger = hunger;
    }



    public void eat(Plate plate) {
        if (plate.decreaseFood(hunger)) {
            System.out.println("cat" + name + "eat");
            satiety = true;
        } else {
            System.out.println("cat" + name + "eat");

        }

    }



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", hunger=" + hunger +
                ", satiety=" + satiety +
                '}';
    }

}



