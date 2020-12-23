public class Wall implements Obstacles{
    private int heigth;

    @Override
    public void trials(Actions a) {
        a.jump(heigth);

    }

    public Wall(int heigth) {
        this.heigth = heigth;
    }
}
