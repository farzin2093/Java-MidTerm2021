package design;

public class Year {
    private final Months months;

    public Year(Months months) {
        this.months = months;
    }

    public void whatToDo() {
        switch (months) {
            case January:
                System.out.println("I'll play soccer");
                break;
            case February:
                System.out.println("I'll play cricket");
                break;
            case March:
            case April:
                System.out.println("I'll play guitar");
                break;
            default:
                System.out.println("I'll go to work");
        }
    }

}