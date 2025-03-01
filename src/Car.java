public class Car extends Transport {
    @Override
    public void move(double speed){
        System.out.println("Автомобиль едет со скоростью " + speed + " км/ч");
    }
}
