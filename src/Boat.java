public class Boat extends Transport{
    @Override
    public void move(double speed){
        System.out.println("Лодка плывет со скоростью " + speed + " км/ч");
    }
}
