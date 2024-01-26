package bankdeposit.repository;

import java.util.ArrayList;
import java.util.List;
import bankdeposit.accessuser.AccessUser;
import bankdeposit.accessuser.AccountHolder;

public class BankdepositReposotory {

	
	private static  BankdepositReposotory repository;
	private List<AccountHolder> candidatesList = new ArrayList<AccountHolder>(); 
	
	private  BankdepositReposotory() {
		
	}
	
	public static  BankdepositReposotory getInstance() {
		if(repository == null) {
			repository = new  BankdepositReposotory();
		}
		return repository;
	}

	public void insertCandidate(AccountHolder accountHolder ) {
		candidatesList.add(accountHolder );
	}
	
	public List<AccountHolder> getCandidatesList(){
		return candidatesList;
	}
}
