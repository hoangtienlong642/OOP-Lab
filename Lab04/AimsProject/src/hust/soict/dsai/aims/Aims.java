package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.store.*;


public class Aims {
    public static void showMenu(Store store, Cart cart) {
        //show menu of aims
        while (true) {
            System.out.println("AIMS: ");
            System.out.println("--------------------------------");
            System.out.println("1. View Store");
            System.out.println("2. Update store");
            System.out.println("3. View Cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 1-4");
            //get user's choice
            int choice = 5;
            java.util.Scanner keyboard = new java.util.Scanner(System.in);
                choice = keyboard.nextInt();
                keyboard.nextLine();
            
            switch (choice) {
                case 1:
                    store.showMenu(cart);
                    break;
                case 2:
                    // select item to remove item from store
                    System.out.println("Please enter the ID of the item you want to remove: ");
                    String Searchid = keyboard.next();
                    store.removeMedia(Searchid);
                    break;
                case 3:
                    cart.cartMenu();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Please choose a number: 1-4");
                    break;
            }
        }
    }
    public static void main(String[] args) throws Exception {

        // Create new disks
        DigitalVideoDisc disc1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc disc2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc disc3 = new DigitalVideoDisc("Aladdin", "Animation","George Lucas", 160, 16.8f);
        DigitalVideoDisc disc4 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        // Create new books
        Book book1 = new Book("The Hobbit", "Fantasy", 100.0f);
        Book book2 = new Book("The Lord of the Rings", "Fantasy", 100.0f);



        DigitalVideoDisc[] dvdList = {disc1, disc2, disc3, disc4};

        // Create new Tracks
        Track track1 = new Track("Baby", 200);
        Track track2 = new Track("Titanic Song", 200);
        Track track3 = new Track("Funky Town", 300);

        // Add tracks to a CD
        CompactDisc cd1 = new CompactDisc("CompactDisc1", "Meme Stuff", "Me", 20.0f);
        cd1.addTrack(track1);
        cd1.addTrack(track2);
        cd1.addTrack(track3);


        // Create a new cart
        Cart cart1 = new Cart();
        // Create a new store
        Store store1 = new Store();
        // Add items to store
        store1.addMedia(book1);
        store1.addMedia(book2);
        store1.addMedia(cd1);
        // store1.displayStore();
        // Add Items to cart
        cart1.addMedia(disc1);
        cart1.addMedia(cd1);
        // show menu of aims
        showMenu(store1, cart1);
        // Test cart function


    }
}
