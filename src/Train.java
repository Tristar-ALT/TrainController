import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Train {
    private String name;
    private int lineNumber;
    private ArrayList<Car> cars;

    public Train(String n, int ln) {
        name = n;
        lineNumber = ln;
        cars = new ArrayList<Car>();
    }

    public void add(Car car) {
        cars.add(car);
    }

    public void remove(int index) {
        cars.remove(index);
    }

    public void add(Car car, int index) {
        cars.add(index, car);
    }

    public Car getCar(int index) {
        return cars.get(index);
    }

    public double getTotalWeight() {
        double sum = 0.0;
        for (Car i:cars) {
            sum += i.getWeight();
        }
        return sum;
    }

    public void makeManifest() throws IOException{
        FileWriter fw = new FileWriter("manifest.csv");
        String data = name + "," + lineNumber + "\n";
        for (Car c : cars){
            String carData = c.getCargo() + "," + c.getQuantity() + "," + c.getWeight() + "\n";
            data = data + carData;
        }
        fw.write(data);
        fw.flush();
        fw.close();
    }


}
