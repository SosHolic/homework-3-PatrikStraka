package sk.holic.sos;

public class Test {
    public Test ref;
    public static Test sref;
    public int val;

    public static int calc() {
        Test t1 = new Test();// vytvorenie novej instancia t1 typu Test
        Test t2 = new Test();//  vytvorenie novej instancia t2 typu Test

        t1.ref = t2; // k premennej ref sa pridá instancia t2
        t1.sref = t1; //  k statickej premennej sref sa pridá instancia t1
        t1.val = 10; // k premennej val sa pridá číslo 10

        t2.ref = t1; //  k premennej ref sa pridá instancia t1
        t2.sref = t2; //  k statickej premennej sref sa priradi instancia t2
        t2.val = 1; // k premennej val sa priradi číslo 1

        return t1.sref.ref.ref.val + t2.ref.sref.ref.val + t1.ref.ref.sref.val;
    }
}