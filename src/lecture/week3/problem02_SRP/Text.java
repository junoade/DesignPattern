package lecture.week3.problem02_SRP;

public class Text {
    String text;
    String author;
    int length;

    String getText() {
        return text;
    }
    void setText(String s) {
        this.text = text;
    }
    String getAuthor() {
        return author;
    }
    void setAuthor(String s) {
        author = s;
    }
    int getLength() {
        return length;
    }
    void setLength(int k) {
        length = k;
    }

    /*method for formatting output*/
    void printText() {
        System.out.println(text + " " + author + " " + length);
    }
}


