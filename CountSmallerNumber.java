public class CountSmallerNumber {
    public void countSmallerNumber() {
        int[] arry = {4,45,41,7,1,5,1,1};
        int count = 0;
        int min = arry[0];
            for (int i = 1; i < arry.length; i++) {
                if (min > arry[i]) {
                    min = arry[i];
                }
            }
        System.out.println("Min number in arry is " + min);
        for(int i = 0; i < arry.length; i++)
        {
            if(arry[i] == min)
            {
                count++;
            }
        }
        System.out.println("The count is " + count);
    }
}
