import java.util.*;

class Result {
    public static int countingValleys(int steps, String path) {
        int v=0;  //valley
        int level = 0;
        for(int i=0; i<steps ; i++){ //iterating through the whole string
            if(path.charAt(i) == 'U') 
                level++;
            else
                level--;
            
            if(level == 0 && path.charAt(i) == 'U') //if we get back to sea level and it was because we added +1 to level then it means we came up from a valley so add 1 to valley
                v++;
        }
        return v;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        int steps = path.length();
        System.out.println(countingValleys(steps, path));
        scanner.close();
    }
}
