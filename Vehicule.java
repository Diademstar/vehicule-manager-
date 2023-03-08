public class Vehicule {

  
  // private PetrolEngine pE;
    public static void main (String[] args){
  
  PetrolEngine pE = new PetrolEngine();
  //  System.out.println("Hello");
   pE.start();
   pE.stop();
   System.out.println();
   System.out.println(" and then: ");
   System.out.println();
   DieselEngine dE = new DieselEngine();
   dE.start();
   dE.stop();
    
    ElectricEngine eE = new ElectricEngine();
    eE.start();
}
}