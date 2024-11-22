import java.util.Scanner;

public class SIAKAD14 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jmlMahasiswa, jmlMatkul;

        System.out.print("Masukkan Jumlah Mahasiswa  : ");
        jmlMahasiswa = sc.nextInt();
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        jmlMatkul = sc.nextInt();

        int [][] nilai = new int[jmlMahasiswa][jmlMatkul];

        for (int i = 0; i < jmlMahasiswa; i++){
            System.out.println("Input Nilai Mahasiswa ke-" + (i+1) + " : ");
            double totalPerSiswa = 0;

            for (int j = 0; j < jmlMatkul; j++){
                System.out.print("Nilai Mata Kuliah ke-" + (j+1) + " : ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata rata Mahasiswa ke-" + (i + 1) + " : " + (totalPerSiswa / jmlMatkul));
        }

        System.out.println("\n====================================");
        System.out.println("Rata rata Nilai Setiap Mata Kuliah: ");

        for (int j = 0; j < jmlMatkul; j++){
            double totalPerMatkul = 0;

            for (int i = 0; i < jmlMahasiswa; i++){
                totalPerMatkul += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j + 1) + " : " + (totalPerMatkul / jmlMahasiswa));
        }
    }
}
