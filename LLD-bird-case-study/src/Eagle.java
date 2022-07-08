public class Eagle extends Bird implements FlyableBird{

    BirdFlyWays birdFlyWays;
    Eagle(BirdFlyWays birdFlyWays){
        this.birdFlyWays=birdFlyWays;
    }
    @Override
    public void fly() {
        birdFlyWays.makeFly();
    }

}
