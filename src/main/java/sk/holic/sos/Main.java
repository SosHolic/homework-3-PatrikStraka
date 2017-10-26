package sk.holic.sos;

public class Main {
    public static void main(String[] args) {
        int i = 55;
        while (true) {
            if (i++ > 5) {
                break;
            }
        }
        System.out.print(i);
    }
}
