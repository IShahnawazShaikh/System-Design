public class Eagle extends Bird implements FlyableBird{
    @Override
    public void fly() {
        BirdFlyWays birdFlyWays=new EagleCrowFlyWay();
        birdFlyWays.makeFly();
    }
}
