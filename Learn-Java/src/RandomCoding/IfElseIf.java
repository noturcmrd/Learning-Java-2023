package RandomCoding;

public class IfElseIf {
    public static void main(String[] args) {
        var jmlAngkot = 10;
        var angkotBeroperasi = 4;
        var noAngkot = 1;
        String[] alasan = new String[]{"Karena : ", "1. Sopir sedang sakit", "2. Belum isi bahan bakar", "3. Malas macet"};
        System.out.println("Dibuat menggunakan For : ");
        for(var i = 1; i <= jmlAngkot; i++){
            if(i > angkotBeroperasi){
                System.out.printf("Angkot No. %d tidak dapat beroperasi dengan baik.\n", i);
                if(i == jmlAngkot){
                    for(String alasan2: alasan){
                        System.out.println(alasan2);
                    }
                }
            }else{
                System.out.printf("Angkot No. %d beroperasi dengan baik.\n", i);
            }
        }
    }
}
