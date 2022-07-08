public class Pegion extends Bird implements FlyableBird, MakeSoundBird{

    BirdFlyWays birdFlyWays;
    Pegion(BirdFlyWays birdFlyWays){
        this.birdFlyWays=birdFlyWays;
    }
    @Override
    public void fly() {
        birdFlyWays.makeFly();
    }

    @Override
    public void makeSound() {

    }
}
