public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }


    public boolean decreaseFood(int n){
        if(n<0 || n >food){
            return false;
        }
        food-=n;
        return true;

    }
    public void moreEat(int Meat){
        if (Meat==0){
            return;

        }
        food +=Meat;
    }
    public void info(){
        System.out.println("Осталось еды: " +food);
    }



}
