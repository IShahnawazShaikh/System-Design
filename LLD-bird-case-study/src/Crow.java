public class Crow extends Bird implements FlyableBird{
    @Override
    public void fly() {
        EagleCrowFlyWay ecfw=new EagleCrowFlyWay();
        ecfw.doFly();
    }
}
