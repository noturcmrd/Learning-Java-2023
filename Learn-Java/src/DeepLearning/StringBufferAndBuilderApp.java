package DeepLearning;

import java.util.StringJoiner;

public class StringBufferAndBuilderApp {
    public static void main(String[] args) {

        StringBuffer string1 = new StringBuffer();
        string1.append("Ridwan");
        string1.append("K01");

        StringBuilder string2 = new StringBuilder();
        string2.append("Agus");
        string2.append("K02");


        System.out.println(string1);
        System.out.println(string2);
        String profile = string1.toString();
        String profile2 = string2.toString();
        System.out.println(profile);
        System.out.println(profile2);


        String[] kalimat1 = new String[]{"Saya", "bernama", "Ridwan"};
        StringJoiner gabung = new StringJoiner(" ", "", "");
        for(String kalimat : kalimat1){
            gabung.add(kalimat);
        }

        System.out.println(gabung);

    }
}
