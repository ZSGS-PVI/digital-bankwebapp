package bankdeposit.accessuser;

class AccesUserDataViewModel {
	private AccessUser accessuser;
	
	public AccesUserDataViewModel(AccessUser accessuser){
		this.accessuser = accessuser;
	}
	
	public void validate(AccountHolder accountHolder) {
		if(accountHolder.getName().equals("kalpana")&&accountHolder.getAccountNo()==123456789) {
			//insert into DB
			 BankdepositReposotory .getInstance().insertCandidate(accountHolder);
			
			this.accessuser.onSuccess();
		}else {
			this.accessuser.showError("Invalid Name - Name length should be min 3 and Max 50");
		}
		
	}


}
