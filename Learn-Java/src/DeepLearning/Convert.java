package DeepLearning;

public class Convert {
    public static void main(String[] args) {
        Integer value = 10;
        int valueInt = value.intValue();
        System.out.println(value);
        System.out.println(valueInt);

        double valueD = value.doubleValue();
        System.out.println(valueD);
        System.out.println();

        String angka1 = "10000000";
        int angkaInt = Integer.parseInt(angka1);
        Integer angkaInteger = Integer.valueOf(angka1);
        System.out.println(angkaInt);
        System.out.println(angkaInteger);


        Long long1 = 10L;
        int angka2 = long1.intValue();
        System.out.println(angka2);
    }
}
