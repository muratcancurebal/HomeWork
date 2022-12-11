package bankApp;

public class AccountManager {

	public void paraYatir(Account account, double miktar) {
		if (miktar < 10000) {
			account.setBakiye(account.getBakiye() + account.getIstenenKredi() + miktar);
			System.out.println(miktar + " yatirdiniz, guncel bakiyeniz "+ account.getBakiye());
		} else {
			System.out.println("10000 TL'den cok yatirmazsiniz");

		}
	}

	public void paraCek(Account account, double miktar) {
		if (miktar > account.getBakiye()) {
			System.out.println("bakiyeniz yetersizdir.");
		} else {
			account.setBakiye(account.getBakiye() - miktar);
			System.out.println(miktar +" para cektiniz, guncel bakiyeniz "+ account.getBakiye());
		}
	}

	public void hesapBilgileriniGoster(Account account) {
		System.out.println("Hesap No: " + account.getHesapNo() +", mecvut bakiyeniz: " + account.getBakiye());
	}

}
