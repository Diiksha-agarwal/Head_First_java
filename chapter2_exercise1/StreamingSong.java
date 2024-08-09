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
class StreamingSong {
    String title;
    String artist;
    int duration;
    void play() {
        System.out.println("Playing song");
    }
    void printDetails() {
        System.out.println("This is " + title + " by " + artist);
    }
}
class StreamingSongTestDrive {
    public static void main(String[] args) {
    song.artist = "The Beatles";
    song.title = "Come Together";
    song.play();
    song.printDetails();
    }
}
*/
/*===========================================Solution==============================================

The above given code in question give compile time error as in the main method we use song object 
without even creating it. The corrected code is as bellow.



class StreamingSong {
    String title;
    String artist;
    int duration;
    void play() {
        System.out.println("Playing song");
    }
    void printDetails() {
        System.out.println("This is " + title + " by " + artist);
    }
}
class StreamingSongTestDrive {
    public static void main(String[] args) {
    StreamingSong song = new StreamingSong();
    song.artist = "The Beatles";
    song.title = "Come Together";
    song.play();
    song.printDetails();
    }
}
*/