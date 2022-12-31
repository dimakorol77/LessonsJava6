package Lesson8;

public class Car {

    public static void main(String[] args) {
     lightCars car1 = new lightCars();
     car1.model = "Audi";
     car1.year = 2005;
        System.out.println("Я машина"+" " +car1.model  + " "+   car1.year  +" " + "года" );
     lightCars car2 =  new lightCars ();
     car2.model = "ZAZ";
     car2.year= 1971;
        System.out.println("Я машина"+" " +car2.model  + " "+   car2.year  +" " + "года" );

        lightCars car3 =  new lightCars ();
     car3.model = "Mazda";
     car3.year= 2020;
        System.out.println("Я машина"+" " +car3.model  + " "+   car3.year  +" " + "года" );

        lightCars car4 =  new lightCars ();
     car4.model = "Maybach";
     car4.year = 2022;
        System.out.println("Я машина"+" " +car4.model  + " "+   car4.year  +" " + "года" );

        lightCars car5 =  new lightCars ();
     car5.year = 1992;
     car5.model = "Mercedes";
        System.out.println("Я машина"+" " +car5.model  + " "+   car5.year  +" " + "года" );



    }
}

    class lightCars {
     public lightCars () {
         System.out.println("Привет из немецкого авторынка");
     }
        String model;
        int year;
    }







