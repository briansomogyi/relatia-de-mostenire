package Avioane;

public class AvioaneDeCalatoriConcorde extends AvioaneDeCalatori {

    public AvioaneDeCalatoriConcorde(String planeID, int totalEnginePower, int maxPassengers) {
        super(planeID, totalEnginePower, maxPassengers);
        //TODO Auto-generated constructor stub
    }
    
    public static AvioaneDeCalatoriConcorde creeazaAvioaneDeCalatoriConcorde(String planeID, int totalEnginePower, int maxPassengers) {
        if (planeID == null) {
            return null;
        } else {
            if (planeID.equals("Boeing")) {
                return new AvioaneDeCalatoriConcorde(planeID, totalEnginePower, maxPassengers);
            } else {
                return null;
            }
        }
    }

    public void goSuperSonic() {
        System.out.println("PlaneID Concorde - Supersonic mode activated");
    }

    public void goSubSonic() {
        System.out.println("PlaneID Concorde - Supersonic mode deactivated");
    }

    public String toString() {
        return "A Concorde airplane";
    }

    public static void main(String[] args) {
        AvioaneDeCalatoriConcorde avioane = creeazaAvioaneDeCalatoriConcorde(null, 0, 0);
        AvioaneDeCalatoriConcorde avioane2 = creeazaAvioaneDeCalatoriConcorde("Boeing", 0, 0);
        AvioaneDeCalatoriConcorde avioane3 = creeazaAvioaneDeCalatoriConcorde("Concorde", 0, 0);
        AvioaneDeCalatoriConcorde avioane4 = creeazaAvioaneDeCalatoriConcorde("Mig", 0, 0);
        AvioaneDeCalatoriConcorde avioane5 = creeazaAvioaneDeCalatoriConcorde("TomCat", 0, 0);
        AvioaneDeCalatoriConcorde[] myArray = { avioane, avioane2, avioane3, avioane4, avioane5 };
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
                myArray[i].goSuperSonic();
                myArray[i].goSubSonic();
                myArray[i].land();
            }
        }
    }
}
