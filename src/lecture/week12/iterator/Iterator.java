package lecture.week12.iterator;

public interface Iterator<E> { // Type-Paramter E
    void reset();   // reset to the first element
    E next();   // To get the next element
    E currentItem();    // To retrieve the current element
    boolean hasNext();  // To check whether there is any next element or not.
}
