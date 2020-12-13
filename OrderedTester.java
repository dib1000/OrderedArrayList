import java.util.ArrayList;
public class OrderedTester {
  public static void main(String[] args) {
    System.out.println("Testing constructors");
    OrderedArrayList a = new OrderedArrayList<Integer>();
    System.out.println(a.size());
    OrderedArrayList b = new OrderedArrayList<Integer>(50);
    System.out.println(b.size());
    System.out.println();

    System.out.println("Testing add");
    a.add(1);
    a.add(5);
    a.add(4);
    a.add(2);
    a.add(3);
    a.add(6);
    for(int i = 0; i<a.size(); i++) {
      System.out.println(a.get(i));
    }
    try{
      a.add(null);
    }
    catch(IllegalArgumentException e) {
      e.printStackTrace();
    }
  }
}
