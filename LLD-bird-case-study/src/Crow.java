public class Crow extends Bird implements FlyableBird{
    BirdFlyWays birdFlyWays;
    Crow(BirdFlyWays birdFlyWays){
        this.birdFlyWays=birdFlyWays;
    }
    @Override
    public void fly() {
        birdFlyWays.makeFly();
    }
}
