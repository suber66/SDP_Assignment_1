public class Client {
    public static void main(String[] args) {
        TravelDirector director = new TravelDirector();

        TravelPackageBuilder travelBuilder = new TravelPackageBuilder();
        TravelBrochureBuilder brochureBuilder = new TravelBrochureBuilder();
        director.makeExpensiveTravel(travelBuilder);
        director.makeExpensiveTravel(brochureBuilder);

        TravelPackage travelPackage = travelBuilder.getResult();
        String brochure = brochureBuilder.getResult();

        director.makeCheapTravel(travelBuilder);
        director.makeCheapTravel(brochureBuilder);

        System.out.println(travelPackage + "\n" + brochure);

        System.out.println(travelBuilder.getResult() + "\n" + brochureBuilder.getResult());
    }
}
