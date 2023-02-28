public class Array {

    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Ari";
        stringArray[1] = "Yanwar";
        stringArray[2] = "Ramdani";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        String[] stringArray2 = new String[3];

        String[] namaNama = {
                "Ari", "Yanwar", "Ramdani"
        };
        System.out.println(namaNama.length);

        int[] arrayInt = new int[]{
                1,2,3,4,5,6,7,8,9,10
        };
        System.out.println(arrayInt.length);

        long[] arrayLong = {
                10L, 20L, 30L
        };
        System.out.println(arrayLong.length);


    }
}
