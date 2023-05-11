package uts_13795;

import java.util.Scanner;

public class MahasiswaLulus {

	int tahunwisuda;
	float ipk;
	boolean bwisuda;
	
	
	boolean ikutwisuda() {
		
		
		Scanner wisu = new Scanner(System.in);
        System.out.print("ikut wisuda? ");
        String w = wisu.next();
        if (w == "ikut") {
        	bwisuda = true;
        }
        else {
        	bwisuda = false;
        }
        return bwisuda;
        
	}
	void infoMahasiswaL() {
		ikutwisuda();
		Scanner entry = new Scanner(System.in);
        if (bwisuda == true) {
        	System.out.print("tahun berapa anda ikut wisuda? ");
            tahunwisuda = entry.nextInt();
            System.out.print("berapa ipk anda? ");
            ipk = entry.nextFloat();
            System.out.print("anda ikut wisuda pada tahun " + tahunwisuda + "dengan ipk " + ipk);
        }
        else {
        	System.out.print("anda tidak mengikuti wisuda ");
        }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
