import java.util.Scanner;

public class SIAKAD25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //jml siswa dan jml matkul
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();

        //membuat array 
        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Input nilai mahasisawa ke-" + (i+1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah "+ (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/ jumlahMataKuliah);
        }

        //menghitung nilai rata2 setiap mata kuliah 
        System.out.println("========================================");
        System.out.println("Rata-rata Nilai setiap Mata Kuliah:");

        for(int j = 0;j< jumlahMataKuliah; j++) {
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": "+ totalPerMatkul / jumlahSiswa);
        }

    }
}
