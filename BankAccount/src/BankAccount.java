/*
3)
+---------------------------------------+
  BankAccount3
+---------------------------------------+
  -customerName:String
  -accountId:String
  -balance:Double
  -INTEREST_RATE:Integer
+---------------------------------------+
  +deposit(amount:Double)
  +withdraw(amount:double):Double
  +getBalance():Double
  +monthlyInterest():Double

  +getCustomerName():String
  +setCustomerName(name:String)
  +getAccountId():String
  +setAccountId(id:String)
  +equals():boolean
  +toString():String

+---------------------------------------+
*/


    /**
     * This class creates a bank account allowing the
     * account holder to deposit and withdraw funds
     *
     * @author Bret
     */
    public class BankAccount {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            /** Bank abbount holder name **/
            private String customerName;
            /** account id. must start with uppercase 'S' and be six characters in length **/
            private String accountId;
            /** current balance for the account in dollars **/
            private double balance;

            /** yearly interest rate **/
            public static final int INTEREST_RATE = 10;

            /**
             * Deposit money into the account. The balance increase by this amount
             * @param amount -
             */}

        public void deposit(double amount) {
            if (amount > 0) {
                // amount cannot be a negative value
                balance += amount;
            } else {
                System.out.println("Deposit amount must be greater than zero");
                System.out.println("Balance unchanged");
            }

        }


        public double withdraw(double amount) {
            double withdrawn = 0;
            if (amount < 0) {
                // amount cannot be a negative value
                System.out.println("Withdraw amount must be greater than zero");
                System.out.println("Balance unchanged");
            } else {
                withdrawn = amount;
                balance -= amount;
            }

            return withdrawn;
        }


        public double getBalance() {
            return balance;
        }


        public double monthlyInterest() {
            return ((double) INTEREST_RATE / 100) / 12 * balance;
        }


        public boolean equals(BankAccount other) {
            if (accountId.equals(other.accountId) && customerName.equals(other.getCustomerName())) {
                return true;
            }
            return false;
        }


        public String getCustomerName() {
            return customerName;
        }


        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }


        public String getAccountId() {
            return accountId;
        }


        public void setAccountId(String accountId) {
            if (accountId.charAt(0) != 'S') {
                // accountId must start with uppercase 'S' and be 6 characters in length
                System.out.println(accountId.charAt(0));
                System.out.println("Invalid account format.\nAccount ID must start with an uppercase letter 'S'.");
            } else {
                if (accountId.length() != 6) {
                    System.out.println("Invalid account format.\nAccount format must be 6 characters long");
                } else {
                    this.accountId = accountId;
                }
            }
        }


        public String toString() {
            String s = String.format("%s %s %f", accountId, customerName, balance);
            return s;
        }
    }







        /*
            // BankAccount
            BankAccount account = new BankAccount();
            account.customerName = "Bob Lewis"; // able to access class instance variables
            account.accountId = "S1234";
            account.balance = 100.0;
            // monthly interest rate = annual interest rate / 12
            double monthlyInterestRate = ((double)account.INTEREST_RATE / 100) / 12;
            double monthlyInterest = (monthlyInterestRate * account.balance);

            System.out.printf("%s %s Balance: %.2f Interest: %d%%%n", account.customerName, account.accountId, account.balance, account.INTEREST_RATE);
            //System.out.printf("Monthly interest: %.2f%n", account.monthlyInterest);
            System.out.printf("Monthly rate of interest: %.5f%n", monthlyInterestRate); //%.5f display a floating point number to 5 decimal places
            System.out.printf("Monthly interest on account balance: %.5f%n", monthlyInterest);
            System.out.printf("First months balance: %.2f%n", account.balance + monthlyInterest); // calculating balance to include the monthly interest
            System.out.println("");


            // BankAccount2
            BankAccount2 account2 = new BankAccount2();

            account2.customerName = "Bob Lewis";
            account2.accountId = "S1234";
            account2.deposit(100.00);
            double balance = account2.getBalance();

            System.out.println("Account2 balance: " + balance);

            double account2MonthlyInterest = account2.monthlyInterest();
            System.out.println("Account2 monthly Interest: " + account2MonthlyInterest);

            System.out.println();


            // BankAccount3
            BankAccount3 account3 = new BankAccount3();
            //account3.setAccountId("12345"); // test program - account id must start with 'S'


            account3.setCustomerName("Bob Lewis");
            account3.setAccountId("S12345");
            account3.deposit(100.0);
            double account3monthlyInterest = account3.monthlyInterest();
            System.out.println("account3 monthly interest: " + account3monthlyInterest);

            BankAccount3 account4 = new BankAccount3();
            account4 = account3;  // the address of account3 is assigned to account4

            // account4 and account3 are equal. They both point to the same place
            // in memory

            if(account4.equals(account3)){
                System.out.println("These accounts are equal");
            }else{
                System.out.println("These accounts are not equal");
            }

            System.out.println("BankAccount 3 toString()");
            System.out.println("account3 and account4 point to the same place in memory");
            System.out.println(account4);
            System.out.println(account3);
        */


