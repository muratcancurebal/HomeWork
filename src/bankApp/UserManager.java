package bankApp;

public class UserManager {

	public void otomatikEmailOlustur(User user) {
		System.out.println(user.getEmail().toLowerCase());
	}

	public void bilgileriGoster(User user) {
		System.out.println("isim: " + user.getName() + " soyisim: " + user.getSurname() + " Hesap No: "
				+ user.getAccount().getHesapNo() + " Email Adress : " + user.getEmail() + " Hesap Bakiyeniz: "
				+ user.getAccount().getBakiye() + " Kalan Kredi Borcunuz: " + user.getAccount().getIstenenKredi());

	}

	public void krediBasvurusundaBulun(Account account, int para) {
		account.setKrediBasvurusu(true);
		account.setIstenenKredi(para);
		System.out.println(account.getIstenenKredi() + " TL kredi basvurusunda bulundunuz." + " Lutfen onay bekleyin.");

	}

	public void krediBorcuOdeme(Account account, double taksit) {

		if (account.getKrediBasvurusu() == false) {
			System.out.println("kredi borcunuz yoktur.");
		} else {
			account.setIstenenKredi(account.getIstenenKredi() - taksit);
			System.out.println(taksit + "TL borcunuzu ödediniz, Guncel borcunuz :" + account.getIstenenKredi());

		}
	}

}
