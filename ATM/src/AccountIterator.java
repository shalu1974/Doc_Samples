import java.util.ArrayList;

//This class is responsible the Iterator design pattern
/**
 * Creates the iterator design patterns for an account.
 * 
 * @see Account
 * 
 *
 */

public class AccountIterator implements Iterator {
    ArrayList<Account> accounts;
    /**
     * Constructor. Retrieves the existing iterator ArrayList for the account.
     * @param accounts2 Account 
     */
    public AccountIterator(ArrayList<Account> accounts2) {
		this.accounts = accounts2;
	} //This obtains an already existing ArrayList for use within this class.
    
    
    //This function returns true if the ArrayList has a space next to the current one
    /**
     * Determines if the iterator ArrayList has a space next to the current position.
     * @param position Current position in the ArrayList
     * @return True if the current position is a space, else False
     */
	public boolean hasNext(int position) {
		if (position >= accounts.size()) {
			return false;
		} else {
			return true;
		}
	}
	

	@Override //This function iterates to the next position in the ArrayList.
	/**
	 * Iterates to the next position in the ArrayList.
	 * @param position Current position in the ArrayList
	 * @return Object 
	 */
	public Object next(int position) {
		Account AccountItem = accounts.get(position);
		return AccountItem;
	}


	@Override
	//This function checks when the position is at 0, and prevents the user from going back even further. 
	/**
	 * Checks if the user at position 0 to prevent the user from going back further.
	 * @param position Current position
	 * @return True if the position is 0, else False.
	 */
	public boolean hasPrev(int position) {
		if(position == 0)
		return false;
		else
			return true;
	}
	



	

}
