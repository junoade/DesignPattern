package lecture.week1;

import java.lang.reflect.Field;

//Basics 3
public class Name {
  private String firstName;
  private String middleName;
  private String lastName;

  public Name(String fName, String mName, String lName) {
		firstName = fName;
		middleName = mName;
		lastName = lName;
  }

  /* mName이 없을 경우에 대한 생성자 */
  public Name(String fName, String lName){
      this(fName, "", lName);
  }

  public String getFirstName() {return firstName; }
  public String getMiddleName() { return middleName; }
  public String getLastName() {return lastName; }

  public void setFirstName(String fn) {
	  firstName = fn;
  }
  public void setMiddleName(String mn) {
      middleName = mn;
  }
  public void setLastName(String ln) {
	  lastName = ln;
  }

  public String getFirstAndLastName() {
      return firstName + " " + lastName;
  }

  public String getLastCommaFirst() {
      return lastName + ", "+ firstName;
  }

  /* To get name initial */
  public String getInits() throws IllegalAccessException {
      StringBuilder sb = new StringBuilder();

      for(Field field : getClass().getDeclaredFields()){ // 해당 클래스의 인스턴스 멤버의 값들을 순회함
          String value = (String) field.get(this); // 현재 인스턴스 멤버의 값을 반환
          if(!isEmpty(value)){ // 값이 없을 땐 출력하지 않도록
              sb.append(value.charAt(0));
          }
      }

      return sb.toString();
  }

  /* 쉽게 name 관련 정보를 출력하기 위해 오버라이딩 */
  @Override
  public String toString(){
      StringBuilder sb = new StringBuilder();
      sb.append(getFirstName()).append(" ");
      if(!isEmpty(getMiddleName())){
          sb.append(getMiddleName().charAt(0)).append(" "); // middle Name의 경우 첫 이니셜만
      }
      sb.append(getLastName());
      return sb.toString();
  }

  public boolean isEmpty(String str){ return str == null || str.length() == 0; }
}

