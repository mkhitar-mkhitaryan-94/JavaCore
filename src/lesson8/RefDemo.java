package lesson8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3,5,7,8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Obem weightbox raven " + vol);
        System.out.println("Ves weightbox raven " + weightbox.weight);
        System.out.println();

        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("obem plainbox raven " + vol);


    }
}
