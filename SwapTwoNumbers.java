public class SwapTwoNumbers {
    public void swapTwoNumbers(int number1, int number2){
        System.out.println("Initial values are number1 = " + number1 + " and number2 = " + number2);
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.println("New swaped values are number1 = " + number1 + " and number2 = " + number2);
    }
}
