package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.media.*;


public class Store {
    public static final int MAX_NUMBERS_STORED = 200;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    private int qtyInStored = 0;

    public void addMedia(Media media){
        if (this.qtyInStored == MAX_NUMBERS_STORED){
            System.out.println("This order is almost full!");
        } else {
            itemsInStore.add (media);
            qtyInStored++;
            System.out.println("The media " + media.getTitle() + " has been added.");
        }
    }


    public void addMedia(Media media1, Media media2){
        if (this.qtyInStored == MAX_NUMBERS_STORED){
            System.out.println("This order is almost full!");
        } else {
            itemsInStore.add(media1);
            qtyInStored++;
            System.out.println("The disc " + media1.getTitle() + " has been added.");
            
            itemsInStore.add(media2);
            qtyInStored++;
            System.out.println("The disc " + media2.getTitle() + " has been added.");
        }
    }
    public static void swap (Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }



    public void printStore (){
        System.out.println("**********************STORE***********************");
        System.out.println("\nStored Items:");
        for (int i = 0; i < qtyInStored; i++){
            itemsInStore.get(i).printDetail();
        }
        System.out.println("**************************************************");
    }
    public void displayStore(){
        System.out.println("*****************Store detail*****************\n");
        if (qtyInStored == 0){
            System.out.println("The store is empty!");
        }
        else{
            for (int i = 0; i < qtyInStored; i++){
                System.out.println("Item " + (i+1) + ": ");
                Media temp = itemsInStore.get(i);
                temp.printDetail();
            }
        }
    }

    // Remove Media from store
    public boolean removeMedia(Media media){
        // Check if media is in store

        if (itemsInStore.contains(media)){
            itemsInStore.remove(media);
            qtyInStored--;
            return true;
        }

        System.out.println("Media not found!");
        return false;
    }
    // Remove Media with ID
    public boolean removeMedia(String id){
        // Check if media is in store
        for (int i = 0; i < qtyInStored; i++){
            if (itemsInStore.get(i).getId().contains(id)){
                itemsInStore.remove(i);
                qtyInStored--;
                return true;
            }
        }
        System.out.println("Media not found!");
        return false;

    }


    public Media searchMedia(String title)
    {
        for (int i = 0; i < qtyInStored; i++){
            if (itemsInStore.get(i).getTitle().contains(title)){
                return itemsInStore.get(i);
            }
        }
        return null;
    }
    // search Media by ID
    public Media searchMediaByID(String id)
    {
        for (int i = 0; i < qtyInStored; i++){
            if (itemsInStore.get(i).getId().contains(id)){
                return itemsInStore.get(i);
            }
        }
        return null;
    }
    

    //store menu
    public void showMenu(Cart cart) {
        //show menu of store
        while (true) {
            System.out.println("Store Menu: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a media's details");
            System.out.println("2. Add a media to cart");
            System.out.println("3. Play a media");
            System.out.println("4. See current cart");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-4");
            //get user's choice
            int choice = 0;
                Scanner keyboard = new java.util.Scanner(System.in);
                choice = keyboard.nextInt();
                keyboard.nextLine();
                switch (choice) {
                    case 1:
                        // Find media by title
                        System.out.println("Enter the title of the media: \n");
                        String title = keyboard.nextLine();
                        Media temp= searchMedia(title);
                        if (temp != null){
                            temp.printDetail();
                            MediaDetailMenu(temp, cart);
                        }
                        else{
                            System.out.println("Media not found!");
                        }
                        break;
                    case 2:
                        // Find media by title
                        System.out.println("Enter the title of the media: \n");
                        title = keyboard.nextLine();
                        temp= searchMedia(title);
                        if (temp != null){
                            cart.addMedia(temp);
                        }
                        else{
                            System.out.println("Media not found!");
                        }
                        break;
                    case 3:
                        // Find media by title
                        System.out.println("Enter the title of the media: ");
                        title = keyboard.nextLine();
                        temp= searchMedia(title);
                        if (temp != null){
                            if (temp instanceof Playable){
                                ((Playable) temp).play();
                            }
                            else{
                                System.out.println("This media is not playable!");
                            }

                        }
                        else{
                            System.out.println("Media not found!");
                        }
                        break;
                    case 4:
                        cart.cartMenu();
                        break;
                    case 0:
                        return;
                    default:
                        System.out.println("Please choose a number: 0-4");
                }
            }
        }
        

    // MediaDetailMenu
    public void MediaDetailMenu(Media media, Cart cart){
        while (true) {
            System.out.println("Media Detail Menu: ");
            System.out.println("--------------------------------");
            System.out.println("1. Play");
            System.out.println("2. Add to cart");
            System.out.println("3. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-3");
            //get user's choice
            int choice = 0;
            java.util.Scanner keyboard = new java.util.Scanner(System.in);
            choice = keyboard.nextInt();
            keyboard.nextLine();
            
            switch (choice) {
                case 1:
                // Play if media is playable
                    if (media instanceof Playable){
                        ((Playable) media).play();
                    }
                    else{
                        System.out.println("This media is not playable!");
                    }
                    break;
                case 2:
                    cart.addMedia(media);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Please choose a number: 0-3");
            }
        }
    }

}

