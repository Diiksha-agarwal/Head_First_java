public class Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();
// candidate code starts
    //---------------------------------------candidate-1-------------------------------------------
    /*  b.m1();
        c.m2();
        a.m3();
    */
   /*--------------------------------------candidate-1 output-------------------------------------
        "B's m1, A's m2, A's m3, "
        This is so as class B overrides the m1 method and class C inherits m2 from class A.
   */
    //---------------------------------------candidate-2-------------------------------------------
    /*  c.m1();
        c.m2();
        c.m3();
    */
   /*--------------------------------------candidate-2 output-------------------------------------
        "B's m1, A's m2, C's m3, 13"
        This is so as class B overrides the m1 method and class C inherits m2 from class A and 
        overrides m3.
   */
    //---------------------------------------candidate-3-------------------------------------------
    /*  a.m1();
        b.m2();
        c.m3();
    */
   /*--------------------------------------candidate-3 output-------------------------------------
        "A's m1, A's m2, C's m3, 13"
        This is so as class B inherits the m2 method and class C overrides m3.
   */
    //---------------------------------------candidate-4-------------------------------------------
    /*  a2.m1();
        a2.m2();
        a2.m3();
    */
   /*--------------------------------------candidate-4 output-------------------------------------
        "B's m1, A's m2, C's m3, 13 "
        This is so as class B overrides the m1 method and class C inherits m2 from class A and 
        overrides m3.
   */

// candidate code ends
    }
}