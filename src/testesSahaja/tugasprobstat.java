package testesSahaja;

import java.util.Arrays;

public class tugasprobstat {

	public static void main(String[] args) {
		int[] a = {13,23,22,24,15,16,10,18,17,35,23,28,17,18,12,25,11,22,11,27,14,21,35,36,20,17,14,24,15,22,9,37,16,16,36,26,18,23,19,15,35,12,22,30,19,24,21,23,14,15,11,24,20,31,22,15,13,14,15,18,22,32,23,12,17,25,16,14,10,22,16,16,8,24,12,26,8,21,19,9};
		Arrays.sort(a);
		System.out.println("SORTED ARRAY :");
		 for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");

	            // Check if the next element is different
	            while (i < a.length - 1 && a[i] == a[i + 1]) {
	                System.out.print(a[i] + " ");
	                i++;
	            }
	            System.out.println();  // Move to the next line after printing the group
		 }
	

		/*
		 * 5-9
		 * 10-14
		 * 15-19
		 * 20-24
		 * 25-29
		 * 30-34
		 * 35-39
		 */
		int kls1 = 0;
		int kls2 = 0;
		int kls3 = 0;
		int kls4 = 0;
		int kls5 = 0;
		int kls6 = 0;
		int kls7 = 0;
	
		for (int i=0;i<a.length;i++) {
			if (a[i]<=9) {
				kls1+=1;
			} else if (a[i]<=14) {
				kls2+=1;
			} else if (a[i]<=19) {
				kls3+=1;
			} else if (a[i]<=24) {
				kls4+=1;
			} else if (a[i]<=29) {
				kls5+=1;
			} else if (a[i]<=34) {
				kls6+=1;
			} else if (a[i]<=39) {
				kls7+=1;
			}
		}
		int total = kls1+kls2+kls3+kls4+kls5+kls6+kls7;
		int formean=0;
		for (int i = 0; i < a.length; i++) {
			formean+=a[i];
		}
		System.out.println("total "+formean);
		double mean = (double) formean/total;
		System.out.println("mean= " + mean);

	}

}
