public class RecusiveMethod {

    public static void main(String[] args) {

        System.out.println(factorialLoop(10));
        System.out.println(factorialRecusive(10));

        loop(10);
    }

    static int factorialLoop(int value){
        int result = 1;

        for (int counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
        }

        static int factorialRecusive(int value) {
            if (value == 1) {
                return 1;
            } else {
                return value * factorialRecusive(value - 1);
            }
        }

        static void loop(int value){
        if (value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop " + value);
            loop(value -1);
        }
        }
    }



