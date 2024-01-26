package bankdeposit;

import com.bankvisit.userviewmodel.BankDepositModel;
import com.bankvisit.userviewmodel.BankDepositView;

public class BankDeposit {
//	    private BankDepositModel model;
//	    private BankDepositView view;
//
//	    public BankDeposit(BankDepositModel model, BankDepositView view) {
//	        this.model = model;
//	        this.view = view;
//	    }
	    public static void main(String[] args) {
			Bankdepositt bankdeposit=new Bankdeposit();
			bankdeposit.processUserChoice();
		}

	 private void processUserChoice() {
	        int choice;
	        do {
	            choice = view.getUserChoice();
	            switch (choice) {
	                case 1:
	                    double amountToDeposit = view.getDepositAmount();
	                    model.makeDeposit(amountToDeposit);
	                    view.displayMessage("Deposit of Rs" + amountToDeposit + " was successful.");
	                    break;
	                case 2:
	                    double balance = model.getTotalBalance();
	                    view.displayBalance(balance);
	                    break;
	                case 3:
	                    view.displayMessage("Exiting...");
	                    break;
	                default:
	                    view.displayMessage("Invalid choice. Try again.");
	                    break;
	            }
	        } while (choice != 3);
	    }
	}
