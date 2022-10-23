package hw2;

public class p49 {
	public static void main (String[] arg) {
		
		int[][]test;
		test=new int[2][5];
		
		test[0][0]=90;
		test[0][1]=74;
		test[0][2]=29;
		test[0][3]=86;
		test[0][4]=48;
		test[1][0]=75;
		test[1][1]=93;
		test[1][2]=62;
		test[1][3]=61;
		
		for(int i=0;i< test[1].length;i++) {
			System.out.println("第"+(i+1)+"名的國語分數是"+test[0][i]);
			System.out.println("第"+(i+1)+"名的數學分數是"+test[1][i]);
		}
		
	}

}
