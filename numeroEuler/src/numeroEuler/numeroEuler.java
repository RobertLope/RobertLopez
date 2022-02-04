package numeroEuler;

import java.util.Scanner;

import java.lang.Math;



public class numeroEuler {
	
	public static void main(String[]args) {
		
		Scanner lector = new Scanner(System.in);
		int quan = 0;
		double num = 0;
		int contador=0;
		quan=lector.nextInt();
		double res[] = new double[quan];
		while(contador<quan) {
			num=lector.nextDouble();
			res[contador]= Math.pow((1+(1/num)), num);
			contador++;
		}
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
		
	}
	
	

}
