package DeepLearning;



public class MainApp {
    public static void main(String[] args) {
//        Data<Manager> new1 = new Data<>(new Manager());
        Data<VicePresident> new2 = new Data<>(new VicePresident());
        System.out.println();
    }

    public static interface CanSayHello{
        String sayHello(String name);
    }

    public static abstract class Employee{

    }
    public static class Manager extends Employee{

    }

    public static class VicePresident extends Employee implements CanSayHello{
        public String sayHello(String name){
            return "Hello, " + name;
        }
    }

    public static class Data<T extends Employee & CanSayHello>{
        private T data;

        public T getData() {
            return data;
        }

        public Data(T data) {
            this.data = data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
