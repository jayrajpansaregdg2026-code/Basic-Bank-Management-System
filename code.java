import java.util.*;
public class code {
    public static void main(String[] args) 
    {
        int no=-1;
        Scanner jay = new Scanner(System.in);
        while (no !=0) 
        {
        System.out.println("Enter Your Name");
        String name = jay.next();
        System.out.println("Enter The Ammount");
        int Balence = jay.nextInt();
        System.out.println("Account Holder Name = "+ name);
        System.out.println("Your Avalible Balance = "+Balence);
        System.out.println("What You Want To Do?\n 1.Deposit\n 2.Withdraw");
        int ope = jay.nextInt();

        switch (ope)
         {
            case 1:
                System.out.println("Enter The Amouunt That You Want To Deposite = ");
                int dep = jay.nextInt();
                System.out.println("The Current Balance Is = "+(Balence+dep));
                break;
            case 2 :
                System.out.println("Enter the Ammount that you want to with");
                int with = jay.nextInt();
                System.out.println("The Current Balance Is = "+(Balence-with));
                break;
            case 0:
                System.out.println("THANK YOU");
                no=0;
                break;
            default:
                break;
         }
        }
        
    }
}
