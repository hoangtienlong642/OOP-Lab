package hust.soict.dsai.lab01;
import java.util.Scanner;

import java.lang.String;

public class Dayofmonth {
    public static int Search (String[] array, String key){
        key = key.toLowerCase();
        for (int i = 0; i < 12; i++){
            if (key.equals(array[i])) return i+1;
        }
        return 0;
    }
    public static int CheckMonth (String month) {
        String[] ShortMonthArray = { "jan", "feb", "mar","apr", "may", "jun", "jul", "aug", "sep","oct", "nov", "dec" };
        String[] LongMonthArray = { "january", "february", "march","april", "may", "june", "july", "august", "september","october","november", "december" };
        String[] Short2MonthArray = { "jan.", "feb.", "mar.","apr.", "may.", "jun.", "jul.", "aug.", "sep.","oct.", "nov.", "dec." };
        if ( month.length() < 3){
            try {
                int result = Integer.parseInt(month);
            }catch (NumberFormatException nfe) { 
                return 0;
            } 
                int result = Integer.parseInt(month);
                return result;
        } else {
            int index = Search(ShortMonthArray,month);
            if (index < 0) 
                index = Search(LongMonthArray,month);
            if (index < 0)  
                index = Search(Short2MonthArray,month);
            index ++;
            return index;
        }
    }   
    public static int CheckYear(String year){
        try {int result = Integer.parseInt(year);}
        catch (NumberFormatException nfe) { return -1; }
        int result = Integer.parseInt(year);
        return result;
    }
    public static int DateNumber (int year, int month)
    {
        int[] DateArrays = {31,28,31,30,31,30,31,31,30,31,30,31};
        int result = DateArrays[month - 1];
        if (year % 4 == 0 ){
            if (year % 100 == 0 && year % 400 != 0) return result;
            else{ 
                if (month == 2) return 29;
                else return result;
            } 
        }
        return result;
    }
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int month,year;

        do {
            System.out.println("Enter the month: ");
            String temp = keyboard.next();
            month = CheckMonth(temp);
            if (month <= 0) System.out.println("Invalid value");
        } while (month <= 0);

        do {
            System.out.println("Enter the year: ");
            String temp = keyboard.next();
            year = CheckYear(temp);
            if (year == -1) System.out.println("Invalid value");
        } while (year == -1);

        int date = DateNumber(year,month);
        System.out.println("The number of days of month "+ month+"/" + year +" is: "+ date);
        keyboard.close();
    }
}
