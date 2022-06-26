public class Bird {
    int size;
    int weight;
    int color;
    String type;

    public void fly(){

        if(type=="Sparrow"){
            System.out.println("Sparrow is flying");
        }
        else if(type=="Pegion"){
            System.out.println("Pegion is flying");
        }
        else if(type=="Penguin"){
            System.out.println("Penguin is flying");
        }

    }
    public void makeSound(){
    }
    public static void main(String[] args) {
        Bird sparrow=new Bird();
        sparrow.type="Sparrow";

        Bird pegion=new Bird();
        pegion.type="Pegion";

        Bird penguin =new Bird();
        penguin.type="Penguin";

        pegion.fly();

    }
}