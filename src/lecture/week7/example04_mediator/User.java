package lecture.week7.example04_mediator;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 */
public class User {
    ChatRoom mediator; // 각 유저는 하나의 mediator를 참조한다.
    private String name;

    User(String name, ChatRoom mediator){
        this.name = name;
        this.mediator = mediator;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sendMessage(String msg){
        // LocalDate now = LocalDate.now(); 2022-04-19의 format
        mediator.addChatMessage(new Date(), name, msg);
    }
}
