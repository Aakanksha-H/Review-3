public class CountSmallerNumber {
    public void countSmallerNumber() {
        int arry [] = { 13 , 12, 13 , 12, 13 , 12, 15, 18,  15, 18, 15, 18, 15, 18};
        int min = arry[0];
        for (int i = 1; i < arry.length; i++) {
            if (min > arry[i]) {
                min = arry[i];
            }
        }
        System.out.println("Min number in arry is " + min);
    }
}
