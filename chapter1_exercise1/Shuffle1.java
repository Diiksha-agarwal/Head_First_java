//=========================================question=============================================
/*


             Code Magnets
A working Java program is all scrambled up
on the fridge. Can you rearrange the code
snippets to make a working Java program
that produces the output listed below?
Some of the curly braces fell on the floor
and they were too small to pick up, so feel
free to add as many of those as you need!

==============================================snippets=============================================
if (x == 1) {
    System.out.print("d");
    x = x - 1;
}
---------------------------------------------------------------------------------------------------
if (x == 2) {
    System.out.print("b c");
}
---------------------------------------------------------------------------------------------------
class Shuffle1 {
    public static void main(String [] args) {
---------------------------------------------------------------------------------------------------
if (x > 2) {
    System.out.print("a");
}
---------------------------------------------------------------------------------------------------
int x = 3;
---------------------------------------------------------------------------------------------------
x = x - 1;
System.out.print("-");
---------------------------------------------------------------------------------------------------
while (x > 0) {


===============================================output==============================================
"a-b c-d"

*/

/*=============================================solution============================================*/


//-------------------------------------------------------------------------------------------------
class Shuffle1{
    public static void main(String [] args) {
//-------------------------------------------------------------------------------------------------   
        int x = 3;
//-------------------------------------------------------------------------------------------------
        while (x > 0) {
//-------------------------------------------------------------------------------------------------
            if (x > 2) {
                System.out.print("a");
            }
//--------------------------------------------------------------------------------------------------
            x = x - 1;
            System.out.print("-");
//-------------------------------------------------------------------------------------------------
            if (x == 2) {
                System.out.print("b c");
            }
//-------------------------------------------------------------------------------------------------
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
//-------------------------------------------------------------------------------------------------
        }
    }
}