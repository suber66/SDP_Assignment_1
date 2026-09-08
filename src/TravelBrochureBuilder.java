public class TravelBrochureBuilder implements TravelBuilder {
    private StringBuilder sb = new StringBuilder("Travel Package:\n");


    @Override
    public TravelBuilder setDestination(String destination) {
        sb.append("Destination: ").append(destination).append("\n");
        return this;
    }

    @Override
    public TravelBuilder setDuration(String duration) {
        sb.append("Duration: ").append(duration).append("\n");
        return this;
    }

    @Override
    public TravelBuilder setPrice(String price) {
        sb.append("Price: ").append(price).append("\n");
        return this;
    }

    @Override
    public TravelBuilder reset() {
        sb = new StringBuilder("Travel Package:\n");
        return this;
    }

    public String getResult() {
        return sb.toString();
    }
}
