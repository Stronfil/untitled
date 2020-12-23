public class Robot implements Actions {
    int maxRun=100;
    int maxJump=5;
    @Override
    public void jump(int height) {
        if(height>maxJump ){
            System.out.println("Robot dont jump");
        }else {
            System.out.println("Robot jump:"+height+"m");
        }

    }

    @Override
    public void run(int dist) {

        if(dist>maxRun ){
            System.out.println("Robot dont run");
        }else {
            System.out.println("Robot run:"+dist+"m");
        }

    }
}
