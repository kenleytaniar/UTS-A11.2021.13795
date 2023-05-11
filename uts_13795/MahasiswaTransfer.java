package uts_13795;

import java.util.Scanner;

public class MahasiswaTransfer extends MahasiswaBaru{
	
	String asalUniv;
	void asal() {
		Scanner s = new Scanner(System.in);
		
		
        System.out.print("asal universitas: " );
        asalUniv = s.next();
	}
	
	void infoMahasiswaT() {
		
		System.out.print("asal universitas: " + asalUniv);
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
