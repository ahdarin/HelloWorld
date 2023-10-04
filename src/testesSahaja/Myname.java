package testesSahaja;

import java.util.Scanner;

public class Myname {

	public static void main(String[] args) {
		Scanner intro = new Scanner(System.in);
		System.out.println("Siapa nama lengkapmu?");
		String namaku = intro.nextLine();
		System.out.println("Nama panggilanmu apa?");
		String panggilanku = intro.nextLine();
		System.out.println("tanggal berapa ulang tahunmu?");
		int tanggal = intro.nextInt();
		intro.close();
		
		System.out.println("Halo " + namaku + ", " + 
		                   "bolehkah aku memanggilmu dengan panggilan " + panggilanku + "?" );
		if (tanggal==25){
			System.out.println("Wah! Tanggal ulang tahun kita sama!");
			
			} else if (tanggal>31) {
				System.out.println("Kau ulang tahun tanggal "+ tanggal +"? Terserah kau lah babi!");
		} else if (tanggal<=0) {
			System.out.println("Kau ulang tahun tanggal "+ tanggal +"? Otak kau minus!");
		} else {
			System.out.println("Ulang tahunmu tanggal " + tanggal + " ya? Kalau aku tanggal 25.");
		}

	}

}
