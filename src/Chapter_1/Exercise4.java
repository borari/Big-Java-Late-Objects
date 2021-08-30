package Chapter_1;

public class Exercise4 {
    public static void main(String[] args){
        int startBal = 1000;
        double yearOne = (startBal * .05) + startBal;
        double yearTwo = (yearOne * .05) + yearOne;
        double yearThree = (yearTwo * .05) + yearTwo;
        System.out.println("Your starting account balance is: " + startBal);
        System.out.println("Your ending account balance is: " + yearThree);
    }
}
