import java.util.Scanner;

public class BioskopWithScanner14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama, data;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("======= Menu =======");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan data penonton");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.print("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();

                if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <= 2) {
                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Berhasil memesan kursi");
                    } else {
                        System.out.println("Kursi sudah terisi, pilih yang lain");
                    }
                } else {
                    System.out.println("Baris atau kolom tidak tersedia");
                }

            } else if (menu == 2) {
                System.out.println("======= Daftar Penonton =======");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            data = "***";
                        } else {
                            data = penonton[i][j];
                        }
                        System.out.print(data + "\t");
                    }
                    System.out.println();
                }

            } else if (menu == 3) {
                System.out.println("Terimakasih");
                break;

            } else {
                System.out.println("Menu tidak valid! Pilih menu yang tersedia.");
            }
        }
    }
}