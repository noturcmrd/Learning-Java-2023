package RandomCoding;

public class ResizeArray {
    public static String[] arrayNama = new String[5];
    public static void main(String[] args){
        for(int i = 0; i < arrayNama.length; i++){
            if(arrayNama[i] == null){
                arrayNama[i] = "Data ke-" + (i + 1);
            }
        }



        var isFull = true;
        for(int i = 0; i < arrayNama.length; i++){
            if(arrayNama[i] == null) {
                isFull = false;
                break;
            }
        }

        if(isFull){
            var temp = arrayNama;
            arrayNama = new String[arrayNama.length * 2];
            for(int i = 0; i < temp.length; i++){
                arrayNama[i] = temp[i];
            }
        }
        for(int i = 0; i < arrayNama.length; i++){
            if(arrayNama[i] == null){
                arrayNama[i] = "Data ke-" + (i + 1);
            }
        }



        System.out.println(arrayNama.length);
    }
}
