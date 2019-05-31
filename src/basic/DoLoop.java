package basic;

public class DoLoop {
    public static void main(String[] args) {

        int Temperature = 9;
        int PossibilityOfRain = 8;
        int Humidity = 1;

        do {
            System.out.println("Today's weather report=" + Humidity);
            Temperature--;
        }
            while (Temperature - PossibilityOfRain - Humidity > 2) ;


        }
    }
