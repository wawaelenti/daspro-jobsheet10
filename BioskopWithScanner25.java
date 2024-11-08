import java.util.Scanner;

public class BioskopWithScanner25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        int baris, kolom;
        String nama, next;

        // Membuat array penonton 
        String[][] penonton = new String[4][2];

        // Menu untuk bioskop
        while (true) {
            System.out.println("\n==== MENU BIOSKOP ====");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Daftar Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine(); 

            if (menu == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();

                    boolean valid = false;

                    while (!valid) {
                        System.out.print("Masukkan baris (0-3): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (0-1): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 

                        // Validasi posisi valid atau tidak
                        if (baris < 0 || baris >= 4 || kolom < 0 || kolom >= 2) {
                            System.out.println("Nomor baris/kolom tidak valid! ");
                        } else if (penonton[baris][kolom] != null) {
                            System.out.println("Kursi sudah terisi! Silakan pilih kursi lain.");
                        } else {
                            penonton[baris][kolom] = nama;
                            valid = true; 
                        }
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } 
            else if (menu == 2) {
                System.out.println("\nDaftar Penonton yang Sudah Terisi:");
                boolean adaPenonton = false;

                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            System.out.println("Baris " + i + ", Kolom " + j + ": ***");
                        } else {
                            System.out.println("Baris " + i + ", Kolom " + j + ": " + penonton[i][j]);
                            adaPenonton = true;    
                        }
                    }
                }

                if (!adaPenonton) {
                    System.out.println("Belum ada penonton yang terdaftar.");
                }
            } 
            else if (menu == 3) {
                // untuk exit
                System.out.println("Terima kasih telah menggunakan aplikasi Bioskop kami ^_^ ");
                break;
            } 
            else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
