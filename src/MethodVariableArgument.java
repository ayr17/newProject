public class MethodVariableArgument {

    public static void main(String[] args) {

        int[] values = {85, 75, 70, 70};
        sayCongrats("Ari", values);

        sayCongrats("Budi", 90,80,75,80);
    }

    static void sayCongrats(String name, int... values){
        int total=0;
        for (int value : values){
            total += value;
        }
        int finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + " Anda Lulus");
        } else {
            System.out.println("Maaf " + name + " Anda Tidak Lulus");
        }
    }
}
