public class Problem2 {
    
        // print the numbers 1 thru 16,
        // except print the word BUZZ when the number is
        // a multiple of 3 or 5
        //
        // Write a comment describing what was wrong with the program and how you fixed it
        public static void main(String[] args) {
            for(int i = 1; i <= 16; i++) {
              // the conditional expression inside the parentheses
              // of the if-statement means
              // "i is a multiple of 3 OR i is a multiple of 5"
              if (i % 3 == 0 || i % 5 == 0) { 
                 System.out.println("BUZZ");
              }
              else {
                System.out.println(i);
              }
            }
        }
    }

// The program was missing the for loop constraints, but had the rest. I inserted that part and it works like a charm!