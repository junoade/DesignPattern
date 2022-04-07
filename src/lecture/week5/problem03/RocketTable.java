package lecture.week5.problem03;

import javax.swing.table.AbstractTableModel;

/**
 * @author 2017112095 Junho Choi
 * @apiNote 문제 3번, 자바 Swing의 AbstractTableModel 추상 클래스를 이용해, Rocket 객체를 자바 SwingGUI 형태의 테이블로 만드는 어댑터 클래스 만들기
 */

public class RocketTable extends AbstractTableModel {

    protected Rocket[] rockets;
    protected String[] columnNames = new String[]{"Name", "Price", "Apogee"};

    public RocketTable(Rocket[] rockets) {
        this.rockets = rockets;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length; // Name, Price, Apogee와 같이 columnNames 배열의 개수를 반환 같이
    }

    public String getColumnName(int i) {
        if (i >= 0 && i <= columnNames.length) {  // 현재 ColumnName 범위 내에서만, 접근 처리하도록
            return columnNames[i];
        }
        throw new IndexOutOfBoundsException();  // IndexOutOfBoundException 예외 throw
    }

    @Override
    public int getRowCount() {
        return rockets.length; // 현재 어댑터가 참조하는 Rocekt[] 의 길이를 반환
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object result;

        switch (columnIndex) { // columnIndex에 따라 반환하는 값을 분기. 만약 이부분이 많아지면? 고민이네.
            case 0:
                result = rockets[rowIndex].getName();
                break;
            case 1:
                result = rockets[rowIndex].getPrice();
                break;
            case 2:
                result = rockets[rowIndex].getApogee();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + columnIndex);
        }
        return result;
    }
}
