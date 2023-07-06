public class WeatherCheck {
    public static void main(String[] args) {
        int temperature = 1;
        boolean currentlyRaining = false;

        if (temperature > 20 && !currentlyRaining) {
            System.out.println("sunscreen and shorts");
        } else if (temperature >= 10 && currentlyRaining) {
            System.out.println("take an umbrella");
        } else if (temperature >= 10 && !currentlyRaining) {
            System.out.println("wear a light jacket");
        } else if (temperature < 10 || currentlyRaining) {
            System.out.println("Just stay inside");
        }
    }
}
