public class Transclass extends bankclass
{
    int tr;
    int date;
    String shtr = "";


    public void deb(int a)
    {



        if (a > bal)
        {
            System.out.println("Insufficient Balance");
        }
        else
        {
            bal = bal - a;
            System.out.println("Debit Successful");
            System.out.println("Balance : " + bal);
            shtr = shtr + "Debited amount of " + a + " on " + date + "(ddmmyyy)" + ", " ;
        }


    }

    public void cred(int a)
    {

            bal = bal + a;
            System.out.println("Credit Successful");
            System.out.println("Balance : " + bal);
            shtr = shtr + "Credited amount of " + a + " on " + date + "(ddmmyyy)" + ", ";

    }

    public void disptran()
    {
        System.out.println("Here are your Transactions");
        System.out.println(shtr);
        System.out.println("Available Balance is " + bal);

    }
}
