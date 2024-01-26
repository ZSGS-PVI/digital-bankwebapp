package dungeon_game;

import java.util.Scanner;

public class ShortestPathInGold {

	static int shortestPath(int[][] dungeon, int AdventurerRow, int AdventurerCol, int goldRow, int goldCol, int monsRow, int monsCol) {
	    int steps = 0;
	    int currentX = AdventurerRow;
	    int currentY = AdventurerCol;

	    if (monsRow <= AdventurerRow && monsCol <= AdventurerCol) {
	        return -1; 
	    }

	    while (currentX != goldRow || currentY != goldCol) {
	        int advMoves = Math.abs(currentX - goldRow) + Math.abs(currentY - goldCol);
	        int monsterMoves = Math.abs(monsRow - goldRow) + Math.abs(monsCol - goldCol);

	        if (advMoves <= monsterMoves) {
	            return steps + advMoves;
	        }

	        if (currentX < goldRow) {
	            currentX++;
	        } else if (currentX > goldRow) {
	            currentX--;
	        } else if (currentY < goldCol) {
	            currentY++;
	        } else if (currentY > goldCol) {
                 currentY--;
	       }

	        steps++;
	    }

	    return steps;
	}


    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
        int[][] dungeon= {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}
        };
        
        System.out.println("Enter the AdventurerRow and AdventurerCol");
        int AdventurerRow = in.nextInt(); //5;
        int AdventurerCol = in.nextInt(); //1;
        
        System.out.println("Enter the GoldRow and GoldCol");
        int goldRow = in.nextInt();  //1;
        int goldCol = in.nextInt();  //4;
        

        System.out.println("Enter the MonsterRow and MonsterCol");
        int monsterRow = in.nextInt();  //1;
        int monsterCol = in.nextInt();  //4;

        int steps = shortestPath(dungeon,  AdventurerRow, AdventurerCol, goldRow, goldCol,
        		                    monsterRow,monsterCol);
       if(steps==-1) {

           System.out.println("No possible solution ");
       }
       else {
            System.out.println("Minimum number of steps: " + steps);
      
    }
    }
}
