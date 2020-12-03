import java.sql.SQLOutput;

public class employee {
    private String FIO;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;
//public employee(){
//
//}


    public  employee(String FIO, String position, String email, int phone, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

     public  void info(){
    System.out.printf("%s %s %s %d %d %d\n", FIO,position,email,phone ,salary,age );

}

//    public void setAge(int age) {
//        if (age >40){
//            return ;
//        }
//        this.age = age;

      int getAge(){
        return age;
}


}



