package lecture.week7.example04_mediator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 여러 User에 대한 mediator 역할,
 */
public class ChatRoom {
    StringBuffer chats;

    public ChatRoom(){
        chats = new StringBuffer();
    }

    public void addChatMessage(Date date, String user, String msg){
        chats.append(date).append(" [").append(user).append("] : ").append(msg).append("\n");
    }

    public void showMessage(){
        System.out.println(chats.toString());
    }


}
