import java.util.Scanner;
public class bankingsystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double balance=0;
        System.out.println("welcome to the banking system!");
        boolean running=true;
        while (running){
            System.out.println("\nSelect an option:");
            System.out.println("1.Deposite");
            System.out.println("2.Withdraw");
            System.out.println("3.Check balance");
            System.out.println("4.Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                   System.out.println("Enter deposite amount:");
                   double depositeAmount=sc.nextDouble();
                   balance+=depositeAmount;
                   break;
                case 2:
                   System.out.println("Eadddnter withdraw amount:"); 
                   double withdrawAmount=sc.nextDouble();
                   if(withdrawAmount>balance)  {
                    System.out.println("Insufficient fund.");
                   }else{ 
                    balance-=withdrawAmount;
                    System.out.println("Withdraw Sucessful");
                   }
                   break;
                case 3:
                   System.out.println("Your current balance is:Rs "+balance);
                   break;
                case 4:
                   System.out.println("Thank You");
                   break;
                default:
                   System.out.println("Invalid Choice");   
            }
        }
        sc.close();
    }
}
