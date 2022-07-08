public class Pegion extends Bird implements FlyableBird, MakeSoundBird{

    @Override
    public void fly() {
       PegionSparrowFlyWay psflw=new PegionSparrowFlyWay();
       psflw.makeFly();
    }

    @Override
    public void makeSound() {

    }
}
