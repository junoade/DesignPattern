package lecture.week12.command;

public class Agent {
    Order order;

    public void placeOrder(Order order){
        System.out.println("주문 명령 확인 " + order.toString());
        this.order = order;
        order.execute();
    }

}
