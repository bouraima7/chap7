public class CompareArraysTest {

    public static void main (String [] args){
        //Tests the CompareArrays.compare method
        // It does not ask the user for input
        // Just create the needed arrays to test CompareArrays.compare

        int [] one = {1,2,3,4,5};
        int [] two = {1,3,4,5,6,5};
        int [] three = {1,2,3,4,5};

        // Call the compare method inside of the CompareArrays Class
        boolean truth;
        truth = CompareArrays.compare(one , three); //returns a boolean
        //Depending if true or false,
        //If statement here to decipher based on the return value of CompareArrays.compare method
        if (truth == true){
            System.out.println(" The arrays are equal!");
        }
        else {
            System.out.println(" The arrays are NOT equal!");
        }




    }

}
