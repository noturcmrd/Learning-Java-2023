package DeepLearning;

public class Learn {
    public static void main(String[] args) {
        Learn2 learn1 = new Learn2("Ridwan");
        learn1.proses(learn1.toString());

    }
}

class Learn2{
    String name;

    public Learn2(String name){
        this.name = name;
    }
    public static void proses(String name){
        System.out.println(name);
    }
}
