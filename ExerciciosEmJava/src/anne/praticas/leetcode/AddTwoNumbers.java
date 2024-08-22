package anne.praticas.leetcode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		
		int[] l1 = new int[]{2,4,3};
		int[] l2 = new int[]{5,6,4};
		int[] resultado = new int[7];
		int[] carry = new int[]{0,0,0,0,0,0,0,0};
		
		for(int i=0; i<l1.length; i++) {

			
			if(l1[i] + l2[i] < 10) {
			resultado[i] = l1[i] + l2[i] + carry[i];
		}
			else {
				resultado[i]=(l1[i] + l2[i])%10;
				carry[i+1] = (l1[i] + l2[i])/10;
			}
			
			System.out.println(resultado[i] + ",");
	}

	}
		

}
