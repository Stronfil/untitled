public class Main {
    public static void main(String[] args) {
        employee[] are = new employee[5];
            are[0] = new employee("Oleg Belov", "marketer", "belov@bk.ru", 73255, 300, 50);
            are[1] = new employee("Valeria Oblomova", "accountant", "lera@bk.ru", 788483, 500, 46);
            are[2] = new employee("Artem Lojkin", "lawyer", "lovis@bk.ru", 694499, 600, 32);
            are[3] = new employee("Olga Sidorova", "interpreter", "Sidrrr@gmail.com ", 8345342, 800, 41);
            are[4] = new employee("Nikolay Sveridov", "marketer", "Sver@gmail.com", 53342, 650, 28);
            for (int i = 0; i < are.length; i++) {
                if (are[i].getAge()>40){
                    are[i].info();
                }
            }
    }

}




