public class Population {

    public Population() {
    }

    public double birthPrYear(double birthRateInSeconds) {
        double birthPrMin = 60 / birthRateInSeconds;
        double birthPrHour = birthPrMin * 60;
        double birthPrDay = birthPrHour * 24;
        double birthPrYear = birthPrDay * 365;

        return birthPrYear;
    }

    public double deadPrYear(double deadRateInSeconds){
        double deadPrMin =  60 / deadRateInSeconds;
        double deadPrHour = deadPrMin * 60;
        double deadPrDay = deadPrHour * 24;
        double deadPrYear = deadPrDay * 365;

        return deadPrYear;
    }

    public void getSumOfPopulationInFuture(double population, double years){
        double deadPrYear = deadPrYear(13);
        double birthPrYear = birthPrYear(7);

        double futurePopulation = (birthPrYear - deadPrYear) * years + population;

        System.out.println();
        System.out.printf("in " + years + " years, the population is " + "%.0f",futurePopulation);
    }

    public void getGrowthOfPopulationInFuture(double years){
        double deadPrYear = deadPrYear(13);
        double birthPrYear = birthPrYear(7);

        double futureGrowth = years * (birthPrYear - deadPrYear);

        System.out.println();
        System.out.printf("in " + years + " years the population will grow with " + "%.0f",futureGrowth);
    }

    public static void main(String[] args) {
        Population population = new Population();

        population.getSumOfPopulationInFuture(331002651, 5);

        population.getGrowthOfPopulationInFuture(5);



    }
}
