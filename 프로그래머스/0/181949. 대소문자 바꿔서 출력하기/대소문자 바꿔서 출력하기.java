import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char b;
        
        String result = "";
        
        for(byte i=0; i<a.length(); i++){
            
            b = a.charAt(i);
            
            if(Character.isUpperCase(b)){
                b = Character.toLowerCase(b);
            }else{
                b = Character.toUpperCase(b);
            }
            
            result += b;
            
        }
        
        System.out.println(result);
        
    }
}