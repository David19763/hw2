package hw2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p19 {


public static void main (String[] arg)throws IOException{
	System.out.println("請問你是男生嗎?");
	System.out.println("請回答Y或N");
		
	BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
		
	String str = br.readLine();
	char letter = str.charAt(0);
	
	if(letter == 'Y'||letter == 'y') {
		System.out.println("ok你是男的");
	}
	else if(letter == 'N'||letter == 'n') {
		System.out.println("ok你是女的");
	}
	else {
		
		System.out.println("請輸入Y或N");
	}			
}

}