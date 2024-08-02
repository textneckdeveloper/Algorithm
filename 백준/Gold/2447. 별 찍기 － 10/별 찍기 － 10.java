import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine());
        char[][] star = new char[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                star[i][j] = ' ';
            }
        }

        fillStar(star, 0, 0, N);

        for(int i=0; i<N; i++){
            pw.println(star[i]);
        }

        pw.flush();
        br.close();
        pw.close();
        
    }
    
    public static void fillStar(char[][] star, int x, int y, int size){
        
    	if(size == 1){
            star[x][y] = '*';
            return;
        }

        int newSize = size/3;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i == 1 && j == 1){
                    continue;
                }
                fillStar(star, x+i * newSize, y+j * newSize, newSize);
            }
        }
   
    }

}