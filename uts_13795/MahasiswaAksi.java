package uts_13795;


public class MahasiswaAksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MahasiswaTransfer m = new MahasiswaTransfer();
		Mahasiswa a = new Mahasiswa();
		MahasiswaLulus l = new MahasiswaLulus();
		MahasiswaBaru b = new MahasiswaBaru();
		m.tambah();
//		m.tambah();
//		m.tambah();
		m.tambahkrs();
		
		m.infoKrsMahasiswa();
		m.infoMahasiswa();
		b.infoMahasiswaB();
		m.asal();
		m.infoMahasiswaT();
		
	
//		Scanner scanner = new Scanner(System.in);
//        String input = "";
//        
//        
//        // Loop utama untuk meminta input dari pengguna
//        while (!input.equals("exit")) {
//        	
//            System.out.print("Masukkan perintah (tambah/lihat/exit): ");
//            input = scanner.nextLine();
//            if (input.equals("tambah")) {
//            	
//            	m.tambah();
//            }
//            else if (input.equals("lihat")) {
//            	m.infoMahasiswa();
//            }
//            else if (input.equals("exit")) {
//            	System.out.println("Perintah tidak dikenali.");
//            }
//            
//        }
//		scanner.close();
//		
		

	
	}

}
