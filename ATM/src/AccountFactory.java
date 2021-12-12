/**
 * Enables you to create additional accounts that are linked to the main account.
 * 
 * @see Account
 *
 */
public class AccountFactory extends Account {

   //This code is used for creating additional accounts to add to the database.
	/**
	 * Creates a new linked account.
	 * @param Username Name of the primary account holder
	 * @param theAccountNumber Account number of the primary account
	 * @param thePIN Pin number of the primary account
	 * @param theAvailableBalance Available balance in the primary account
	 * @param theTotalBalance Total balance in the primary account
	 * @param isadmin Is the user an administrator
	 */
	public AccountFactory(String Username, int theAccountNumber, int thePIN, double theAvailableBalance,
			double theTotalBalance, int isadmin) {
		super(Username, theAccountNumber, thePIN, theAvailableBalance, theTotalBalance, isadmin);
		setUsername(Username);
		setAccountNumber(theAccountNumber);
		setPin(thePIN);
		setAvailableBalance(theAvailableBalance);
	      setTotalBalance(theTotalBalance);
	      setAdmin(isadmin);
	}
	}

