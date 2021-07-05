package InnerClassesChallenge;

import InterfacesLinkedList.Song;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public String getName() {
        return name;
    }

    public String getArtist() {
        return artist;
    }

    public SongList getSongs() {
        return songs;
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong!=null) {
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = this.songs.findSong(title);
        if (song != null) {
            playlist.add(song);
            return true;
        }
        System.out.println("This song " + title + " is not in this album");
        return false;
    }

    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            if(songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            for (Song song : this.songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if((index > 0) && (index<songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }

}
