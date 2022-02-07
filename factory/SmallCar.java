public class SmallCar extends Car{
/**
 * Thomas Ferguson
 * @param make make of car
 * @param module model of car
 */
    public SmallCar(String make, String module)
    {
        super(make, module); 
    }
/**
 * adds frame
 */
    protected void addFrame()
    {
        System.out.println("Adding a small frame");
    }
/**
 * adds accessories
 */
    protected void addAccessories()
    {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
    }
}
