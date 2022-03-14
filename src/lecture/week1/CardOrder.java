package lecture.week1;

/**
 * OOP Assignment One
 * CardOrder class keeps details of one card order
 * and provides methods to print a card 
 * and determine the price
 *
 */
public class CardOrder {
	private Name name;  	//the name printed on the card
	private char border;    //the card border
	private int numCards;   //the number of cards to be printed
	
	private static final int CARD_LEN = 32;  //the length of the card in characters

	/* 추가 */
	private static final int NAME_SPLIT_LEN = 3;
	private static final int DISCOUNT_CARD_AMOUNT = 200;
	private static final int DISCOUNT_LEN = 12;
	private static final double ORIGINAL_PRICE = 40.0;
	private static final double DISCOUNT_PRICE = 50.0;
	static final double DISCOUNT_RATE = 0.1;


	//initialises name from value in parameter
	//and sets other instance variables to suitable default values
	//you can create a Name from a single string after L5
	//If you want to start before then, just write name = new Name("A", "B", "C") in the constructor!
	public CardOrder(String fullName) {
		String[] temp = fullName.split(" ");
		border = '*';
		/* 개선할 수 있을까 */
		if(temp.length == NAME_SPLIT_LEN){
			name = new Name(temp[0], temp[1].substring(0,1), temp[2]); // 카드 주문 시엔, 중간 이름은 이니셜만 저장하도록
		}else if(temp.length == NAME_SPLIT_LEN -1){
			name = new Name(temp[0], temp[1]);
		}else{
			System.out.println("ERROR : Full Name must have at least two component, First Name and Last Name.");
		}

	}
	
	///////////////////////////////////////////
	//accessor/mutator methods
	
	//returns the character used in the border
	public char getBorder() {
		return border;
	}
	
	//sets the character used in the border 
	//to that provided in the parameter
	public void setBorder(char ch) {
		this.border = ch;
	}
	
	//returns the name 
	public Name getName() {
		return name;
	}
	
	//sets the name used in the card
	//to that provided in the parameter
	public void setName(Name name) {
		this.name = name;
	}
	
	//returns the number of cards to be printed
	public int getNumCards() {
		return numCards;
	}
	
	//sets the number of cards to be printed 
	//to that provided in the parameter
	public void setNumCards(int n) {
		this.numCards = n;
	}
	///////////////////////////////////////////
	
	//returns a sample card, including a newline at the end of each line
	public String getSampleCard() throws IllegalAccessException {
		return getTopLine() + getBlankLine() + this.getLineWithName()
		       + getBlankLine() + getTopLine();
	}
	
	//returns a String containing the top or bottom line
	//of a card, including a newline character at the end
	private String getTopLine() throws IllegalAccessException {
		//use this value until more code written
		StringBuilder sb = new StringBuilder();
		String initial_name = name.getInits();
		int initial_len = initial_name.length();

		/* 이니셜 + 문자 보더 + 이니셜 */
		sb.append(initial_name).append(String.valueOf(border).repeat(Math.max(0, CARD_LEN - initial_len * 2))).append(initial_name).append("\n");

		return sb.toString();
	}
	
	//returns a String containing the blank line
	//of a card, with a border char at each end
	//and including the newline character	
	private String getBlankLine() {	
		//use this value until more code written
		return border + " ".repeat(Math.max(0, CARD_LEN - 2)) + border + "\n";
	}
	
	//returns a String containing the name line
	//of a card, including name, padding and border
	//and including the newline character	
	private String getLineWithName() {
		//use this value until more code written
		// int empty_len = CARD_LEN - 2 - name.toString().
		String printName = name.toString();
		int empty_len = CARD_LEN - 2 - printName.length();

		String line = "";
		line += border;
		line += String.format("%"+empty_len/2 + "s%s%-" + empty_len/2+"s", " ",printName, " ");
		line += border;

		return line+"\n";
	}
	
	//returns the price of one card
	//in pounds (i,e either 0.20 or 0.25)
	//based on the number of characters in the name to be printed
	//0.20 if <=12 otherwise 0.25
	// 12자 넘지 않으면,  원화 40원 넘으면 50원
	public double getCardPrice() {
		//use this value until more code written
		int len = name.toString().length();
		return len <= DISCOUNT_LEN ? ORIGINAL_PRICE : DISCOUNT_PRICE;
	}

	//returns the final cost of the order
	//which is the number of cards multiplied by the card price
	//and reduced by 10% if >= 200 cards
    public double getFinalCost() {
		//use this value until more code written
		return hasDiscount() ? getCardPrice() * numCards * (1-DISCOUNT_RATE) : getCardPrice() * numCards;
    }
    
    //returns true if number of cards >= 200, false otherwise
    public boolean hasDiscount() {
		return numCards >= DISCOUNT_CARD_AMOUNT; // 현재 문제에서는 200 장 이상 시 할인 해주기로 되어 있음.
    }
}
