public class SedanCar extends Car {
/**
 * Thomas Ferguson
 * @param make make of car
 * @param model model of car
 */
    public SedanCar(String make, String model)
    {
        super(make, model);
    }
/**
 * Adds frame
 */
    protected void addFrame()
    {
        System.out.println("Adding a three part frame");
    }
/**
 * Adds accessories
 */
    protected void addAccessories()
    {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
        accessories.add(Accessories.BACK_UP_CAMERA);
        accessories.add(Accessories.EXTRA_CUP_HOLDERS);
        accessories.add(Accessories.HEATED_SEATS);
    }
}
