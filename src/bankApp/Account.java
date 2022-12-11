package bankApp;

import java.util.Random;

public class Account {

	private String hesapNo;
	private double bakiye;
	private boolean krediBasvurusu;
	private double istenenKredi;

	public Account() {
		int randomSayi = (int) (Math.random() * 100000);
		String stringRamdomSayi = String.valueOf(randomSayi);
		this.hesapNo = stringRamdomSayi;
		this.bakiye = 0;

	}

	public String getHesapNo() {
		return hesapNo;
	}

	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public boolean getKrediBasvurusu() {
		return krediBasvurusu;
	}

	public void setKrediBasvurusu(boolean krediBasvurusu) {
		this.krediBasvurusu = krediBasvurusu;
	}

	public double getIstenenKredi() {
		return istenenKredi;
	}

	public void setIstenenKredi(double istenenKredi) {
		this.istenenKredi = istenenKredi;
	}

}
