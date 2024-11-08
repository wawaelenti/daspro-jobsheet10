public class Bioskop25 {
    
    public static void main(String[] args) {
       
        //buat array string 
        String[][] penonton = new String[4][2];
        
        //mengisi masing-masing elemen array
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";
        
        //menampilkan semua isi elemen 
        System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);

        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada Baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
        }
    }    
}
