package finalTest.service.studentInfo;

import java.util.ArrayList;

/**
 * 빌더 패턴
 * 2017112095 컴퓨터공학과 최준호
 */
public class StudentInfoBuilder {
    protected String id;
    protected String superId;
    protected String name;
    protected ArrayList<String> interests;
    protected ArrayList<String> relatedNames;

    public StudentInfoBuilder(String superId) {
        this.superId = superId;
        interests = new ArrayList<>();
        relatedNames = new ArrayList<>();
    }

    public StudentInfoBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public StudentInfoBuilder setSuperId(String superId){
        this.superId = superId;
        return this;
    }

    public StudentInfoBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentInfoBuilder addInterest(String interest) {
        if (!interests.contains(interest)) {
            interests.add(interest);
            System.out.println(interest + " 관심 내용이 목록에 추가되었습니다.");
        } else {
            System.out.println("이미 관심 목록에 있습니다.");
        }
        return this;
    }

    public StudentInfoBuilder addRelatedNames(String relatedName) {
        if (!relatedNames.contains(relatedName)) {
            relatedNames.add(relatedName);
            System.out.println(relatedName + " 관련 인물 목록에 추가되었습니다.");
        } else {
            System.out.println("이미 관련 인물 목록에 있습니다.");
        }
        return this;
    }

    public StudentInfo build() {
        return new StudentInfo(this);
    }
}
