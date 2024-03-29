package Avioane;

public class AvioaneDeLuptaTomCat extends AvioaneDeLupta {
    
    public AvioaneDeLuptaTomCat(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
        //TODO Auto-generated constructor stub
    }

    public static AvioaneDeLuptaTomCat creeazaAvioaneDeLuptaTomCat(String planeID, int totalEnginePower) {
        if (planeID == null) {
            return null;
        } else {
            if (planeID.equals("TomCat")) {
                return new AvioaneDeLuptaTomCat(planeID, totalEnginePower);
            } else {
                return null;
            }
        }
    }

    public void refuel() {
        System.out.println("PlaneID Value - Initiating refueling procedure - Locating refueller - Catching up - Refueling - Refueling complete.");
    }

    public String toString() {
        return "A TomCat fighter jet";
    }

    public static void main(String[] args) {
        AvioaneDeLuptaTomCat avioane = creeazaAvioaneDeLuptaTomCat(null, 0);
        AvioaneDeLuptaTomCat avioane2 = creeazaAvioaneDeLuptaTomCat("Boeing", 0);
        AvioaneDeLuptaTomCat avioane3 = creeazaAvioaneDeLuptaTomCat("Concorde", 0);
        AvioaneDeLuptaTomCat avioane4 = creeazaAvioaneDeLuptaTomCat("Mig", 0);
        AvioaneDeLuptaTomCat avioane5 = creeazaAvioaneDeLuptaTomCat("TomCat", 0);
        AvioaneDeLuptaTomCat[] myArray = { avioane, avioane2, avioane3, avioane4, avioane5 };
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
                myArray[i].refuel();
                myArray[i].land();
            }
        }
    }
}
