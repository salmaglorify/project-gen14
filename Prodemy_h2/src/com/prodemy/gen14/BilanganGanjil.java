/**
 * 
 */
package com.prodemy.gen14;

/**
 * @author ASUS
 *
 */
public class BilanganGanjil {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x1 = 1;
		
		do {
			if (x1 % 2 != 0) {
				System.out.println(x1);
			}
			x1= x1+1;
		}while (x1<=4);

		
		boolean b1 = true;
		if (b1) {
			System.out.println("b1 bernilai true");
		} else {
			System.out.println("b1 bernilai false");
		}
	}

}
