

package mazesearch;

public class Maze {
    public static short indicateObstacles=-1;
    public static short startingLocation=-2;
    public static short endingLocation=-3;
    private int width=0;
    private int height=0;
    public Location startLoc=new Location();
    public Location goalLoc=new Location();
    private short [][]maze;
    public Maze(int width, int height) {
        System.out.println("New size " + width + "by " + height);
        this.width=width;
        this.height=height;
        maze=new short[width][height];
        for(int i=0; i<width; i++){
            for(int j=0; j<height; j++){
                maze[i][j]=0;
            }
        }
        for(int i=0; i<height; i++)
            maze[0][i]=maze[width-1][i]=indicateObstacles;
        for(int i=0; i<width; i++)
            maze[i][0]=maze[i][height-1]=indicateObstacles;
        int maxobstacles=width*height/3;
        for(int i=0; i<maxobstacles; i++){
            int x=(int)(Math.random()*width);
            int y=(int)(Math.random()*height);
            setValue(x,y,indicateObstacles);                    
        }
         startLoc.x=0;
         startLoc.y=0;
         setValue(1,1,startingLocation);
         goalLoc.x=width-2;
         goalLoc.y=height-2;
         setValue(width-2,height-2,endingLocation);
    }
            
     synchronized public short getValue(int x, int y){return maze[x][y];}
     synchronized public void setValue(int x, int y, short value){maze[x][y]=value;}
     public int getWidth() {return width; }
     public int getHeight() {return height; }
}