package lecture.week10.ex03;

// 복제 허용하기 위해서
public interface Product extends Cloneable {
    String use(String s, String token);
    Product createClone();
}
