import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// BalanceInquiry.java
// Represents a balance inquiry ATM transaction
/**
 * Retrieves the available and total balances of an account and displays them on the screen.
 * 
 * @see BankDatabase
 * @see Screen
 * @see Account
 * 
 *
 */
public class BalanceInquiry extends Transaction
{
   // BalanceInquiry constructor
	/**
	 * Constructor. Initializes the parent {@link Transaction} class by passing the required account information.
	 * @param userAccountNumber Account number
	 * @param atmScreen Instance of the {@link Screen} class
	 * @param atmBankDatabase Instance of the {@link BankDatabase} class
	 */
   public BalanceInquiry(int userAccountNumber, Screen atmScreen, 
      BankDatabase atmBankDatabase)
   {
      super(userAccountNumber, atmScreen, atmBankDatabase);
   } // end BalanceInquiry constructor

   // performs the transaction
   @Override
   /**
    * Queries the bank database for the specified account, retrieves the available and total balances, and displays them on the screen.
    */
   public void execute()
   {
      // get references to bank database and screen
      BankDatabase bankDatabase = getBankDatabase();
      Screen screen = getScreen();

      // get the available balance for the account involved
      double availableBalance = 
         bankDatabase.getAvailableBalance(getAccountNumber());

      // get the total balance for the account involved
      double totalBalance = 
         bankDatabase.getTotalBalance(getAccountNumber());
      
      // display the balance information on the screen
      
      
      screen.creatBalanceGUI();
      screen.messageJLabel2.setText("Avaliable Balance: " + availableBalance);
      screen.messageJLabel3.setText("Total Balance: " + totalBalance);
      screen.Mainframe.revalidate();
      
   } // end method execute
   
  
} // end class BalanceInquiry



/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/