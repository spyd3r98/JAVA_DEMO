package javacodechecker;

public class TrackOfUnfinishedCode {

    private void printStmt(){
        // TODO: add number value
        System.out.println("Hello");
        /* FIXME: add number  variable value and pass it */
        printMyNumber();
    }

    private void printMyNumber(){
        System.out.println(number);
    }
}