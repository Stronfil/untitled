public class Main {
    public static void main(String[] args) {
        Cat[] cats= {
                new Cat("Boris1",10),
                new Cat("Boris2",10),
                new Cat("Boris3",10),
                new Cat("Boris4",10),};
        Plate plate=new Plate(40);
        for (int i = 0; i < cats.length ; i++) {
            cats[i].eat(plate);
        }
        for (int i = 0; i < cats.length ; i++) {
            System.out.println(cats[i]);

            
        }
        plate.info();
        plate.moreEat(300);
        plate.info();


            
        }




        

    }





