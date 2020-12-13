public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList() {
    super();
  }
  public OrderedArrayList(int InitialCapacity) {
    super(InitialCapacity);
  }

  private int findIndex(T element) {
    int index = 0;
    for(int i = 0; i<size(); i++) {
      if(element.compareTo(get(i))>=0) {
        index++;
      }
    }
    return index;
  }

  public boolean add(T element) {
    if (element==null) {
      throw new IllegalArgumentException("Null isn't a valid value");
    }
    super.add(findIndex(element), element);
    return true;
  }

  public void add(int index, T element) {
    if (element==null) {
      throw new IllegalArgumentException("Null isn't a valid value");
    }
    super.add(findIndex(element), element);
  }

  public T set(int index, T element) {
    if(element==null) {
      throw new IllegalArgumentException("Null is not a valid value");
    }
    T old = get(index);
    remove(index);
    add(element);
    return old;
  }
}
