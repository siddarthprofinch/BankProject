import java.util.Scanner;

public class bankmain

{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int a ;
        int b;
        int c;
        char ac;
        bankclass c1;
        c1 = new bankclass();
        Transclass t1;
        t1 = new Transclass();


        do
        {
            System.out.println("Hi! Welcome to XYZ Bank");
            System.out.println("1.Add New Customer");
            System.out.println("2.Create new Account");
            System.out.println("3.Transactions");
            System.out.println("4.Statement");
            System.out.println("Choose your option");

           a = sc.nextInt();

            if (a == 1)
            {

                    System.out.println("Enter Aadhar Number");
                    c1.aa = sc.nextInt();
                    System.out.println("Enter ID");
                    c1.id = sc.nextInt();
                    System.out.println("Enter Age");
                    c1.age = sc.nextInt();
                    System.out.println("Enter Sex(M/F)");
                    sc.nextLine();
                    c1.sex = sc.nextLine();
                    System.out.println("Enter Name");
                    c1.name = sc.nextLine();
            }

            if (a == 2)
            {
                System.out.println("Enter the Balance to deposit (Min : 2000)");
                b = sc.nextInt();
                if(b>=2000)
                {
                    c1.accno = c1.accno();
                    c1.bal = b;
                    c1.dispdet();
                    t1.bal = c1.bal;
                }
                else
                {
                    System.out.println("Please Deposit Minimum Balance");

                }

            }
            if (a == 3)
            {
                System.out.println("Enter Date(ddmmyyyy)");
                t1.date = sc.nextInt();
                System.out.println("For Debit enter 1, Credit Enter 2");
                c = sc.nextInt();

                if(c == 1)
                {
                    System.out.println("Enter Amount you want to Debit");
                    t1.tr = sc.nextInt();
                    t1.deb(t1.tr);
                }
                else if( c== 2)
                {
                    System.out.println("Enter Amount you want to Credit");
                    t1.tr = sc.nextInt();
                    t1.cred(t1.tr);
                }


            }
            if (a == 4)
            {
                t1.disptran();
            }


            System.out.println("Continue(Y/N)?");
            sc.nextLine();
            ac =  sc.next().charAt(0);

        } while (ac =='Y');

    }
}
