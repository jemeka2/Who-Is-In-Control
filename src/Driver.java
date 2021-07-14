public class Driver extends Person{
    private Car car;

    public Driver(){

    }

    public void setCar(Car car) {
        this.car = car;
    }
    public Car getCar() {
        return car;
    }

    public String driving(){
        return "This drivers name is " + super.getName() +
                "\nthey are " + super.getAge() + " years old and" +
                "\nthey drive a " + car.getColor() + " " + car.getModel() + " from " + car.getBrand();
    }
}
