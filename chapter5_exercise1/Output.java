/*========================================question================================================
BE THE JVM

The Java file on this page
represents a complete source
file. Your job is to play JVM
and determine what would be
the output when the
program runs.

//------------------------------------------source code--------------------------------------------*/
class Output {
    public static void main(String[] args) {
        Output output = new Output();
        output.go();
    }
    void go() {
        int value = 7;
        for (int i = 1; i < 8; i++) {
            value++;
            if (i > 4) {
                System.out.print(++value + " ");
            }
            if (value > 14) {
                System.out.println(" i = " + i);
                break;
            }
        }
    }
}
/*===========================================options==============================================

a) "12 14"
b) "12 14 i = 6"
c) "13 15 i = 6"

===========================================solution==============================================
option c is the correct output after factoring the pre increment operator and the break statement
*/

