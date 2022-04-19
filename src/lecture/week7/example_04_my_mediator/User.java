package lecture.week7.example_04_my_mediator;

public class User {
    ChatMediator mediator;

    private String name;

    User(String name, ChatMediator mediator){
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

    }
}
