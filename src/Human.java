public class Human implements Actions{
    int maxRun = 43;
    int maxJump = 2;

    @Override
    public void jump(int height) {
        if (height > maxJump) {
            System.out.println("Human dont jump");
        } else {
            System.out.println("Human jump:" + height + "m");
        }

    }

    @Override
    public void run(int dist) {

        if (dist > maxRun ) {
            System.out.println("Human dont run");
        } else {
        }

    }
}
