package lecture.week7.example04_mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        ChatRoom chatRoom1 = new ChatRoom();
        User user1 = new User("Park Seri", chatRoom1);
        User user2 = new User("Gildong", chatRoom1);

        /* user들이 sendMessage 하는 부분 */
        user1.sendMessage("Hi! Park Seri!");
        user2.sendMessage("Hello! Gildong!");

        /* 여러 유저에 대한 mediator인 ChatRoom에서 현재 채팅내용 출력 */
        chatRoom1.showMessage();
    }
}
