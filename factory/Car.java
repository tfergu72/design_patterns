import java.util.ArrayList;

public abstract class Car{
   private String make;
   private String model;
   
   protected ArrayList<Accessories> accessories;

   public Car(String make, String model){
      this.make = make;
      this.model = model;
      accessories = new ArrayList<Accessories>();
      System.out.println("Creating a "+make+ " "+model);
      assemble();
   }

   public void assemble(){
    addFrame();
    addWheels();
    addEngine();
    addWindows();
    addAccessories();
    displayAccessories();
   }

   protected abstract void addFrame();
/**
 * Thomas Ferguson
 * Addes wheels
 */
   protected void addWheels()
   {
      System.out.println("Adding the Wheels");
   }
/**
 * Adds an engine
 */
   protected void addEngine()
   {
      System.out.println("Adding a Standard Engine");
   }
/**
 * Adds windows
 */
   protected void addWindows(){
      System.out.println("Adding Windows");
   }
/**
 * Adds Accessories
 */
   protected abstract void addAccessories();
/**
 * Displays accessories
 */
   protected void displayAccessories()
   {
      System.out.println("Accessories:");
      for(int i = 0; i < accessories.size(); i++){
         System.out.println("-"+accessories.get(i));
      }
   }
}
