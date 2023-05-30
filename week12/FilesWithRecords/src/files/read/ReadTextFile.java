package files.read;// Fig. 14.11: ReadTextFile.java
// This program reads a text file and displays each record.
import data.AccountRecord;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;



public class ReadTextFile
{
   private Scanner input;

   // enable user to open file
   public void openFile()
   {
      try
      {
         input = new Scanner( new File( "clients.txt" ) );
      } // end try
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "Error opening file." );
         System.exit( 1 );
      } // end catch
   } // end method openFile

   // read record from file
   public void readRecords()
   {

      System.out.printf( "%-10s%-12s%-12s%10s\n", "Account", "First Name", "Last Name", "Balance" );

      try // read records from file using Scanner object
      {
         while ( input.hasNext() )
         {

            var record = new AccountRecord(input.nextInt(),input.next(),input.next(),input.nextDouble());
            // display record contents using the overriden toString() method in record Accountrecord
            System.out.println( record );
         } // end while
      } // end try
      catch ( NoSuchElementException elementException )
      {
         System.err.println( "File improperly formed." );
         input.close();
         System.exit( 1 );
      } // end catch
      catch ( IllegalStateException stateException )
      {
         System.err.println( "Error reading from file." );
         System.exit( 1 );
      } // end catch
   } // end method readRecords

   // close file and terminate application
   public void closeFile()
   {
      if ( input != null )
         input.close(); // close file
   } // end method closeFile
} // end class ReadTextFile
