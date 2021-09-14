import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Calculation c = new Calculation();
        c.getUserInput();
        c.longCalc();
        c.doubleCalc();
        c.stringAndNumberCalc();

    }
}
