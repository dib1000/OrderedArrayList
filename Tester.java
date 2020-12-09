import java.util.ArrayList;
public class Tester {
  public static void main(String[] args) {
      NoNullArrayList<String> t = new NoNullArrayList<String>();
      System.out.println(t.size());
      NoNullArrayList<String> n = new NoNullArrayList<String>(50);
      System.out.println(n.size());
  }
}
