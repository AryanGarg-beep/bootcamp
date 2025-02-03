public class Travelcomputation {
  public static void main(String[] args) {
    String name = "Eric";
    String fromCity = "Chennai", viaCity = "Vellore", toCity = "Bangalore";
    double distanceToFromVia = 156.6;
    int timeFromToVia  = 4 * 60 + 4;
    double distanceToViaFinalCity = 211.8;
    int timeToFinalCity = 4 * 60 + 25;
    double totalDistance = distanceToFromVia + distanceToViaFinalCity;
    int totalTime = timeFromToVia+ timeToFinalCity;

    System.out.println("The total Distance travelled by "+name+" from "+fromCity+" to "+toCity+" via "+viaCity+" is "+totalDistance+" Km and took "+totalTime+" minutes");
  }
}
