package com.corejava.variable.localvariable;
import lombok.extern.log4j.Log4j2;
@Log4j2
public class Hotel {
    //Static Variable
    public static final String HOTEL_NAME = "Paradise";
    //instance Variable
    public String Dish;
    public int price;

    // Default Constuctor
    public Hotel() {
        this.Dish = "Biriyani";
        this.price = 250;
    }

    // Parameterized Constuctor
    public Hotel(String item, int rate) {
        this.Dish = item;
        this.price = rate;
    }

    public Hotel(int rate, String item) {
        this.price = rate;
        this.Dish = item;
    }

    public static void main(String[] args) {
        //local Variable
        String spiceLevel = "Medium";
        String spiceLevel1= "Hot";
        log.info(HOTEL_NAME);
        Hotel hotel = new Hotel();
        log.info(hotel.Dish + ":" +hotel.price+":"+spiceLevel);
        Hotel hotel1 = new Hotel("Tandoori",150);
        log.info(hotel1.Dish+":"+hotel1.price+":"+spiceLevel1);
        Hotel hotel2 = new Hotel(300,"Chi_Biryani");
        log.info(hotel2.price+":"+hotel2.Dish+":"+spiceLevel1);

    }

}
