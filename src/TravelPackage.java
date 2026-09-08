public class TravelPackage {
    private final String destination,duration,price;
    TravelPackage(String destination, String duration, String price) {
        this.destination = destination;
        this.duration = duration;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Travel Package: Destination:" + destination + " Duration: " + duration + " price: " + price;
    }
}
