package finalTest.service.studentInfo;

import java.util.ArrayList;

public class StudentInfo {
    private String id;
    private String superId;
    private String name;
    private ArrayList<String> interests;
    private ArrayList<String> relatedNames;

    StudentInfo(StudentInfoBuilder builder) {
        id = builder.id;
        superId = builder.superId;
        name = builder.name;
        interests = builder.interests;
        relatedNames = builder.relatedNames;
    }

    public String getSuper_id() {
        return superId;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    public ArrayList<String> getRelatedNames() {
        return relatedNames;
    }
}
