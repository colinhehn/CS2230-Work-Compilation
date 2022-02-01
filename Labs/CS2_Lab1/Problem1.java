public class Problem1 {

    // fix the errors in this program
    // It should print
    // Hello Class!
    // 14
    // This is 99
    //
    // Write a comment describing what was wrong with the program and how you fixed it
    public static void main(String[] args) {
      String x = "Hello Class!";
      System.out.println(x);
      int y = 7 + 7;
      System.out.println(y);
      int z = 98;
      z += 1;
      System.out.println("This is " + z);
    }
}

// Many of the variables were overlapping eachother, and didn't declare their type. Changing this, alongside fixing the string interpolation, made the program work.
// Also some missing semicolons :o