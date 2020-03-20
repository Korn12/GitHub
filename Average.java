public class Average {
    public static void main(String[] args) {

        int[] dik = {2,4,6,3,4};
        float aver;
        int Sum = 0;

        for (int i=0; i<dik.length; i++) {
            Sum = Sum + dik[i];
        }

        aver = Sum / 5;

        System.out.println(aver);

    }

}