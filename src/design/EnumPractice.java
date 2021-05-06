package design;

import static design.Year.*;

public class EnumPractice {
    public static void main(String[] args) {
        Year year = new Year(Months.September);
        year.whatToDo();
    }
}
