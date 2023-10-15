public class CompareArrays {
    //This class determines if two arrays are equal

    public static boolean compare(int[] arrayOne, int[] arrayTwo){


        int [] one = arrayOne;
        int [] two = arrayTwo;

        //length
        if (one.length != two.length){
            return false;
        }
        else { //compares the contents in the arrays
            for (int a=0; a<one.length; a++){
                if (one[a] != two[a]){
                    return false;
                }
            }
        }
        return true;
        //contents


        // if the arrays are equal, return true






        //if the arrays are NOT equal then return false

    }
}
