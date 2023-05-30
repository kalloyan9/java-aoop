package files.query;// Fig. 14.14: CreditInquiry.java
// This program reads a file sequentially and displays the
// contents based on the type of account the user requests 
// (credit balance, debit balance or zero balance).

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.IllegalStateException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import data.AccountRecord;

public class CreditInquiry {
    private MenuOption accountType;
    private Scanner input;
    private MenuOption choices[] = {MenuOption.ZERO_BALANCE,
            MenuOption.CREDIT_BALANCE, MenuOption.DEBIT_BALANCE,
            MenuOption.END};

    // read records from file and display only records of appropriate type
    private void readRecords() {
        // open file to read from beginning
        try (var input = new Scanner(new File("clients.txt")))
        {
            while (input.hasNext()) // input the values from the file
            {
                var record = new AccountRecord(input.nextInt(), input.next(), input.next(), input.nextDouble());
                // read account number
                // read first name
                // read last name
                // read balance

                // if proper acount type, display record
                if (shouldDisplay(record.bal()))
                    System.out.println(record);
            } // end while
        } // end try
        catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed.");
            input.close();
            System.exit(1);
        } // end catch
        catch (IllegalStateException stateException) {
            System.err.println("Error reading from file.");
            System.exit(1);
        } // end catch
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println("File cannot be found.");
            System.exit(1);
        } // end catch

    } // end method readRecords

    // use record type to determine if record should be displayed
    private boolean shouldDisplay(double balance) {
        if ((accountType == MenuOption.CREDIT_BALANCE)
                && (balance < 0))
            return true;

        else if ((accountType == MenuOption.DEBIT_BALANCE)
                && (balance > 0))
            return true;

        else if ((accountType == MenuOption.ZERO_BALANCE)
                && (balance == 0))
            return true;

        return false;
    } // end method shouldDisplay

    // obtain request from user
    private MenuOption getRequest() {
        Scanner textIn = new Scanner(System.in);
        int request = 1;

        // display request options
        System.out.println("""
                Enter request
                 1 - List accounts with zero balances 
                 2 - List accounts with credit balances 
                 3 - List accounts with debit balances
                 4 - End of run
                """);

        try // attempt to input menu choice
        {
            do // input user request
            {
                System.out.print("\n? ");
                request = textIn.nextInt();
            } while ((request < 1) || (request > 4));
        } // end try
        catch (NoSuchElementException elementException) {
            System.err.println("Invalid input.");
            System.exit(1);
        } // end catch

        return choices[request - 1]; // return enum value for option
    } // end method getRequest

    public void processRequests() {
        // get user's request (e.g., zero, credit or debit balance)
        accountType = getRequest();

        while (accountType != MenuOption.END) {
            switch (accountType) {
                case ZERO_BALANCE:
                    System.out.println("\nAccounts with zero balances:\n");
                    break;
                case CREDIT_BALANCE:
                    System.out.println("\nAccounts with credit balances:\n");
                    break;
                case DEBIT_BALANCE:
                    System.out.println("\nAccounts with debit balances:\n");
                    break;
            } // end switch

            readRecords();
            accountType = getRequest();
        } // end while
    } // end method processRequests
} // end class CreditInquiry
