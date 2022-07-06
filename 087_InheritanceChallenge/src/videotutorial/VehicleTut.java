package videotutorial;

public class VehicleTut {

    private String name;
    private String size;


    private int currentVelocity;
    private int currentDirection;

    public VehicleTut(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int direction){

        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees");

    }

    public void move(int velocity, int direction){

        currentDirection = velocity;
        currentDirection = direction;

        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);


    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;

    }

}
