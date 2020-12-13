import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList() {
    super();
  }
  
  public NoNullArrayList(int InitialCapacity) {
    super(InitialCapacity);
  }

  public T set(int index, T element) {
    if (element==null) {
      throw new IllegalArgumentException("Added element can't be null");
    }
    return super.set(index,element);
  }

  public boolean add(T element) {
    if(element==null) {
      throw new IllegalArgumentException("Added element can't be null");
    }
    return super.add(element);
  }
}
