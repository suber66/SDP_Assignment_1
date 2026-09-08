public class TravelPackageBuilder implements TravelBuilder {
    private String destination,duration,price;
    @Override
    public TravelBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    @Override
    public TravelBuilder setDuration(String duration) {
        this.duration = duration;
        return this;
    }

    @Override
    public TravelBuilder setPrice(String price) {
        this.price = price;
        return this;
    }

    @Override
    public TravelBuilder reset() {
        destination = duration = price = null;
        return this;
    }

    public TravelPackage getResult() {
        if (destination == null || duration == null || price == null) {
            throw new IllegalStateException("Destination, Duration or Price is null");
        }
        return new TravelPackage(destination,duration,price);
    }

}
