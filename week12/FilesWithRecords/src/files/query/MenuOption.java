package files.query;// Fig. 14.13: MenuOption.java
// Defines an enum type for the credit-inquiry program's options.

public enum MenuOption
{
   // declare contents of enum type
   ZERO_BALANCE( 1 ),
   CREDIT_BALANCE( 2 ),
   DEBIT_BALANCE( 3 ),
   END( 4 );

   private final int value; // current menu option

   MenuOption( int valueOption )
   {
      value = valueOption;
   } // end MenuOptions enum constructor

   public int getValue()
   {
      return value;
   } // end method getValue
} // end enum MenuOption
