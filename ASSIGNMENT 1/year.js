import java.util.*;
import java.io.*;
class year {
    public static void main(String args[]) {
        try {
            int d, y, w, y1;
            Scanner sc = new Scanner(System.in);
            int nod = sc.nextInt();
            if (nod <= 0)
                throw new ArithmeticException("invalid due to zero or negative value");
            y = nod / 365;
            y1 = nod % 365;
            w = y1 % 7;
            d = y1 % 7;
            system.out.print("year" + y);
            system.out.print("weeks" + w);
            system.out.print("days" + d);
        }
        catch (ArithmeticException e)
        {
            system.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            system.out.println("Invalid due to floating point");
        }
    }
}