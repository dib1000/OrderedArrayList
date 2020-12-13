import java.util.ArrayList;
public class OrderedTester {
  public static void main(String[] args) {
    OrderedArrayList a = new OrderedArrayList<Integer>();
    System.out.println(a.size());
    OrderedArrayList b = new OrderedArrayList<Integer>(50);
    System.out.println(b.size());
  }
}
