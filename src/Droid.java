public class Droid {
    String name;
    int energyLevel;

    public Droid(String droidName){
     name = droidName;
     energyLevel = 100;
    }
    public String toString(){
        return "Hello I'm droid " + name +"!";
    }

    public void performTask(String task){
        energyLevel = energyLevel - 10;
        System.out.println("I'm " +task +"!");
    }
   public void energyReport(){
    System.out.println("Energy level: "+ energyLevel +"%" );
   }
   public void energyTransfer(Droid energyReceiver, int energyGiven){
       energyLevel = energyLevel - energyGiven;
       energyReceiver.energyLevel = energyReceiver.energyLevel + energyGiven;

       System.out.println(name + " transferred " + energyGiven + "% energy to "+ energyReceiver.name+"!"
               + name + " has " + energyLevel +"% energy left!"
               + energyReceiver.name + " has " + energyReceiver.energyLevel+"% energy!");
   }
    public static void main(String[] args){
        Droid r2d2 = new Droid("R2d2");
        System.out.println(r2d2);
        r2d2.performTask("dancing");
        r2d2.energyReport();
        Droid g3r3 = new Droid("G3r3");
        System.out.print(g3r3);
        g3r3.energyReport();
        g3r3.energyTransfer(r2d2,5);
        





    }

}
