import java.io.*;

public class X123456789 implements PolynomialInterface{
    private LinkedList<Term> data;

    public Polynomial(String s) {
        
    }

    public Polynomial divide(Polynomial p) throws Exception{
        throw UnsupportedOperationException;
    }
    public Polynomial remainder(Polynomial p) throws Exception{
        throw UnsupportedOperationException;
    }

    public final String toString() {
        String ans = "";
        boolean starting = true;
        try {
           DNode<Term> n = data.getFirst();
           while (n != null) {
              if (!starting && n.getData().isPositive()) ans += " +";
              starting = false;
              ans += " " + n.getData().toString();
              n = data.getNext(n);
           }
        } catch (Exception e) {
           if (starting) return "0";
        }
        return ans;
     }

    public static void main(String args[]) throws Exception{
		Polynomial p = new X123456789("2X^5 + 3X^3"), q = new X123456789("2X^2 + 9X^5 + 3X^3");
		Utility.run(p, q);
    }
}