package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{

	private String artist;
	private List<Track> tracks = new ArrayList<Track>(); 

	public CompactDisc( String id, String title, float cost) {
		super( id, title, cost);
	}
	public CompactDisc( String id, String title, String artist, float cost ) {
		super( id, title, cost);
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist){
		this.artist = artist;
	}
	public void addTrack(Track track){
		if (!tracks.contains(track))
			tracks.add(track);
	}
	public void removeTrack(Track track){
		if (tracks.contains(track)){
			tracks.remove(track);
		}
	}
	public int getLength(){
		int length = 0;
		for (int i =0; i<= tracks.size(); i++){
			Track track = tracks.get(i);
			length += track.getLength();
		}
		this.length = length;
		return length;
	}
	// public void printDetail() {
    //     System.out.format("CD detail:\n"
    //                         + "Title: %s\n"
    //                         + "Category: %s\n"
	// 						+ "Artist: %s\n"
	// 						+ "Length: %d\n"
    //                         + "Cost: %.2f$\n\n", title, category,artist,length, cost);
    // }
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD length: " + this.getLength());
		System.out.println("Artist: " + this.getArtist());
		for (int i =0; i<= tracks.size(); i++){
			Track track = tracks.get(i);
			track.play();
		}	
	}
	
}
