public class MethodOverLoading {

    public static void main(String[] args) {

        sayHello();
        sayHello("Ari");
        sayHello("Ari", "Yanwar");
    }

    static void sayHello(){
        System.out.println("Hello");
    }

    static void sayHello(String name){
        System.out.println("Hello");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
