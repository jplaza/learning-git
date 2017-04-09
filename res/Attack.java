
public class Attack {
  public static void main(String[] args) {
    // Attack the internals of a Range instance - Page 185
    MyNumber start = new MyNumber(1);
    MyNumber end = new MyNumber(100);
    Range r = new Range(start, end);
    System.out.println("Before 1st attack");
    System.out.println(r);
    start.setNum(new Integer(2)); // Modifies internals of r!
    System.out.println("Attack #1");
    System.out.println(r);

    // Second attack on the internals of a Range instance
    start = new MyNumber(1);
    end = new MyNumber(50);
    r = new Range(start, end);
    System.out.println("Before 2nd attack");
    System.out.println(r);
    r.end().setNum(new Integer(69)); // Modifies internals of r!
    System.out.println("Attack #2");
    System.out.println(r);
  }
}