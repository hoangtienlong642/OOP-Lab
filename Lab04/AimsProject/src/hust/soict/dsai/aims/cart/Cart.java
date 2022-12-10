package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.media.*;

import java.util.*;

public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 9999;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private int qtyOrdered = 0;

    //Getters
    public int getQtyOrdered(){
        return qtyOrdered;
    }
    //Add Media to cart
    public boolean addMedia(Media media){
        if (!(qtyOrdered < MAX_NUMBERS_ORDERED)){
            System.out.println("The cart is full. Can't add more!");
            return false;
        }
        itemsOrdered.add(media);
        qtyOrdered++;
        return true;
    }
    //Add an array of Medias to cart
    public boolean addMedia(Media[] MediaList){
        if (qtyOrdered + MediaList.length > MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full. Can't add more!");
            return false;
        }
        for (Media media : MediaList){
            itemsOrdered.add(media);
            qtyOrdered++;
        }
        return true;
    }

    public boolean addMedia(Media Media1, Media Media2){
        if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full. Can't add more!");
            return false;
        }
        itemsOrdered.add(Media1);
        itemsOrdered.add(Media2);
        qtyOrdered += 2;
        return true;
    }


    //remove a Media from cart
    public boolean removeMedia(Media media){
        if (!itemsOrdered.contains(media)){
            System.out.println("The media is not in the cart. Can't remove!");
            media.printDetail();
            return false;
        }
        itemsOrdered.remove(media);
        qtyOrdered--;
        return true;
    }
    //total cost of Medias in cart
    public double totalCost(){
        double total = 0;
        for (Media media : itemsOrdered){
            total += media.getCost();
        }
        return total;
    }
    //print the list of Medias in cart
    public void displayCart(){
        System.out.println("*****************Cart detail*****************\n");
        for (int i = 0; i < qtyOrdered; i++){
            System.out.format("Items %d:\n", i+1);
            itemsOrdered.get(i).printDetail();
        }
    }
    //search a Media by title
    public void searchByTitle(String title){
        int count = 0;
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered.get(i).getTitle().contains(title)){
                System.out.format("Items %d:\n", i+1);
                itemsOrdered.get(i).printDetail();
                count++;
            }
        }
        if (count == 0){
            System.out.println("No media found!");
        }
    }
    //search a Media by ID
    public void searchByID(String id){
        int count = 0;
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered.get(i).getId().contains(id)){
                System.out.format("Items %d:\n", i+1);
                itemsOrdered.get(i).printDetail();
                count++;
            }
        }
        if (count == 0){
            System.out.println("No media found!");
        }
    }
    // sort the list of Medias in cart by cost
    public void sortByCost(){
        for (int i = 0; i < qtyOrdered - 1; i++){
            for (int j = i + 1; j < qtyOrdered; j++){
                if (itemsOrdered.get(i).getCost() > itemsOrdered.get(j).getCost()){
                    Media temp = itemsOrdered.get(i);
                    itemsOrdered.set(i, itemsOrdered.get(j));
                    itemsOrdered.set(j, temp);
                }
            }
        }
    }
    // sort the list of Medias in cart by title
    public void sortByTitle(){
        for (int i = 0; i < qtyOrdered - 1; i++){
            for (int j = i + 1; j < qtyOrdered; j++){
                if (itemsOrdered.get(i).getTitle().compareTo(itemsOrdered.get(j).getTitle()) > 0){
                    Media temp = itemsOrdered.get(i);
                    itemsOrdered.set(i, itemsOrdered.get(j));
                    itemsOrdered.set(j, temp);
                }
            }
        }
    }
    // Place order
    public void placeOrder(){
        if (qtyOrdered == 0){
            System.out.println("The cart is empty. Can't place order!");
            return;
        }
        System.out.println("*****************Order detail*****************");
        System.out.println("Date: " + new Date());
        System.out.println("Ordered items:");
        for (int i = 0; i < qtyOrdered; i++){
            System.out.format("Items %d:\n", i+1);
            itemsOrdered.get(i).printDetail();
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("**********************************************");
        // clear the cart
        itemsOrdered.clear();
    }
    // cart Menu
    public void cartMenu(){
        while(true)
        {
        System.out.println("*****************Cart Menu*****************");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove medias from cart");
        System.out.println("4. Play a media in cart");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("*******************************************");
        System.out.print("Enter your choice: ");
        int choice = 6;
        java.util.Scanner keyboard = new java.util.Scanner(System.in);
        choice = keyboard.nextInt();
        keyboard.nextLine();
        
        switch(choice){
            case 1:
                System.out.println("*****************Filter Menu*****************");
                System.out.println("1. Search by title");
                System.out.println("2. Search by ID");
                System.out.println("0. Back");
                System.out.println("*******************************************");
                System.out.print("Enter your choice: ");
                int choice1 = 6;
                choice1 = keyboard.nextInt();
                keyboard.nextLine();
                
                switch(choice1){
                    case 1:
                        System.out.print("Enter the title: ");
                        String title = "";
                        title = keyboard.nextLine();
                        
                        searchByTitle(title);
                        break;
                    case 2:
                        System.out.print("Enter the ID: ");
                        String id = "";
                        id = keyboard.nextLine();
                        
                        searchByID(id);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
                break;
            case 2:
                System.out.println("*****************Sort Menu*****************");
                System.out.println("1. Sort by title");
                System.out.println("2. Sort by cost");
                System.out.println("0. Back");
                System.out.println("*******************************************");
                System.out.print("Enter your choice: ");
                int choice2 = 6;
                choice2 = keyboard.nextInt();
                keyboard.nextLine();
                
                switch(choice2){
                    case 1:
                        sortByTitle();
                        displayCart();
                        break;
                    case 2:
                        sortByCost();
                        displayCart();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }
                break;
            case 3:
                System.out.print("Enter the ID of the media you want to remove: ");
                String id = keyboard.nextLine();
                boolean Check = false;
                for (int i = 0; i < qtyOrdered; i++){
                    if (itemsOrdered.get(i).getId().contains(id)){
                        removeMedia(itemsOrdered.get(i));
                        Check = true;
                        break;
                    }
                }
                if (Check == false){
                System.out.println("Media not found!");
                }
                break;
            case 4:
                System.out.print("Enter the ID of the media you want to play: ");
                String id1 = "";
                id1 = keyboard.nextLine();
                
                //Play a media if it is playable
                for (int i = 0; i < qtyOrdered; i++){
                    if (itemsOrdered.get(i).getId().contains(id1)){
                        if (itemsOrdered.get(i) instanceof Playable){
                            ((Playable)itemsOrdered.get(i)).play();
                        }
                        else{
                            System.out.println("This media is not playable!");
                        }
                        break;
                    }
                }
                break;
            case 5:
                placeOrder();
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid choice!");
                break;
            }   
        } 
    }
}

