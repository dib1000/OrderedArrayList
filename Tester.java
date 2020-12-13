import java.util.ArrayList;
public class Tester {
  public static void main(String[] args) {
      NoNullArrayList<String> t = new NoNullArrayList<String>();
      System.out.println(t.size());
      NoNullArrayList<String> n = new NoNullArrayList<String>(50);
      System.out.println(n.size());
      for(int i = 0; i<10; i++) {
        t.add("fix");
      }
      System.out.println(t.set(5,"well"));
      System.out.println(t.size());
      try{
        t.set(0,null);
      }
      catch(IllegalArgumentException e) {
        e.printStackTrace();
      }
      System.out.println();

      System.out.println("Testing add");
      System.out.println(t.add("fee"));
      System.out.println(t.size());
      try {
        t.add(null);
      }
      catch(IllegalArgumentException e) {
        e.printStackTrace();
      }
      t.add(5, "hi");
      System.out.println(t.get(5));
      try {
        t.add(5,null);
      }
      catch(IllegalArgumentException e) {
        e.printStackTrace();
      }
  }
}
