public class CarBeingUsed {

    public static void main(String[] args) {
        //Creating an object via constructor 1
        CarObject ferrari = new CarObject(4, "Red", false);
        ferrari.setAge(6);
        //Creating an object via constructor 2
        CarObject porsche = new CarObject("Blue", false);
        System.out.println(porsche.getAge());
    }

}
