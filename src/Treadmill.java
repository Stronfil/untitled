public class Treadmill implements Obstacles{
    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    @Override
    public void trials(Actions a) {
        a.run(dist);
    }
}
