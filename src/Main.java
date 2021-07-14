public class Main {
    public static void main(String[] args){
        Car c = new Car();
        Plane p = new Plane();
        Driver tom = new Driver();
        Pilot harrison = new Pilot();

        c.setVehicle("Car");
        c.setColor("Black");
        c.setSpeed(90);
        c.setModel("Aventador");
        c.setBrand("Lamborghini");

        p.setVehicle("Plane");
        p.setColor("Blue");
        p.setSpeed(575);
        p.setType("Passenger Jet");
        p.setModel("Airbus A350");

        tom.setName("Tom Cruise");
        tom.setAge(59);
        tom.setCar(c);

        harrison.setName("Harrison Ford");
        harrison.setAge(79);
        harrison.setPlane(p);

        System.out.println(tom.driving());
        System.out.println(harrison.flying());

    }
}
