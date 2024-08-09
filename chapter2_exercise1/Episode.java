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
class Episode {
    int seriesNumber;
    int episodeNumber;
    void skipIntro() {
        System.out.println("Skipping intro...");
    }
    void skipToNext() {
        System.out.println("Loading next episode...");
    }
}
class EpisodeTestDrive {
    public static void main(String[] args) {
    Episode episode = new Episode();
    episode.seriesNumber = 4;
    episode.play();
    episode.skipIntro();
    }
}
*/

/*===========================================Solution==============================================

The above given code in question give compile time error as in the main method we use play method 
without even defining it in the Episode class. The corrected code is as bellow.



class Episode {
    int seriesNumber;
    int episodeNumber;
    void skipIntro() {
        System.out.println("Skipping intro...");
    }
    void play(){
        System.out.println("playing episode")
    }
    void skipToNext() {
        System.out.println("Loading next episode...");
    }
}
class EpisodeTestDrive {
    public static void main(String[] args) {
    Episode episode = new Episode();
    episode.seriesNumber = 4;
    episode.play();
    episode.skipIntro();
    }
}
*/