package lecture.week3.problem02_SRP;

public class TextModifier {
    Text text;

    /*methods that change the text*/
    void allLettersToUpperCase() {
        text.setText(text.getText().toUpperCase());
    }

    void findSubTextAndDelete(String s) {
        text.setText(text.getText().replaceAll(s, ""));
    }
}
