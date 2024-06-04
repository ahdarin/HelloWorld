package belajarUAP;

//belajar menggabungkan beberapa data menjadi satu objek dalam satu queue,
//dan memisahkan integer dari objek tadi. okeeeeee

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class pesanan {

	public String nama;
	public int harga;
	public String makan;
	
	public pesanan(String nama, int harga, String makan) {
		this.nama = nama;
		this.harga = harga;
		this.makan = makan;
	}
	
	public static void main (String[] args) {
		Queue<pesanan> queue = new LinkedList<>();
		
		pesanan data1 = new pesanan("ahda",18,"bruger");
		pesanan data2 = new pesanan("kintil",2,"roti jala maklimah biadap");
		
		queue.add(data1); queue.add(data2);
		
		Stack<Integer> stack = new Stack<Integer>();
		while(!queue.isEmpty()) {
			pesanan p = queue.peek();
			stack.add(p.harga);
			queue.remove();
		}
		System.out.println(stack);

	}
}
