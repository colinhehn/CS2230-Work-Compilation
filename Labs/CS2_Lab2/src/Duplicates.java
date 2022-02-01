public class Duplicates {
    /*
            I decided to make a list called duplicateList to go along with the input list, in order to keep
            track of all the numbers present in the array. From there, for every letter in the input array,
            we check if it's already in the duplicateList. If it is, there is a duplicate present in the array,
            if not, then we add it to duplicateList and continue through the rest of the input array.

            There were a few times where I had to stop and run through my code mentally. Just to make sure the logic
            was sound in my head. Nothing outside of my brain and IntelliJ was used for this one.
     */


    public static void main(String[] args){

        int[] true1 = new int[]{};
        System.out.println(noDuplicates(true1)); // returns true

        int[] true2 = new int[]{-1,1};
        System.out.println(noDuplicates(true2)); // returns true

        int[] true3 = new int[]{4,22,100,99,1,5,7};
        System.out.println(noDuplicates(true3)); // returns true

        int[] false1 = new int[]{4,22,100,99,22,5,7};
        System.out.println(noDuplicates(false1)); // returns false

    }
    public static boolean noDuplicates(int[] input) {
        int[] duplicateList = new int[input.length];

        for(int i = 0; i < input.length; i++){
            for(int j = 0; j < duplicateList.length; j++){
                if (input[i] == duplicateList[j]) return false;
            }
            duplicateList[i] = input[i];
        }

        return true;
    }
}
