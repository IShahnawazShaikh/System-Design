public class Sparrow extends  Bird implements FlyableBird{
    @Override
    public void fly() {
        BirdFlyWays birdFlyWays=new PegionSparrowFlyWay();
        birdFlyWays.makeFly();
    }
}
