package lecture.week9.builder;

public class User {
    private final String firstName;    //required
    private final String lastName;    //required
    private final int age;    //optional
    private final String phone;    //optional
    private final String address;    //optional

    protected User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    @Override
    public String toString(){
        return "[firstName : " + firstName + ", lastName : " + lastName + ", age : " + age + ", phone : " + phone
                + ", address : " + address + "]";
    }
    public static class UserBuilder{
        private final String firstName;    //required
        private final String lastName;    //required
        private int age;    //optional
        private String phone;    //optional
        private String address;    //optional

        /* required 인자는 받도록 하기 */
        public UserBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        /* optional 은 필요할 때 마다, setter()를 이용하고, 반환은 인스턴스 자신을 반환.*/
        public UserBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public UserBuilder setPhone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder setAddress(String address){
            this.address = address;
            return this;
        }

        /* 최종적으로 사용할 User 인스턴스를 현재 UserBuilder 인스턴스에 근거하여 생성 */
        public User build(){
            return new User(this);
        }

    }

}
