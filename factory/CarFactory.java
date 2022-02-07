public class CarFactory {
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
