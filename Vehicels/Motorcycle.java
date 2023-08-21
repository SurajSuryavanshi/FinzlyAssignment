package Vehicels;

public class Motorcycle implements Vehicle{
    int speed;
    boolean engineStarted;
    @Override
    public void start() {
        engineStarted =true;
        System.out.println("Motorcycle engine started");

    }

    @Override
    public void accelerate() {
        if(engineStarted){
            speed=speed+20;
            System.out.println("Motorcycle accelerating.Speed: "+speed);
        }else{
            System.out.println("Start Motorcycle first.");
        }
    }

    @Override
    public void brake() {
        if(speed>0){
            System.out.println("Break Apply Successfully");
            speed=0;
        }else{
            System.out.println("Motorcycle stopped");
        }

    }
}
