import java.io.*;
import java.util.*;

public class euler{
    static class info{
        char[] equation;
        Integer step_size;
        Integer step_num;
        Integer x_coord;
        Integer y_coord;  
        public info(char[] e, int a, int c, int d){
            this.equation = e;
            this.step_size = a;
            this.x_coord = c;
            this.y_coord = d;
        }
        public int calculate(info o){
            for(int i = 0; i < o.equation.length; i++){

            }
            return 0; // TEMPORARY
        }
        
    }
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(r.readLine());
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Welcome to Euler Calculator V.0.2, please enter your Differential Equation. (Q for quit)");
        char[] eq = st.nextToken().toCharArray();
        if(eq[0] == 'Q'){
            pw.println("exited program");
        }
        else{
            pw.println("Ok, now please enter step size and number, as well as a known coordinate x, y");
            st = new StringTokenizer(r.readLine());
            int hstep = Integer.parseInt(st.nextToken());
            int stepno = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for(int i = 0; i < stepno; i++){
                
            }
        }
        pw.close();
    }
}
