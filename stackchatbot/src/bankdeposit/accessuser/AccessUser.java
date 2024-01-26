package bankdeposit.accessuser;
import  bankdeposit.accessuser.AccountHolder ;
import bankdeposit.accessuser.AccesUserDataViewModel;
import java.util.Scanner;

public class AccessUser {
	
	private AccesUserDataViewModel accesUserDataViewModel ;
	
	public AccessUser() {
		accesUserDataViewModel = new AccesUserDataViewModel(this);
	}
	
	public void getCandidateInfo() {
		//getinfo logic
		Scanner sc = new Scanner(System.in);
		AccountHolder accountHolder = new AccountHolder();
		accountHolder.setName(sc.nextLine());
		accesUserDataViewModel.validate(accountHolder);
	}
	public void onSuccess() {
		System.out.println("Inserted Successfully");

	}
	public void showError(String errorMessage) {
		System.out.println(errorMessage);
	}

}
