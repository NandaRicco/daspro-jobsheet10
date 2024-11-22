import java.util.Scanner;

public class TugasTeori14 {

    public static void main(String[] args) {

        Scanner plg = new Scanner(System.in);

        int[][] nilaiSurvei = new int[10][6];
        double rataRata, total = 0;

        System.out.println("Masukkan Nilai Survei (1-5) : ");

        for (int i = 0; i < nilaiSurvei.length; i++) {
            System.out.println("Input Nilai Responden " + (i + 1) + " : ");
            for (int j = 0; j < nilaiSurvei[i].length; j++) {
                System.out.print("Nilai " + (j + 1) + " : ");
                nilaiSurvei[i][j] = plg.nextInt();
                if (nilaiSurvei[i][j] < 1 || nilaiSurvei[i][j] > 5) {
                    System.out.println("Nilai harus antara 1-5!");
                    j--;
                }
            }
        }

        System.out.println("Nilai Rata Rata Setiap Responden : ");
        for (int i = 0; i < nilaiSurvei.length; i++) {
            rataRata = 0;
            for (int j = 0; j < nilaiSurvei[i].length; j++) {
                rataRata += nilaiSurvei[i][j];
            }
            System.out.println("Responden " + (i + 1) + " : " + (rataRata / 6));
        }

        System.out.println("Nilai Rata Rata Setiap Pertanyaan : ");
        for (int j = 0; j < nilaiSurvei[0].length; j++) {
            rataRata = 0;
            for (int i = 0; i < nilaiSurvei.length; i++) {
                rataRata += nilaiSurvei[i][j];
            }
            System.out.println("Pertanyaan " + (j + 1) + " : " + (rataRata / 10));
        }

        for (int i = 0; i < nilaiSurvei.length; i++) {
            for (int j = 0; j < nilaiSurvei[i].length; j++) {
                total += nilaiSurvei[i][j];
            }
        }
        System.out.println("Nilai Rata Rata Keseluruan : " + (total / (10 * 6)));
    }

}
