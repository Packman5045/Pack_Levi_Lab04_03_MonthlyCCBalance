public class Main {
    public static void main(String[] args) {

    int BALANCE = 5000;
    double INTERESTRATE = .17;
    int monthOne = (int) (BALANCE * INTERESTRATE);
    int monthTwo = (int) (monthOne * INTERESTRATE);


    System.out.println("Month One interest due is" + " " + BALANCE * INTERESTRATE);
    System.out.println("Month Two Interest due is" + " " + monthTwo);
    }
}