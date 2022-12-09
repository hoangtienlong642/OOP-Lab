package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.Store;

public class TestStore {
    public class StoreTest {
        public static void main(String[] args) {
            Store store = new Store();
            DigitalVideoDisc disk1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
            DigitalVideoDisc disk2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
            DigitalVideoDisc disk3 = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
           
            // Create Books
            Book book1 = new Book("The Hobbit", "Fantasy", 300);
            Book book2 = new Book("The Lord of the Rings", "Fantasy", 500);
            Book book3 = new Book("The Chronicles of Narnia", "Fantasy", 400);
            // Create CDs
            CompactDisc cd1 = new CompactDisc("CD1", "Meme Stuff", "Me", 20.0f);
            // Create Tracks
            Track track1 = new Track("Baby", 200);
            Track track2 = new Track("Titanic Song", 200);
            // Add tracks to a CD
            cd1.addTrack(track1);
            cd1.addTrack(track2);
    
            store.addMedia(disk1);
            store.addMedia(disk2);
            store.addMedia(disk3);
            store.displayStore();
            store.removeMedia(disk1);
            store.removeMedia(disk2);
            store.removeMedia(disk3);
            store.addMedia(book1);
            store.addMedia(book2);
            store.addMedia(book3);
            store.displayStore();
            
        }
        
    }
    
}
