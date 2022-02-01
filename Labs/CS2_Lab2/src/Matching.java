public class Matching {
    public static void main(String[] args){
        System.out.println(find("",""));
        System.out.println(find("","a"));
        System.out.println(find("Hello World,","World"));
        System.out.println(find("World", "Hello World"));
        System.out.println(find("Hello World", "lo W"));
    }

//    find("","") returns 0
//    find("", "a") returns -1
//    find("Hello World", "World") returns 6
//    find("World", "Hello World") returns -1
//    find("Hello World", "lo W") returns 3

    public static int find(String x, String y){
        for (int i = 0; i < x.length() - y.length()+1; i++){
            if(x.substring(i, i + y.length()).equals(y)) {
                return i;
            }
        }
        return -1;
    }
}
