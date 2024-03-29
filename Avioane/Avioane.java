package Avioane;

/**
 * Avioane
 */
public class Avioane {

    private String planeID;
    private int totalEnginePower;

    public Avioane(String planeID, int totalEnginePower) {
        this.planeID = planeID;
        this.totalEnginePower = totalEnginePower;
    }

    public static Avioane creeazaAvioane(String planeID, int totalEnginePower) {
        if (planeID == null) {
            return null;
        } else {
            if (planeID.equals("Boeing") || planeID.equals("Concorde") || planeID.equals("Mig")
                    || planeID.equals("TomCat")) {
                return new Avioane(planeID, totalEnginePower);
            } else {
                return null;
            }
        }
    }

    public String getPlaneID() {
        return planeID;
    }

    public int getTotalEnginePower() {
        return totalEnginePower;
    }

    public void takeOff() {
        System.out.println("PlaneID " + planeID
                + " - Initiating takeoff procedure - Starting engines - Accelerating down the runway - Taking off - Retracting gear - Takeoff complete.");
    }

    public void fly() {
        System.out.println("PlaneID " + planeID + " - Flying.");
    }

    public void land() {
        System.out.println("PlaneID " + planeID
                + " - Initiating landing procedure - Enabling airbrakes - Lowering gear - Contacting runway - Decelerating - Stopping engines - Landing complete.");
    }

    public String toString() {
        return "A " + planeID + " type of airplane";
    }

    public static void main(String[] args) {
        Avioane avioane = creeazaAvioane(null, 0);
        Avioane avioane2 = creeazaAvioane("Boeing", 0);
        Avioane avioane3 = creeazaAvioane("Concorde", 0);
        Avioane avioane4 = creeazaAvioane("Mig", 0);
        Avioane avioane5 = creeazaAvioane("TomCat", 0);
        Avioane[] myArray = { avioane, avioane2, avioane3, avioane4, avioane5 };
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == null) {
                System.out.println("Element at index " + i + ": " + myArray[i] + " has not been created.");
            } else {
                System.out.println("Element at index " + i + ": " + myArray[i] + " has been created.");
                System.out.println(myArray[i].getPlaneID());
                System.out.println(myArray[i].getTotalEnginePower());
                myArray[i].takeOff();
                myArray[i].fly();
                myArray[i].land();
            }
        }
    }
}