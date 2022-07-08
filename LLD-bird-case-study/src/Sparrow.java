public class Sparrow extends  Bird implements FlyableBird{
    BirdFlyWays birdFlyWays;
    Sparrow(BirdFlyWays birdFlyWays){
        this.birdFlyWays=birdFlyWays;
    }
    @Override
    public void fly() {
        birdFlyWays.makeFly();
    }
}
