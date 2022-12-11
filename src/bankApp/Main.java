package bankApp;

public class Test {

	public static void main(String[] args) {

		Account account1 = new Account();
		AccountManager accountManager = new AccountManager();
		User user1= new User("Arda","Agdemir",account1);
		UserManager userManager = new UserManager();
		AdminManager adminManager = new AdminManager();
		
		
		accountManager.paraYatir(account1, 500);
		accountManager.paraYatir(account1, 2000);
		accountManager.paraCek(account1, 1000);
		accountManager.hesapBilgileriniGoster(account1);
		
		userManager.otomatikEmailOlustur(user1);
		userManager.bilgileriGoster(user1);
		userManager.krediBasvurusundaBulun(account1, 10000);
		adminManager.krediBasvurusunuOnayla(account1);
		
		accountManager.hesapBilgileriniGoster(account1);
		
		userManager.krediBorcuOdeme(account1, 1000);
		userManager.krediBorcuOdeme(account1, 1000);
		userManager.krediBorcuOdeme(account1, 1000);
		userManager.krediBorcuOdeme(account1, 1000);
		
		userManager.bilgileriGoster(user1);
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	}

}
