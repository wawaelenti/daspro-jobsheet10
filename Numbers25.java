import java.util.Arrays;

public class Numbers25 {
    
    public static void main(String[] args) {
        
        //deklarasi dan instansi array 2d
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        //cetak elemen array disetiap baris        
        for (int i=0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        //cetak panjang setiap baris
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);            
        }
    }
}
