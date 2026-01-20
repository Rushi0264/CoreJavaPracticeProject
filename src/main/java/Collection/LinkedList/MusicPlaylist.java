package Collection.LinkedList;

import java.util.LinkedList;

public class MusicPlaylist {
    public static void main(String[] args) {
        LinkedList<String> music = new LinkedList<>();
        music.addFirst("Song A");
        music.addLast("Song B");
        music.addFirst("Song z");
        music.addLast("Song D");
        System.out.println(music);//A B Z D
        music.removeLast();
        System.out.println(music);//A B Z
        music.removeFirst();
        System.out.println(music);//B Z
    }
}
