import java.io.IOException;

public class TrainRunner {

    public static void main(String[] args) throws IOException {
        Car c1 = new Car("apples", 30, 10.0);
        Car c2 = new Car("boots", 75, 377.21);
        Car c3 = new Car("chalk", 150, 26.2);

        Train train = new Train("Tristan", 3);

        train.add(c1);
        train.add(c2);
        train.add(c3);

        train.makeManifest();
        System.out.println("Total Weight: " + train.getTotalWeight());
        System.out.println(train.getCar(2));
    }

}
