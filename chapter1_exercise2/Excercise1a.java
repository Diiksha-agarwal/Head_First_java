/*========================================question================================================
BE THE COMPILER

Each of the Java files on this page
represents a complete source file.
Your job is to play compiler and
determine whether each of these files
will compile. If they won't
compile, how would you
fix them?

//------------------------------------------source code--------------------------------------------
class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }
}
*/
/*===========================================Solution==============================================

The above given code in question will run forever as it leads into a infinite loop however it will
not give any compilation error. The corrected code is as bellow.

*/

class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
            x++;
            if (x > 3) {
                System.out.println("big x");
            }
        }
    }
}