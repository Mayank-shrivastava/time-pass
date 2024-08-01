package Practice;

public class Bicycle {
    // states of bicycle class
    private int cadence;
    private int gear;
    private int speed;

    private int id;
    // static data member
    private static int numberOfBicycles = 0;

    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
        id = ++numberOfBicycles;
    }

    // getter
    public int getID() {
        return id;
    }

    // getter for static field
    public static int getNumberOfBicycles() {
        return numberOfBicycles;
    }

    // getter
    public int getCadence() {
        return cadence;
    }

    // setter
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public int getGear() {
        return gear;
    }

    // setter
    public void setGear(int newValue) {
        gear = newValue;
    }

    // getter
    public int getSpeed() {
        return speed;
    }

    // behaviour of bicylcle class
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    // behaviour of bicylcle class
    public void speedUp(int increment) {
        speed += increment;
    }
}
