public class Animal {
    String name;
    String type;
    int runMax;
    int swimMax;


    public Animal(String type,String name,int swimMax,int runMax){
        this.name=name;
        this.type=type;
        this.swimMax=swimMax;
        this.runMax=runMax;

    }

public void distanceRun(int distR){
    if (distR < runMax && distR!=0){
        System.out.println(type+ " "+name +" пробежал " +distR+ "м");

    }else {
        System.out.println("Не смог пробежать ");
    }

}
public void distanceSwim(int distS){
    if (distS<=swimMax && distS!=0){
        System.out.println(type+" "+name + " проплыл " +distS+ "м");
    }else {
        System.out.println(type+ " "+name + " Не умеет плавать ");
    }

}


}