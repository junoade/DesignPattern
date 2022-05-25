package lecture.week10.ex03;

import java.util.*;

public class PrototypeService {

    Map<String, Product> registry;

    public void register(String src, Product p) {
        // registry에 등록된 src 객체의 키와 값을 입력받는다.
        // 등록한다
        registry.put(src, p);
    }

    public Product create(String dest) {
        // dest 값에 맞는 키 값을 찾는다
        // 해당 Product 타입을 복사하여 반환한다.
        return registry.get(dest).createClone();
    }
}
