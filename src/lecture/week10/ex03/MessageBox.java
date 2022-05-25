package lecture.week10.ex03;

public class MessageBox implements Product {
    @Override
    public String use(String s, String token) {
        return token + s + token;
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
