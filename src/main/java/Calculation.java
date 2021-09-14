import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculation {

    public long long1 , long2;
    public double double1 , double2;
    public String string1;
    public double result;

    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);

    public void getUserInput() throws IOException
    {
        System.out.println("Enter first long number");
        long1=Long.valueOf(br.readLine());
        System.out.println("Enter second long number");
        long2=Long.valueOf(br.readLine());
        System.out.println("Enter first double number");
        double1=Double.valueOf(br.readLine());
        System.out.println("Enter second double number");
        double2=Double.valueOf(br.readLine());
        System.out.println("Enter string");
        string1=br.readLine();
    }

    public void longCalc()
    {
        System.out.println(long1+long2);
    }

    public void doubleCalc()
    {
        System.out.println(double1+double2);
    }

    public void stringAndNumberCalc()
    {
        System.out.println(string1+long1);
    }
}

