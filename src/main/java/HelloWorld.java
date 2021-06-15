public class HelloWorld {
    public static String hello(){
        System.out.println("NoArgumentsHere");
        return "Hello, World!";
    }

    public static String hello(String name){
        System.out.println("OneArgumentHere");
        return "Hello, " + name + "!";
    }
}
