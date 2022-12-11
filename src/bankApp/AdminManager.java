package bankApp;

public class AdminManager {

	void krediBasvurusunuOnayla(Account account) {
		if (account.getKrediBasvurusu() == true) {
			System.out.println("basvurunuz onaylandi.");
			account.setBakiye(account.getBakiye() + account.getIstenenKredi());
		} else {
			System.out.println("krei basvurunuz bulunmamaktadir.");
		}

	}

	void krediBasvurusunuReddet(Account account) {
		if (account.getKrediBasvurusu() == true) {
			System.out.println("kredi basvurunuz reddedildi");
			account.setIstenenKredi(0);
		} else {
			System.out.println("kredi basvurusu bulunmamaktadir");
		}
	}

}
