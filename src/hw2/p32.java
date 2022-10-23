package hw2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class p32 {
	public static void main(String[] args)throws IOException {
		System.out.println("請問要在第幾次結束迴圈?(1~10)");
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		
		String str =br.readLine();
		int res = Integer.parseInt(str);
		
		for(int i=1;i<11;i++) {
			System.out.println("第"+i+"次的處理");
			if(i==res) {
				break;
			}
		}
	}
}
