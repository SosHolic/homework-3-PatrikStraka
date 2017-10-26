public class GeneralTest {
    public int getCount() {return 1;}  //
}
public class test extends GeneralTest{
    public int getCount() {return 10;}  //
    public static void main(String[] args) {
        test test = new test();  //
        int count = test.getCount();  //
        GeneralTest generalTest = new test();  //
        count += generalTest.getCount();   //
        generalTest = new GeneralTest();  //
        count += generalTest.getCount();  //
        System.out.println(count);  //
    }
}
