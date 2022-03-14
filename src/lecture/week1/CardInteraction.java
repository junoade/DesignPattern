package lecture.week1;/*
 * OOP Assignment 1
 * Contains methods for interaction with user
 */
import java.util.Scanner;
public class CardInteraction {
	private Scanner scanner;
	private CardOrder card;

	/* static 상수들 선언 */
	private static final int MAX_NAME_LEN = 28;
	private static final int MAX_CARD_AMOUNT = 1000;
	private static final int MIN_CARD_AMOUNT = 1;
	private static final int DEF_SINGULAR_NUMBER = 1;

	public CardInteraction() {
		scanner = new Scanner(System.in);
	}
	
	//runs the program as follows:
	//Gets details of card name from user
	//Displays card
	//Repeatedly, until user responds ok
	//	Asks the user if they would like to change the border
	//	If so, change the border and print the new card
	//Print the price of the order
	//print whether a discount is applicable or not
	public void run() throws IllegalAccessException {
		//Alter this gradually to add more details
		CardOrder order = new CardOrder(getNameFromUser());
		String inputLine = "";
		int LIMIT_ToChar = 1;

		/* 샘플 카드 입력 로직 */
		while(true){
			System.out.println("\nHere is a sample card:");
			System.out.print(order.getSampleCard());

			System.out.print("\nEnter \"OK\" if this card is ok, otherwise enter an alternative border character: ");
			inputLine = scanner.next();

			if(inputLine.equals("OK")){
				break;
			}else if(inputLine.length() == LIMIT_ToChar){
				char cmd = inputLine.charAt(0);
				order.setBorder(cmd);
			}else{ // 잘못된 입력의 경우
				System.out.println("\n>> Please enter \"OK\" or a single character for the input");
			}
		}
		/* 가격 계산 로직 */
		System.out.println();
		int amount = getNumberFromUser();
		order.setNumCards(amount);

		StringBuilder sb = new StringBuilder();
		sb.append("\nThe price of ").append(amount);
		if(amount > DEF_SINGULAR_NUMBER){ // 카드의 수가 복수인지 단수인지에 따라 다르게 출력하도록
			sb.append(" cards ");
		}else{
			sb.append(" card ");
		}
		sb.append("is ").append(order.getFinalCost()).append(" won.");

		System.out.println(sb);
		if(order.hasDiscount())
			System.out.println(CardOrder.DISCOUNT_RATE * 100.0 + "% discount applied");
		else
			System.out.println("No discount given");


	}

	//repeatedly requests and reads name from user
	//until valid (i.e. <=28 chars and contains at least one space
	//finally returns the valid text
	private String getNameFromUser() {
		//use this value until more code written
		String fullName = "";
		while(true){
			System.out.print("Enter name: ");
			fullName = scanner.nextLine();
			if(fullName.equals("") || fullName.length() > MAX_NAME_LEN){
				System.out.println("\nERROR : Please check the input name whether it is valid or not.");
				System.out.println(">> it should not be empty or over " + MAX_NAME_LEN + " characters, including empty spaces\n");
			}else{
				break;
			}
		}

		return fullName;
	}
	
	//repeatedly requests and reads number from user
	//until valid number entered i.e. between 1 and 1000
	//finally returns the valid number	
	private int getNumberFromUser() {
		//use this number until more code written
		int num = 0;
		while(true){
			System.out.print("How many cards would you like? ");
			num = scanner.nextInt();
			if(num < MIN_CARD_AMOUNT || num > MAX_CARD_AMOUNT){
				System.out.println("\nERROR : Please check the input value whether it is valid or not.");
				System.out.println(">> it should be between " + MIN_CARD_AMOUNT + " and " + MAX_CARD_AMOUNT+"\n");
			}else{
				break;
			}
		}

		return num;
	}
	

}


