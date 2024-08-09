/*============================================question===============================================
                                           BE the JVM
The Java file on this page represents a
complete source file. Your job is to play
JVM and determine what the output would
be when the program runs.
How might you fix it, making
sure the output is correct
every time?

===========================================source code================================================*/
/*
import java.util.*;
import java.util.concurrent.*;
public class TwoThreadsWriting {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Data data = new Data();
        threadPool.execute(() -> addLetterToData('a', data));
        threadPool.execute(() -> addLetterToData('A', data));
        threadPool.shutdown();
    }
    private static void addLetterToData(char letter, Data data) {
        for (int i = 0; i < 26; i++) {
            data.addLetter(letter++);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {}
        }
        System.out.println(Thread.currentThread().getName() + data.getLetters());
        System.out.println(Thread.currentThread().getName()
            + " size = " + data.getLetters().size());
    }
}
final class Data {
    private final List<String> letters = new ArrayList<>();
    public List<String> getLetters() {return letters;}
    public void addLetter(char letter) {
        letters.add(String.valueOf(letter));
    }
} 
*/
/*==============================================reasoning==========================================
    Though the code executed without a hitch this time doesn't guarentee corect output always.
    As we notice two threads attempting to write at the same time might create an issue hence we
    synchronize or create a list of some kind for them to add items to.

==============================================corrected code=======================================
*/


import java.util.*;
import java.util.concurrent.*;
public class TwoThreadsWriting {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        Data data = new Data();
        threadPool.execute(() -> addLetterToData('a', data));
        threadPool.execute(() -> addLetterToData('A', data));
        threadPool.shutdown();
    }
    private static void addLetterToData(char letter, Data data) {
        for (int i = 0; i < 26; i++) {
            data.addLetter(letter++);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {}
        }
        System.out.println(Thread.currentThread().getName() + data.getLetters());
        System.out.println(Thread.currentThread().getName()
            + " size = " + data.getLetters().size());
    }
}
final class Data {
    private final List<String> letters = new ArrayList<>();
    public List<String> getLetters() {return letters;}
    public synchronized void addLetter(char letter) {
        letters.add(String.valueOf(letter));
    }
} 