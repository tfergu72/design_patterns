public class SmallCar extends Car{
    public SmallCar(String make, String module)
    {
        super(make, module); 
    }

    protected void addFrame()
    {
        System.out.println("Adding a small frame");
    }
    protected void addAccessories()
    {
        accessories.add(Accessories.FLOOR_MATTS);
        accessories.add(Accessories.PHONE_CHARGER);
    }
}
