public class Fuel {
    private double fuel;
    private double timeOfInjection;
    private double fuelPressure;

    public Fuel() {
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelPressure() {
        return fuelPressure;
    }

    public double getTimeOfInjection() {
        return timeOfInjection;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setFuelPressure(double fuelPressure) {
        this.fuelPressure = fuelPressure;
    }

    public void setTimeOfInjection(double timeOfInjection) {
        this.timeOfInjection = timeOfInjection;
    }
}
