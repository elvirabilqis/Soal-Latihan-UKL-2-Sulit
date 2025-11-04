import java.util.Scanner;

public class LatihanUKL2Sulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah Baris Matriks: ");
        int baris = input.nextInt();
        System.out.println("Masukkan Jumlah Kolom Matriks: ");
        int kolom = input.nextInt();

        int[][] matriksA = new int[baris][kolom];
        int[][] matriksB = new int[baris][kolom];
        int[][] hasilJumlah = new int[baris][kolom];

        System.out.println("/nMasukkan elemen-elemen Matriks A: ");
        for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
            System.out.print("A[" + i + "][" + j + "] = ");
            matriksA[i][j] = input.nextInt();;
        }
    }
        System.out.println("\nMasukkan elemen-elemen Matriks B: ");
        for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
            System.out.print("B[" + i + "][" + j + "] = ");
            matriksB[i][j] = input.nextInt();;
        }
    }

        // Menjumlahkan Matriks A dan B
        for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
            hasilJumlah[i][j] = matriksA[i][j] + matriksB[i][j];
        }
    }

        // Menampilkan Hasil Penjumlahan Matriks
        System.out.println("\nHasil Penjumlahan Matriks A dan B:");
        for (int i = 0; i < baris; i++) {
        for (int j = 0; j < kolom; j++) {
            System.out.print(hasilJumlah[i][j] + "\t");
        }
        System.out.println();
    }

        input.close();

    }
}
    