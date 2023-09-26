public class EFI {
    public static void main(String[] args) {
        Fuel Fuel = new Fuel();
        Fuel.setFuel(0.1);
        Fuel.setFuelPressure(3.5);
        Fuel.setTimeOfInjection(0.1);
        AirFlowSensor AirFlowSensor = new AirFlowSensor();
        AirFlowSensor.setAir(0.05);
        System.out.println(Fuel.getFuel());
        System.out.println(AirFlowSensor.getAir());
        System.out.println(Fuel.getFuelPressure());
        System.out.println("Check");
    }
}
