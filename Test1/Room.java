package Test1;

import java.sql.Time;
import java.util.Date;

public class Room {
    private int roomNumber;
    private int capacity;
    private double pricePerNight;
    private boolean Availability;
    public Room(int roomNumber,int capacity,double pricePerNight){
        this.roomNumber=roomNumber;
        this.capacity=capacity;
        this.pricePerNight=pricePerNight;
        this.Availability=false;

    }
    public boolean checkAvailability(){

        return !Availability;
    }
    public void makeAvailable(){
        Availability=true;
    }
    public void makeAvailable(Date InDate,Date OutDate){
        Availability=true;
        System.out.println("From "+InDate+" TO "+OutDate+"Room no. : "+roomNumber+" Is Booked");
    }
    public String toString() {
        return "Room" +roomNumber+"Capacity : "+capacity+" Price per Night : "+pricePerNight;
    }
    public static void main(String[] args){
        Room r1=new Room (201,2,500);
        Room r2=new Room(204,4,2000);
        System.out.println(r1);
        System.out.println(r2);
        r1.makeAvailable();
        System.out.println("Room 201 is available "+r1.checkAvailability());
        r2.makeAvailable(new Date(),new Date());
    }
}
