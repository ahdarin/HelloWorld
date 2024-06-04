package testesSahaja;

import java.util.Arrays;

public class probstat2 {

	public static void main(String[] args) {
		int[] a = {73,64,69,77,72,91,69,76,81,71,85,74,63,81,77,86,73,86,74,73,58,71,63,60,83,92,93,58,58,88,76,75,73,91,70,66,95,67,59,69,61,80,65,72,87,57,76,73,60,66,76,73,93,82,97,58,94,83,60,62};
		Arrays.sort(a);
		System.out.println("SORTED ARRAY :");
		 for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");

	            // Check if the next element is different
	            while (i < a.length - 1 && a[i] == a[i + 1]) {
	                System.out.print(a[i] + " ");
	                i++;
	            }
	            System.out.println(); 
		 }
		int kls1 = 0;
		int kls2 = 0;
		int kls3 = 0;
		int kls4 = 0;
		int kls5 = 0;
		int kls6 = 0;
		int kls7 = 0;
		
		for (int i=0;i<a.length;i++) {
			if (a[i]<=62) {
				kls1+=1;
			} else if (a[i]<=68) {
				kls2+=1;
			} else if (a[i]<=74) {
				kls3+=1;
			} else if (a[i]<=80) {
				kls4+=1;
			} else if (a[i]<=86) {
				kls5+=1;
			} else if (a[i]<=92) {
				kls6+=1;
			} else if (a[i]<=98) {
				kls7+=1;
			}
		}
		int total = kls1+kls2+kls3+kls4+kls5+kls6+kls7;
		System.out.println("jumlah frekuensi per kelas: ");
		System.out.println(kls1 + "\n" + kls2 + "\n" + kls3 + "\n" + kls4 + "\n" + kls5 + "\n" + kls6 + "\n" + kls7);
		System.out.println("total= " + total);
	}

}
