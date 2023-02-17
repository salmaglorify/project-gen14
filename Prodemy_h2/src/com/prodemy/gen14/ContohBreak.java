/**
 * 
 */
package com.prodemy.gen14;

import java.util.Arrays;

import com.prodemy.gen14.model.Barang;
import com.prodemy.gen14.util.CollectionUtil;

/**
 * @author ASUS
 *
 */
public class ContohBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] daftarBilangan = new int[] {1,2,3,4};
		
		Barang[] daftarBarang = new Barang[] {
				new Barang("Oreo", 5000, 20),
				new Barang("Pocky", 3000, 15),
				new Barang("Regal", 8000, 7)
		};
		
		/*
		String yangDicari = "Pocky";
		String yangDitemukan = "";
		int ditemukanDiPosisi = -99;
		boolean apakahDitemukan = false;
		for (int i = 0; i < daftarBarang.length; i++) {
			Barang b = daftarBarang[i];
			if (b.getNama().equals(yangDicari)) {
				apakahDitemukan = true;
				yangDitemukan = b.getNama();
				ditemukanDiPosisi = i;
				break;
			}
		}
		System.out.println("apakahDitemukan:"+apakahDitemukan+", nama:"+yangDitemukan+", ditemukan di posisi:"+ditemukanDiPosisi);
		if (apakahDitemukan) {
			// lakukan promosi
		}
		
		for (Barang b : daftarBarang) {
			if (b.getNama().equals(yangDicari)) {
				apakahDitemukan = true;
				yangDitemukan = b.getNama();
				break;
			}
		}
		System.out.println("apakahDitemukan:"+apakahDitemukan+", nama:"+yangDitemukan);
				
		Barang barang = CollectionUtil.cariBarang(daftarBarang, "Ultra"); 
			System.out.println(barang);
		
		
			String yangDicari = "Ultra";
			barang = null;
			for (Barang b : daftarBarang) {
				if (b.getNama().equals(yangDicari)) {
					barang = b;
					break;
				}
			}
			System.out.println(barang);
			
			yangDicari = "Silverqueen";
			barang = null;
			for (Barang b : daftarBarang) {
				if (b.getNama().equals(yangDicari)) {
					barang = b;
					break;
				}
			}
			System.out.println(barang);

			
			barang = CollectionUtil.cariBarang(daftarBarang, "Ultra");
			System.out.println(barang);
			barang = CollectionUtil.cariBarang(daftarBarang, "Silverqueen");
			System.out.println(barang);
			barang = CollectionUtil.cariBarang(daftarBarang, "Regal");
			System.out.println(barang);
			*/
			
			CollectionUtil.urutkan(daftarBarang);
			System.out.println(Arrays.toString(daftarBarang));
	}

}
