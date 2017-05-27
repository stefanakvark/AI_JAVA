
package mazesearch;

public class MazeSearch {

    
    public static void main(String[] args) {
        Maze m=new Maze(8,8);
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++)
                System.out.print(m.getValue(i,j)+ " ");
            System.out.println();
        }
        
    }
    
}
