package hw2;

public class p39 {
	public static void main(String[] args) {
		
		int [] test;
		test=new int[5];
		
		test[0]=70;
		test[1]=83;
		test[2]=91;
		test[3]=40;
		test[4]=72;
		
		for(int i=0;i<5;i++) {
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
		}
	}
}
