package sk.holic.sos;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i++ > 5) { // pri  i++ je to  7 a ked zmeníme na  ++i je to  6
                break;
            }
        }
        System.out.println(i);
        System.out.println(Test.calc()); // vypíše hodnotu 12
    }
}
