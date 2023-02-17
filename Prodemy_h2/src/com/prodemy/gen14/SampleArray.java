/**
 * 
 */
package com.prodemy.gen14;

import java.util.Arrays;

/**
 * @author ASUS
 *
 */
public class SampleArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayGanjil = new int[5];	
		
		arrayGanjil[0] = 1;
		arrayGanjil[1] = 3;
		arrayGanjil[2] = 5;
		arrayGanjil[3] = 7;
		arrayGanjil[4] = 9;
				
		System.out.println(Arrays.toString(arrayGanjil));
	
		for (int i = 0; i < arrayGanjil.length; i++) {
			System.out.print(arrayGanjil[i] + " ");
		}
		
		System.out.println();
		
		String[] arrayString = new String[5];
		arrayString[0] = "text1";
		arrayString[1] = "text2";
		arrayString[2] = "text3";
		arrayString[3] = "text4";
		arrayString[4] = "text5";
		
		for (int i = 0; i < arrayString.length; i++) {
			System.out.print(arrayString[i] + " ");
		}

}
}
