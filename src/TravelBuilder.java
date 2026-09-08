public interface TravelBuilder {
    TravelBuilder setDestination(String destination);
    TravelBuilder setDuration(String duration);
    TravelBuilder setPrice(String price);
    TravelBuilder reset();
}
