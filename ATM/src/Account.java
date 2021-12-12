
// Account.java

/**
 * 
 * Represents the following bank account information:</br>
 * Account number</br>
 * Available balance</br>
 * Name of the account holder </br>
 * Total balance and available balance </br>
 * ATM pin number of the account holder </br>
 *   
 * 
 */
public class Account 
{
   private int accountNumber; // account number
   private int pin; // PIN for authentication
   private double availableBalance; // funds available for withdrawal
   private double totalBalance; // funds available + pending deposits
   private int admin;
   private String username;

   // Account constructor initializes attributes
   /**
    * 
    * @param Username Account holder's name
    * @param theAccountNumber Account number
    * @param thePIN ATM pin number
    * @param theAvailableBalance Available balance in the account
    * @param theTotalBalance Total balance, including the pending transaction
    * @param isadmin If the ATM user is an administrator
    **/
   public Account(String Username, int theAccountNumber, int thePIN, 
      double theAvailableBalance, double theTotalBalance, int isadmin)
   {
	   setUsername(Username);
      setAccountNumber(theAccountNumber);
      setPin(thePIN);
      setAvailableBalance(theAvailableBalance);
      setTotalBalance(theTotalBalance);
      setAdmin(isadmin);
   } // end Account constructor

   // determines whether a user-specified PIN matches PIN in Account
   /**
    * Checks if the pin number entered is correct.</br>
    * <pre>
    * Example: 
    * 
    * Account Acct1=new Account(); 
    * 
    * If(Acct1.validatePIN(Integer.parseInt(PinNumber.getText()))==False) 
    * { 
    * System.out.println("Invalid pin."); 
    * }
    * </pre>
    * @param userPIN Entered pin
    * @return If the pin is valid or not
    */
      public boolean validatePIN(int userPIN)
   {
      if (userPIN == getPin())
         return true;
      else
         return false;
   } // end method validatePIN
   
   // returns available balance
      /**
       * Returns available balance
       * @return Account balance for the user account
       */
   public double getAvailableBalance()
   {
      return availableBalance;
   } // end getAvailableBalance

   // returns the total balance
   /**
    * Returns the total account balance, including the pending transactions.
    * @return Total account balance
    */
   public double getTotalBalance()
   {
      return totalBalance;
   } // end method getTotalBalance

   // credits an amount to the account
   /**
    * Credits the provided amount into the account.
    * @param amount Amount to be credited into the account
    */
   public void credit(double amount)
   {
      setTotalBalance(getTotalBalance() + amount); // add to total balance
   } // end method credit

   // debits an amount from the account
   /**
    * Debits the specified amount from the account. This method also updates both available and total balances for the account.
    * @param amount Amount to be debited
    */
   public void debit(double amount)
   {
      setAvailableBalance(getAvailableBalance() - amount); // subtract from available balance
      setTotalBalance(getTotalBalance() - amount); // subtract from total balance
   } // end method debit

   // returns account number
   /**
    * Gets the account number.
    * @return Account number
    */
   public int getAccountNumber()
   {
      return accountNumber;  
   } // end method getAccountNumber
   
   /**
    * Checks if the current user is an administrator.
    * @return 1 for true and 0 for false
    */
   public int getISadmin()
   {
	   return getAdmin();  
   }
   /**
    * Gets the pin number.
    * @return Pin number
    */
   
   public int GetPin(){
	   return getPin();
   }
/**
 * Gets account user name
 * @return User name
 */
public String getUsername() {
	return username;
}
/**
 * Sets the account user name.
 * @param username Account user name
 */
public void setUsername(String username) {
	this.username = username;
}
/**
 * Sets the account number
 * @param accountNumber Account number
 */
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
/**
 * Gets the pin number.
 * @return Pin number
 */
public int getPin() {
	return pin;
}
/**
 * Sets pin number.
 * @param pin Pin number
 */
public void setPin(int pin) {
	this.pin = pin;
}
/**
 * Sets available balance to the specified amount.
 * @param availableBalance Available balance
 */
public void setAvailableBalance(double availableBalance) {
	this.availableBalance = availableBalance;
}
/**
 * Sets total balance to the specified amount.
 * @param totalBalance Total balance
 */
public void setTotalBalance(double totalBalance) {
	this.totalBalance = totalBalance;
}
/**
 * Gets admin.
 * @return Admin
 */
public int getAdmin() {
	return admin;
}
/**
 * Sets admin.
 * @param admin Admin
 */
public void setAdmin(int admin) {
	this.admin = admin;
}
   
  
   
} // end class Account


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