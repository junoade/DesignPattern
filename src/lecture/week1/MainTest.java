package lecture.week1;

//Basics 5
public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IllegalAccessException {
		Name n1 = new Name("Jane", "Black");
		System.out.println(n1.getInits() + " " + n1.getFirstAndLastName());
		System.out.println(n1.getLastCommaFirst());
		System.out.println();
		
		Name n2 = new Name("Mary", "Ann", "Smith");
		System.out.println(n2.getInits() + " " + n2.getFirstAndLastName());
		System.out.println(n2.getLastCommaFirst());
		System.out.println();
	}

}
