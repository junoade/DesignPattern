package lecture.week11.strategy_sorting;

import java.util.List;

public class ClientTest {
    public static void main(String[] args) {

        System.out.println("--- Quick sort ---");
        System.out.println("> before");
        SortedList studentRecords_quick = init();
        studentRecords_quick.setSort_method(new QuickSort());
        System.out.println("> after");
        studentRecords_quick.sort();
        printStringArr(studentRecords_quick.items);

        System.out.println("--- Shell sort ---");
        System.out.println("> before");
        SortedList studentRecords_shell = init();
        studentRecords_shell.setSort_method(new ShellSort());
        System.out.println("> after");
        studentRecords_shell.sort();
        printStringArr(studentRecords_shell.items);

        System.out.println("--- Merge sort ---");
        System.out.println("> before");
        SortedList studentRecords_merge = init();
        studentRecords_merge.setSort_method(new MergeSort());
        System.out.println("> after");
        studentRecords_merge.sort();
        printStringArr(studentRecords_merge.items);
    }

    public static SortedList init(){
        SortedList studentRecords = new SortedList();
        studentRecords.add("Samual");
        studentRecords.add("Jimmy");
        studentRecords.add("Sandra");
        printStringArr(studentRecords.items);
        return studentRecords;
    }
    public static void printStringArr(List<String> items){
        for(String item : items){
            System.out.println(item);
        }
    }
}
