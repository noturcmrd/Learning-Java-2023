package DeepLearning;

public class ContravariantApp {
    public static void main(String[] args) {

//        Ex<Object> new10 = new Ex<>("Ridwan");
//        new10.setName(1000);
//        Ex<? super String> new11 = new10;
//
//        new10.proses(new10);
//

        Ex<Long> new12 = new Ex<>(100L);
        System.out.println(new12.getData());


    }
}
