package Vehicels;

public class Car implements Vehicle{
    int speed ;
    boolean engineStarted;
    @Override
    public void start() {
        engineStarted =true;
        System.out.println("Car engine started");

    }

    @Override
    public void accelerate() {
        if(engineStarted){
            speed=speed+20;
            System.out.println("Car accelerating.Speed: "+speed);
        }else{
            System.out.println("Start Car first.");
        }
    }

    @Override
    public void brake() {
        if(speed>0){
            System.out.println("Break Apply Successfully");
            speed=0;
        }else{
            System.out.println("Car stopped");
        }

    }
}

