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
class Books {
    String title;
    String author;
}
class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
*/

/*===========================================Solution==============================================

The above given code in question is incomplete because after creating an array of references to the 
Books object we need to create and assign the actual objects to the refferences. The corrected code
is as bellow.



class Books {
    String title;
    String author;
}
class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;

        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0] = new Books();
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gatsby";
        myBooks[2].title = "The Java Cookbook";
        myBooks[0].author = "bob";
        myBooks[1].author = "sue";
        myBooks[2].author = "ian";
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
*/