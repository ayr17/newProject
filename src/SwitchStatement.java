public class SwitchStatement {

    public static void main(String[] args) {

        String nilai = "C";

        switch (nilai){
            case "A":
                System.out.println("Wow Anda Lulus Dengan Baik");
            break;
            case "B":
                System.out.println("Selamat Anda Lulus");
            break;
            case "C":
                System.out.println("Nilai Anda Cukup Baik");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Mungkin Anda Salah Jurusan");
        }
    }
}
