package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;


public class Store {
    public static final int MAX_NUMBERS_STORED = 200;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_STORED];
    private int qtyStored = 0;

    public void addDVD(DigitalVideoDisc disc){
        if (this.qtyStored == MAX_NUMBERS_STORED){
            System.out.println("This order is almost full!");
        } else {
            itemsInStore[qtyStored] = disc;
            qtyStored++;
            System.out.println("The disc " + disc.getTitle() + " has been added.");
        }
    }

    public void addDVD(DigitalVideoDisc [] dvdList){
        if (this.qtyStored == MAX_NUMBERS_STORED){
            System.out.println("This order is almost full!");
        } else {
            for (int i = 0 ; i< dvdList.length ; i++){
            itemsInStore[qtyStored] = dvdList[i];
            qtyStored++;
            System.out.println("The disc " + dvdList[i].getTitle() + " has been added.");
            }
        }
    }

    public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        if (this.qtyStored == MAX_NUMBERS_STORED){
            System.out.println("This order is almost full!");
        } else {
            itemsInStore[qtyStored] = dvd1;
            qtyStored++;
            System.out.println("The disc " + dvd1.getTitle() + " has been added.");
            
            itemsInStore[qtyStored] = dvd2;
            qtyStored++;
            System.out.println("The disc " + dvd2.getTitle() + " has been added.");
        }
    }
    public static void swap (Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public void removeDVD(int id) {
        for (int i = 0; i <qtyStored; i++) {
            if (itemsInStore[i].isMatch(id)) {
                for (int j = i; j < qtyStored; j++){
                    itemsInStore[j] = itemsInStore[j+1];
                }
                qtyStored--;
            }
        }
    }

    public void removeDVD(String key) {
        for (int i = 0; i <qtyStored; i++) {
            if (itemsInStore[i].isMatch(key)) {
                for (int j = i; j < qtyStored; j++){
                    itemsInStore[j] = itemsInStore[j+1];
                }
                qtyStored--;
            }
        }
    }

    public void printStore (){
        System.out.println("**********************STORE***********************");
        System.out.println("\nStored Items:");
        for (int i = 0; i < qtyStored; i++){
            itemsInStore[i].printDetail();
        }
        System.out.println("**************************************************");
    }
}

