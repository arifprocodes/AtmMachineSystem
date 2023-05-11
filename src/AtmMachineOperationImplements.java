public class AtmMachineOperationImplements implements AtmMachineOperation {
    ATM atm=new ATM();
    @Override
    public void viewBalance() {
    System.out.println("Available Balance is : "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        System.out.println("collect the cash "+withdrawAmount);
        atm.setBalance(atm.getBalance()-withdrawAmount);
        viewBalance();
    }

    @Override
    public void depositAmount(double depositAmount) {
        System.out.println(depositAmount+" Dollars deposited Successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();

    }

    @Override
    public void viewStatement() {

    }
}
