public class TravelDirector {
    public void makeExpensiveTravel(TravelBuilder builder) {
        builder.reset().setDestination("Dubai").setDuration("2 weeks").setPrice("499$");
    }
    public void makeCheapTravel(TravelBuilder builder) {
        builder.reset().setDestination("Turkey").setDuration("7 days").setPrice("199$");
    }
}
