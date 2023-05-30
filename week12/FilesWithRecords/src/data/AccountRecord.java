package data;

public record AccountRecord(int acct, String first, String last, double bal ) {
    @Override
    public String toString() {
        return String.format("%-10d%-12s%-12s%10.2f%n", acct, first,last, bal );
    }
}
