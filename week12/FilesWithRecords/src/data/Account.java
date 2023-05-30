// Fig. 14.5: Account.java
// A class that represents one record of information.
package data; // packaged for reuse

public class Account
{
   private int account;
   private String firstName;
   private String lastName;
   private double balance;
   
   // no-argument constructor calls other constructor with default values
   public Account()
   {
      this( 0, "", "", 0.0 ); // call four-argument constructor
   } // end no-argument Account constructor
  
   // initialize a record
   public Account(int acct, String first, String last, double bal )
   {
      setAccount( acct );
      setFirstName( first );
      setLastName( last );
      setBalance( bal );
   } // end four-argument Account constructor

   // set account number   
   public void setAccount( int acct )
   {
      account = acct;
   } // end method setAccount

   // get account number   
   public int getAccount() 
   { 
      return account; 
   } // end method getAccount
   
   // set first name   
   public void setFirstName( String first )
   {
      firstName = first;
   } // end method setFirstName

   // get first name   
   public String getFirstName() 
   { 
      return firstName; 
   } // end method getFirstName
   
   // set last name   
   public void setLastName( String last )
   {
      lastName = last;
   } // end method setLastName

   // get last name   
   public String getLastName() 
   {
      return lastName; 
   } // end method getLastName
   
   // set balance  
   public void setBalance( double bal )
   {
      balance = bal;
   } // end method setBalance

   // get balance   
   public double getBalance() 
   { 
      return balance; 
   } // end method getBalance
} // end class Account
