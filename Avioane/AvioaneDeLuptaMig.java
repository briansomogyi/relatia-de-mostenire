package Avioane;

public class AvioaneDeLuptaMig extends AvioaneDeLupta {

    public AvioaneDeLuptaMig(String planeID, int totalEnginePower) {
        super(planeID, totalEnginePower);
        // TODO Auto-generated constructor stub
    }

    public static AvioaneDeLuptaMig creeazaAvioaneDeLuptaMig(String planeID, int totalEnginePower) {
        if (planeID == null) {
            return null;
        } else {
            if (planeID.equals("Mig")) {
                return new AvioaneDeLuptaMig(planeID, totalEnginePower);
            } else {
                return null;
            }
        }
    }

    public void highSpeedGeometry() {
        System.out.println("PlaneID Value - High speed geometry selected.");
    }

    public void normalGeometry() {
        System.out.println("PlaneID Value - Normal geometry selected.");
    }

    public String toString() {
        return "A Mig fighter jet";
    }

    public static void main(String[] args) {
        AvioaneDeLuptaMig avioane = creeazaAvioaneDeLuptaMig(null, 0);
        AvioaneDeLuptaMig avioane2 = creeazaAvioaneDeLuptaMig("Boeing", 0);
        AvioaneDeLuptaMig avioane3 = creeazaAvioaneDeLuptaMig("Concorde", 0);
        AvioaneDeLuptaMig avioane4 = creeazaAvioaneDeLuptaMig("Mig", 0);
        AvioaneDeLuptaMig avioane5 = creeazaAvioaneDeLuptaMig("TomCat", 0);
        AvioaneDeLuptaMig[] myArray = { avioane, avioane2, avioane3, avioane4, avioane5 };
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
                myArray[i].highSpeedGeometry();
                myArray[i].normalGeometry();
                myArray[i].land();
            }
        }
    }

}
