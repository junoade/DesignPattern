package lecture.week10.ex04;

public abstract class Customer implements Cloneable {
    String user_name;
    String company_name;
    String type;

    public Customer clone() {
        try {
            Customer clone = (Customer) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
