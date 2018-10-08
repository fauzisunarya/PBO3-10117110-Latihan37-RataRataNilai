
package pbo3.pkg10117110.latihan37.rataratanilai;

import java.util.Scanner;


public class rataRata {
    public int banyakMHS,nilai[];
    public float rata2,jumlah;
    Scanner scan = new Scanner(System.in);
    
    
    public void input(){
                //Input jumlah mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        
    

    }
    public void hitungRata2(){
        
        banyakMHS = scan.nextInt();
        
        //Inisialisasi array
        nilai = new int[banyakMHS];
 
        //Input nilai
        for(int i=0;i<= banyakMHS-1;i++){
            System.out.print("Nilai Mahasiswa ke- " + (i+1) + " : ");
            nilai[i] = scan.nextInt();
            System.out.println();
        }
 
        //Hitung Jumlah
        for(int j=0;j<= banyakMHS-1;j++){
            jumlah = jumlah + nilai[j];
        }
 
        //Hitung Rata-rata
        rata2 = jumlah/banyakMHS;
 
        //Output
        System.out.println("Maka Rata-rata Nilainya adalah : " + rata2);
        
    }
}
