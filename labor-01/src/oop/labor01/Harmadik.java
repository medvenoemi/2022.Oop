package oop.labor01;

public class Harmadik {
    public static double[] max2(double array[]){

        double max[] = {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY};

        if(array.length <= 0){
            max[0] = Double.NaN;
            max[1] = Double.NaN;
            return max;
        }

        if(array.length == 1){
            max[0] = array[0];
            max[1] = array[0];
            return max;
        }

        for (int i=0; i< array.length; ++i) {
            if (array[i] > max[0]) {
                if (array[i] > max[1]) {
                    max[0] = max[1];
                    max[1] = array[i];
                } else {
                    max[0] = array[i];
                }
            }

        }
        return max;
    }
    public static void main(String[] args){
        double[] x = {500,25,100,-1};
        double[] maxes = max2(x);
        double max1 = maxes[0];
        double max2 = maxes[1];
        System.out.println("The two biggest elements are: " + max1 + " " + max2);
    }
}
