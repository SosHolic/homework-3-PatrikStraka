public class Test {
    public test ref;  //
    public static test sref;   //
    public int val;  //
    public static int calc(){  //
        test t1 = new test();  //
        test t2 = new test(); //
        t1.ref = t2;  //
        t1.sref = t1;  //
        t1.val = 10;  //
        t2.ref = t1;  //
        t2.sref = t2;  //
        return t1.sref.ref.ref.val + t2.ref.sref.ref.val + t1.ref.ref.sref.val;  //
    }
}
