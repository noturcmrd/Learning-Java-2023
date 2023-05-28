package DeepLearning;

import javax.print.DocFlavor;

public class Ex<S extends Number> {
    private S data;



    public Ex(S data) {
        this.data = data;
    }



    public S getData() {
        return data;
    }

    public void setData(S data) {
        this.data = data;
    }

    static <I> int count(I[] dataArray){
        return dataArray.length;
    }

//    void proses(Ex<? super String> dataApa){
//        String dataString2 = (String) dataApa.getName();
//        System.out.println(dataString2);
//    }
}
