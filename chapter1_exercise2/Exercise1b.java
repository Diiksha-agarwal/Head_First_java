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
public static void main(String [] args) {
    int x = 5;
    while ( x > 1 ) {
        x = x - 1;
        if ( x < 3) {
        System.out.println("small x");
        }
    }
}
*/
/*===========================================Solution==============================================

The above given code in question will give compile time error as a code requires either a class or 
interface of some kind in a file. The corrected code is as bellow.

*/
class Exercise1b{
    
    public static void main(String [] args) {
        int x = 5;
        while ( x > 1 ) {
            x = x - 1;
            if ( x < 3) {
            System.out.println("small x");
            }
        }
    }
}