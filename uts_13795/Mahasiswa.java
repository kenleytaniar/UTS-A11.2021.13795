package uts_13795;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class Mahasiswa {

	ArrayList<String> alnim = new ArrayList<>();
	ArrayList<String> alnama = new ArrayList<>();
	ArrayList<Integer> alsemester = new ArrayList<>();
	ArrayList<Integer> alusia = new ArrayList<>();
	ArrayList<String> krs = new ArrayList<>();
	int n=0;
	int m=0;
	int k=4;
	
	
	
	void tambah() {
		Scanner masuk = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = masuk.next();
        System.out.print("Masukkan nim: ");
        String nim = masuk.next();
        System.out.print("Masukkan semester: ");
        int semester = masuk.nextInt();
        System.out.print("Masukkan usia: ");
        int usia = masuk.nextInt();
        
        
        n = n + 1;
        alnim.add(nim);
        alnama.add(nama);
        alsemester.add(semester);
        alusia.add(usia);
        
	}
	void tambahkrs() {
		
		Scanner masukrs = new Scanner(System.in);
		
		
        System.out.print("Masukkan matkul ke " + 1 + ":");
        String masuk1 = masukrs.next();
        System.out.print("Masukkan matkul ke " + 2 + ":");
        String masuk2 = masukrs.next();
        System.out.print("Masukkan matkul ke " + 3 + ":");
        String masuk3 = masukrs.next();
        System.out.print("Masukkan matkul ke " + 4 + ":");
        String masuk4 = masukrs.next();
        
        krs.add(masuk1);
        krs.add(masuk2);
        krs.add(masuk3);
        krs.add(masuk4);
      
        
              
	}
	
	
	float hitungRataNilai(int[] nilai) {
	
		float result;
		result = (float) 5.8;
		return result;
		
		
	}
	void infoMahasiswa() {

		for (int i = 0 ;i < n; ++i) {
			
			int z = i+1;
			String gnim = alnim.get(i);
			String gnama = alnama.get(i);
			int gsemester = alsemester.get(i);
			int gusia = alusia.get(i);
			
			System.out.print("murid ke " + z + ": ");
			System.out.print(gnama);
			System.out.print("," + gnim);
			System.out.print("," + gsemester);
			System.out.println("," + gusia);
			
		}
	}
	void infoKrsMahasiswa() {
		
		for (int i = 0 ;i < k; ++i) {	
			String gkrs = krs.get(i);			
			System.out.print(gkrs + ", ");
		}
		System.out.println();
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		}

}
