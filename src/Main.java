import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int accountNumber=123;
        int accuntPin=123;
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to ATM Machine ");
        System.out.print("Enter Account Number : ");
        int UserAccNumber = in.nextInt();
        System.out.print("Enter Pin : ");
        int UserPin = in.nextInt();
        if ((UserAccNumber==accountNumber)&&(UserPin==accuntPin)){
            while(true){
                System.out.print("1.View Available Balance\n2.Withdraw Amount")
            }
        }else {
            System.out.println("Incorrent Account or Pin ");
            System.exit(0);
        }


    }
}