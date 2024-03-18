public class HelloWorld {
    public int roll;
    public String name;
    public boolean passed;
    public HelloWorld(){
        roll=100;
        name="CSE";
        passed=true;
    }
    public static void main(String[] args) {
        HelloWorld helloWorld=new HelloWorld();
        System.out.println(helloWorld.name);
        System.out.println(helloWorld.roll);
    }
}
