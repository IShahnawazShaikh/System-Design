public class Sparrow extends  Bird implements FlyableBird{
    @Override
    public void fly() {
        PegionSparrowFlyWay psflw=new PegionSparrowFlyWay();
        psflw.makeFly();
    }
}
