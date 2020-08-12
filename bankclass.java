
public class bankclass

{
    String name;
    int aa;
    int id;
    int age;
    String sex;

    int accno;
    int bal;

    public int accno()
    {
        accno =  id + 1000;
        return accno;
    }

    public void dispdet()
    {
        System.out.println("Your Account Details");
        System.out.println("Name : " + name);
        System.out.println("Aadhar Number : " + aa);
        System.out.println("ID : " + id);
        System.out.println("Age : " + age);
        System.out.println("Sex : " + sex);
        System.out.println("Account Number : " + accno);
        System.out.println("Account Balance : " + bal);



    }

}
