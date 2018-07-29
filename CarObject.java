public class CarObject {

    //object fields
    private int age;
    private String colour;
    private boolean isEngineRunning;

    //constructor 1
    public CarObject(int age, String colour, boolean isEngineRunning){
        this.age = age;
        this.colour = colour;
        this.isEngineRunning = isEngineRunning;
    }

    //constructor 2
    public CarObject(String colour, boolean isEngineRunning) {
        this.colour = colour;
        this.isEngineRunning = isEngineRunning;
        this.age = 0;
    }

    //Getter Methods
    public int getAge() {
        return age;
    }

    public String getColour(){
        return colour;
    }

    //setter methods
    public void setAge(int age){
        this.age = age;
    }

    //object functions
    public void fastAge(){
        if (isEngineRunning) {
            setAge(age++);
        }
    }

}
