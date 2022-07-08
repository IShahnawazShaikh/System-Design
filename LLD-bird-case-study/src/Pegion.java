public class Pegion extends Bird implements FlyableBird, MakeSoundBird{

    @Override
    public void fly() {
        BirdFlyWays birdFlyWays=new PegionSparrowFlyWay();
        birdFlyWays.makeFly();
    }

    @Override
    public void makeSound() {

    }
}
