package testesSahaja;
import java.util.Scanner;
public class NIMbuilder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		
		System.out.print("1. Tahun masuk: ");
		String tahun = input.next();
		if (tahun.length()!=4) {
			System.out.println("Tahun yang anda input salah");
			System.exit(0); //force stop the program
		}
		char satu = tahun.charAt(2); //index sequences 0 1 2 ...
		char dua  = tahun.charAt(3); //charAt untuk memanggil karakter ke-index

		
		System.out.println("(ket: 1=Fakultas Teknologi Informasi; 2=Fakultas Kesehatan Masyarakat)\n(input angka saja)");
		System.out.print("2. Fakultas: ");
		int fakultas = input.nextInt();
		int tigake5=0; 
		int enam=0;
		/**
		 * 0 adalah dummy value
		 * dummy value diperlukan karena variabel enam dan tigake5 diinisialisasi KEMBALI didalam blok
		 * jika tidak diberi dummy value, maka dianggap tidak diinisialisasi jika dipanggil diluar blok
		 */
		switch (fakultas) {
		case 1:
			tigake5 = 115;
			System.out.print("3. Jurusan: ");
			Scanner input1=new Scanner(System.in); // scanner dipanggil lagi, soalnya kalau pakai scanner paling atas, tidak bisa input
			String jurusanFTI=input1.nextLine(); //switch case dalam switch case sepertinya tidak eror
			if (jurusanFTI.equalsIgnoreCase("teknik komputer")) { //tapi saya pakai if karena pakai equalsIgnoreCase
				enam=1;
			} else if (jurusanFTI.equalsIgnoreCase("sistem informasi")) {
				enam=2;
			} else if (jurusanFTI.equalsIgnoreCase("informatika")) {
				enam=3;
			} else {
				System.out.println("Jurusan yang anda input salah");
				System.exit(1);
			}
			break;
		case 2:
			tigake5 = 112;
			System.out.print("3. Jurusan: ");
			Scanner input2=new Scanner(System.in);
			String jurusanFakesmas=input2.nextLine();
			if (jurusanFakesmas.equalsIgnoreCase("kesehatan masyarakat")) {
				enam=1;
			} else if (jurusanFakesmas.equalsIgnoreCase("gizi")) {
				enam=2;
			} else {
				System.out.println("Jurusan yang anda input salah");
				System.exit(2);
			}
			break;
		default:
			System.out.println("Angka yang anda input salah (perhatikan keterangan)");
			System.exit(3);
		}
		
		System.out.println("(ket:\n1=SNBP/SNMPTN/undangan\n2=SNBT/SBMPTN/UTBK"
				+ "\n3=Mandiri\n4=Prestasi Mandiri)"
				+ "\n(input angka saja)");
		System.out.print("4. Jalur Masuk: ");
		int jalur = input.nextInt();
		int tujuh=0; //dummycode lagi
		switch (jalur) {
		case 1:
			tujuh=1;
			break;
		case 2:
			tujuh=2;
			break;
		case 3:
			tujuh=3;
			break;
		case 4:
			tujuh=7;
			break;
		default:
			System.out.println("Angka yang anda input salah (perhatikan keterangan)");
			System.exit(4);
		}
		
		System.out.print("5. Nomor BP: ");
		String bpku=input.next();
		String bp=null; //null sebagai dummy
		if (bpku.length()==1) {
			bp = "00"+bpku;
		}
		else if (bpku.length()==2) {
			bp = "0"+bpku;
		}
		else if (bpku.length()==3) {
			bp = bpku;
		}
		else {
			System.out.println("BP anda seharusnya 3 digit!");
			System.exit(5);
		}
		
		int ka1=Character.getNumericValue(satu); //untuk mengganti char ke int
		int ka2=Character.getNumericValue(dua); //same syntax to change char to long, double, etc.
		// int ka8=Integer.parseInt(bp); //mengganti string ke int
		
		//saatnya kita susun
		//bisa juga System.out.print satu satu


		int a= ka1*1000000;
		int b = ka2*100000;
		int c = tigake5*100;
		int d = enam*10;
		int e = tujuh;
		int NIMtanpaBP=a+b+c+d+e;
		
		System.out.println();
		System.out.println("NIM Anda adalah : ");
		for (int i=1;i<=10;i++) {
			System.out.println(NIMtanpaBP+bp);
		}
		input.close();
	}
	

}
