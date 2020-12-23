public class Cat implements Actions {
    int maxRun=50;
    int maxJump=3;

    @Override
    public void jump(int height) {
        if(height>maxJump ){
            System.out.println("Cat dont jump");
        }else {
            System.out.println("Cat jump:"+height+"m");
        }

    }

    @Override
    public void run(int dist) {
        if(dist>maxRun ){
            System.out.println("Cat dont run");
        }else {
            System.out.println("Cat run:"+dist+"m");
        }

    }
}
