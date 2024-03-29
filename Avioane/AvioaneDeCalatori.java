package Avioane;

public class AvioaneDeCalatori extends Avioane {

    int maxPassengers;

    public AvioaneDeCalatori(String planeID, int totalEnginePower, int maxPassengers) {
        super(planeID, totalEnginePower);
        // TODO Auto-generated constructor stub
        this.maxPassengers = maxPassengers;
    }

    public static AvioaneDeCalatori creeazaAvioaneDeCalatori(String planeID, int totalEnginePower, int maxPassengers) {
        if (planeID == null) {
            return null;
        } else {
            if (planeID.equals("Boeing") || planeID.equals("Concorde")) {
                return new AvioaneDeCalatori(planeID, totalEnginePower, maxPassengers);
            } else {
                return null;
            }
        }
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public String toString() {
        return "A passenger airplane";
    }

    public static void main(String[] args) {
        AvioaneDeCalatori avioane = creeazaAvioaneDeCalatori(null, 0, 0);
        AvioaneDeCalatori avioane2 = creeazaAvioaneDeCalatori("Boeing", 0, 0);
        AvioaneDeCalatori avioane3 = creeazaAvioaneDeCalatori("Concorde", 0, 0);
        AvioaneDeCalatori avioane4 = creeazaAvioaneDeCalatori("Mig", 0, 0);
        AvioaneDeCalatori avioane5 = creeazaAvioaneDeCalatori("TomCat", 0, 0);
        AvioaneDeCalatori[] myArray = { avioane, avioane2, avioane3, avioane4, avioane5 };
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == null) {
                System.out.println("Element at index " + i + ": " + myArray[i] + " has not been created.");
            } else {
                System.out.println("Element at index " + i + ": " + myArray[i] + " has been created.");
                System.out.println(myArray[i].getPlaneID());
                System.out.println(myArray[i].getTotalEnginePower());
                System.out.println(myArray[i].getMaxPassengers());
                myArray[i].takeOff();
                myArray[i].fly();
                myArray[i].land();
            }
        }
    }
}
