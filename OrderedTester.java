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
    System.out.println();
    b.add(1);
    b.add(0,5);
    b.add(0,3);
    b.add(0,2);
    b.add(0,4);
    b.add(0,6);
    for(int j = 0; j<b.size(); j++) {
      System.out.println(b.get(j));
    }
    try {
      b.add(4,null);
    }
    catch(IllegalArgumentException e) {
      e.printStackTrace();
    }
    System.out.println();

    System.out.println("Testing set methods");
    System.out.println(a.set(2,7));
    for(int k = 0; k<a.size(); k++) {
      System.out.println(a.get(k));
    }
    System.out.println(b.set(0,3));
    for(int l = 0; l<b.size(); l++) {
      System.out.println(b.get(l));
    }
    try {
      b.set(3,null);
    }
    catch(IllegalArgumentException e) {
      e.printStackTrace();
    }
  }
}
