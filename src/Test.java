public class Test {
    public static void main(String[] args) {
        Transport car = new Car();
        car.move(52);
        car.stop();
        Transport boat = new Boat();
        boat.move(15);
        boat.stop();
    }
}
