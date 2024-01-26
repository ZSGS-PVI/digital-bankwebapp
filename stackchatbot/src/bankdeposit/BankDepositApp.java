package bankdeposit;

import com.bankvisit.userviewmodel.BankDepositModel;
import com.bankvisit.userviewmodel.BankDepositView;

public class BankDepositApp {
    public static void main(String[] args) {
    	
        BankDepositModel model = new BankDepositModel();
        BankDepositView view = new BankDepositView();
        BankDeposit controller = new BankDeposit(model, view);

        System.out.println("Welcome to the Bank Deposit Application!");
        controller.processUserChoice();
    }
}
