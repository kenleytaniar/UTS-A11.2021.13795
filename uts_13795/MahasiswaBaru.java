package uts_13795;

import java.util.Scanner;

public class MahasiswaBaru extends Mahasiswa{

	String asalsekolah;
	boolean hasil; 
	
	boolean ikutospek(int tes) {
		
			
			int gsemester = alsemester.get(tes);
			if (gsemester == 1 ) {
				
				hasil = true;
			}	
			else if(gsemester == 2) {
				hasil =  true;
			}
			else {				
				hasil =  false;
			}						
		
		return hasil;
	}
	void infoMahasiswaB() {

		for (int i = 0 ;i < n; ++i) {
			ikutospek(i);
			String gnama = alnama.get(i);
			if (hasil == true) {
				 System.out.print( gnama + " ikut ospek");
			}
			else {
				System.out.print( gnama + " tidak ikut ospek");
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
