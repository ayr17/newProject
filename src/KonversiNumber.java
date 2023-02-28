public class KonversiNumber {

    public static void main(String[] args) {

        byte iniBtye = 10;
        short iniShort = iniBtye;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        float iniFloat2 = (float) iniDouble;
        long iniLOng2 = (long) iniFloat2;
        int iniInt2 = (int) iniLOng2;
        short iniShort2 = (short) iniInt2;

    }
}
