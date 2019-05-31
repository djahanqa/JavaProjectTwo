package basic;

public class TryCatch {
    public static void main(String[] args) {
        double Quarter = .25;
        double Dime = .10;
        try {
           double combined = .25 + .10;
            System.out.println("Thirty five Cents=" + combined);
        } catch (Exception e) {
            System.out.println("equation is invalid");
        }
    }

}