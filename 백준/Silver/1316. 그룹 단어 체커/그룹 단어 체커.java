import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        String check = "";
        boolean bool = false;
 
        int n = sc.nextInt();

        sc.nextLine();
        
        String[] str = new String[n];
        
        for(int i=0; i<n; i++){
            str[i] = sc.nextLine();   
        }
        
        sc.close();
        
        
        for(int i=0; i<str.length; i++){
        	
        	check = "";
        	
            for(int j=0; j<str[i].length(); j++){
                if(!(check.contains(String.valueOf(str[i].charAt(j))))){
                    check += str[i].charAt(j);
                    bool = true;
                }
                else{
                	if(j>0 && str[i].charAt(j) != str[i].charAt(j-1)) {
                		bool = false;
                		break;
                	}
                }
            }
            
            if(bool == true){
                count++;
            }
            
        }
        
        System.out.print(count);
        
    }
}