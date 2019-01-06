/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package merchantsbank;
import java.util.Scanner;
public class MerchantsBank {
    
    public String CustomerName;
    private String pword;
        public void Home()
        {
            System.out.println("Welcome to MERCHANTS BANK! SignIn if you have an account with us");
            System.out.println("OR REGISTER with us if you don't have an account with us to enjoy the best banking experience");
            
            System.out.println("Login if you have an account with us");
            
            
            try
            {
                 Scanner input = new Scanner(System.in);
                           
                System.out.println("Enter your Account Name");
                this.CustomerName = input.nextLine();
            
                System.out.println(" Enter your password");
                pword = input.nextLine();
             
                if ("Idiagbor Kenechukwu".equals(CustomerName) && "lovelybank".equals(pword))
                {
                    System.out.println("\nWelcome" + CustomerName);
                }
                else {
                    System.out.println("Invalid Username and Password");
                    
                }
            }
            catch (IllegalArgumentException exp)
                    {
                    System.out.println("Wrong entry" + exp);
                    
                    }
           
        }
       
        

        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MerchantsBank objMerchantsBank = new MerchantsBank();
        objMerchantsBank.Home();
        
        Account objAccount = new Account();
        objAccount.AccountDetails();
        
        Bank objBank = new Bank();
        objBank.displayAccountDetails("Idiaagbor Kenechukwu");
        objBank.createAccount();
        
        System.out.println("\n\n " + objMerchantsBank.CustomerName + " " + "To withdraw, Press 1" + "\n To Deposit Press 2");
        int ent;
        Scanner enter = new Scanner(System.in);
        ent = enter.nextInt();
        if(ent == 1)
        {
            objBank.withdraw();
        }
        
      
    }
}
    


