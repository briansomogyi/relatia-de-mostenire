package Avioane;

public class AvioaneDeLupta extends Avioane {

    public AvioaneDeLupta(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
        // TODO Auto-generated constructor stub
    }

    public static AvioaneDeLupta creeazaAvioaneDeLupta(String planeID, int totalEnginePower) {
        if (planeID == null) {
            return null;
        } else {
            if (planeID.equals("Mig")
                    || planeID.equals("TomCat")) {
                return new AvioaneDeLupta(planeID, totalEnginePower);
            } else {
                return null;
            }
        }
    }

    public void launchMissile() {
        System.out.println("PlaneID Value - Initiating missile launch procedure - Acquiring target - Launching missile - Breaking away - Missile launch complete.");
    }
    
    public String toString() {
        return "A fighter jet";
    }

    public static void main(String[] args) {
        AvioaneDeLupta avioane = creeazaAvioaneDeLupta(null, 0);
        AvioaneDeLupta avioane2 = creeazaAvioaneDeLupta("Boeing", 0);
        AvioaneDeLupta avioane3 = creeazaAvioaneDeLupta("Concorde", 0);
        AvioaneDeLupta avioane4 = creeazaAvioaneDeLupta("Mig", 0);
        AvioaneDeLupta avioane5 = creeazaAvioaneDeLupta("TomCat", 0);
        AvioaneDeLupta[] myArray = { avioane, avioane2, avioane3, avioane4, avioane5 };
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == null) {
                System.out.println("Element at index " + i + ": " + myArray[i] + " has not been created.");
            } else {
                System.out.println("Element at index " + i + ": " + myArray[i] + " has been created.");
                System.out.println(myArray[i].getPlaneID());
                System.out.println(myArray[i].getTotalEnginePower());
                myArray[i].takeOff();
                myArray[i].fly();
                myArray[i].launchMissile();
                myArray[i].land();
            }
        }
    }
}
