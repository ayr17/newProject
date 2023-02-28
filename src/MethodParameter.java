public class MethodParameter {

    public static void main(String[] args) {

        sayHello("Ari", "Yanwar");
        sayHello("Malka", "Azhar");

    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
