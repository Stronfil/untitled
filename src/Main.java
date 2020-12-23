public class Main {
    public static void main(String[] args) {
        Actions[]actions={new Cat(),new Robot(),new Human()};
        Obstacles[]obstacles={new Wall(2),new Treadmill(40)};
        for (Actions action : actions) {
            for (Obstacles obstacle : obstacles) {
                obstacle.trials(action);

            }

        }


    }
}
