public class CarFactory {
   /**
    * Thomas Ferguson 
    * @param type type of car
    * @param make make of car
    * @param model model of car
    * @return small car if type is small, sedan if type is sedan, luxury if type is luxury 
    */
   public static Car createCar(String type, String make, String model)
    {

        if(type.equalsIgnoreCase(CarType.SMALL.name())){
           SmallCar smallcar = new SmallCar(make, model);
           return smallcar;
        }
        else if(type.equalsIgnoreCase(CarType.SEDAN.name()))
        {
           SedanCar sedancar = new SedanCar(make, model);
           return sedancar; 
        }
        else if(type.equalsIgnoreCase(CarType.LUXURY.name()))
        {
           LuxuryCar luxurycar = new LuxuryCar(make, model);
           return luxurycar;
        }
       return null;
    }
    
}
