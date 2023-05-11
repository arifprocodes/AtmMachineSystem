import java.util.HashMap;
import java.util.Map;

public class AtmMachineOperationImplements implements AtmMachineOperation {
    ATM atm=new ATM();
    Map<Double,String> statement = new HashMap<>();
    @Override
    public void viewBalance() {
    System.out.println("Available Balance is : "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount<= atm.getBalance()){
            statement.put(withdrawAmount,"Dollars withdrawn");
            System.out.println("collect the cash "+withdrawAmount);
            atm.setBalance(atm.getBalance()-withdrawAmount);
            viewBalance();

        }else{
            System.out.println("Insufficient Balance");
        }

    }

    @Override
    public void depositAmount(double depositAmount) {
        statement.put(depositAmount,"Dollars Deposited");
        System.out.println(depositAmount+" Dollars deposited Successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void viewStatement() {
        for(Map.Entry<Double,String> m: statement.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        viewBalance();
    }
}
