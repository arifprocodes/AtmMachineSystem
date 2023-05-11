import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int accountNumber=123;
        int accuntPin=123;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine ");
        System.out.print("Enter Account Number : ");
        int UserAccNumber = in.nextInt();
        System.out.print("Enter Pin : ");
        int UserPin = in.nextInt();
        if ((UserAccNumber==accountNumber)&&(UserPin==accuntPin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Diposit Amount\n4.View Statement\n5.Exit");
                System.out.println("Enter choice : ");
                int ch=in.nextInt();
                if(ch==1){
                    
                } else if (ch==2) {
                    
                } else if (ch==3) {
                    
                } else if (ch==4) {
                    
                } else if (ch==5) {
                    System.out.println("Collect your card\nThank you for using ATM Machine");
                    System.exit(0);
                    
                }else {
                    System.out.println("Enter Correct choice");
                }

            }
        }else {
            System.out.println("Incorrect Account or Pin ");
            System.exit(0);
        }
        

    }
}