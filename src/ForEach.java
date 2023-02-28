public class ForEach {

    public static void main(String[] args) {

        String[] names = {
                "Ari", "Yanwar", "Ramdani",
                "Programer", "Zaman", "Now"
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");

        for (String name: names){
            System.out.println(name);
        }
    }
}
