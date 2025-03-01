public abstract class Transport {
    private double speed;
    private double capacity;
    public abstract void move(double speed);
    public void stop(){
        System.out.println("Транспорт остановился");
    }
}
