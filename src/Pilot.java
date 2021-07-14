public class Pilot extends Person{
    private Plane plane;
    public Pilot(){

    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }
    public Plane getPlane() {
        return plane;
    }

    public String flying(){
        return "\nThis pilots name is " + super.getName() +
                "\nthey are " + super.getAge() + " years old and" +
                "\nthey fly a " + plane.getColor() + " " + plane.getModel() + " " + plane.getType();
    }
}
