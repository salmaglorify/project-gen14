/**
 * 
 */
package com.prodemy.gen14.model;

import com.prodemy.gen14.util.StringUtil;

/**
 * @author ASUS
 *
 */
public class Barang {
	private String nama;
	private int harga;
	public int persediaan;
	
	public Barang() {} //default
	public Barang(String nama, int harga, int persediaan) {
		this.nama = nama;
		this.harga = harga;
		this.persediaan = persediaan;
	}
	
	public String getNama() {
		return this.nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	
	
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) throws Exception {
		if (harga>0) {
			this.harga = harga;
		} else {
			throw new Exception("Harga tidak boleh negatif");
		}
	}
	
	public int getPersediaan() {
		return this.persediaan;
	}
	public void setPersediaan(int persediaan) {
		this.persediaan = persediaan;
	}
	
	public String toString() {
		return "nama:"+this.nama+
				", harga:"+StringUtil.toRupiah(this.harga)+
				", stok:"+this.persediaan
				;
	}
}



