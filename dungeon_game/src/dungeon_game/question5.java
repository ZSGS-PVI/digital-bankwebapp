package dungeon_game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class question5 {


	    static int shortestPath(int[][] dungeon, int adventurerRow, int adventurerCol, int goldRow, int goldCol, List<int[]> pitPositions) {
	        int steps = 0;
	        int currentX = adventurerRow;
	        int currentY = adventurerCol;

	        List<String> path = new ArrayList<>();
	        path.add("(" + currentX + "," + currentY + ")");

	        while (currentX != goldRow || currentY != goldCol) {
	            // Check if the next move is towards the gold position
	            int nextX = currentX;
	            int nextY = currentY;

	            if (currentY < goldCol) {
	                nextY++;
	            } else if (currentY > goldCol) {
	                nextY--;
	            } else if (currentX < goldRow) {
	                nextX++;
	            } else if (currentX > goldRow) {
	                nextX--;
	            }

	            // Check if the next move leads to a pit
	            boolean isPit = false;
	            for (int[] pitPos : pitPositions) {
	                if (nextX == pitPos[0] && nextY == pitPos[1]) {
	                    isPit = true;
	                    break;
	                }
	            }

	            // If the next move is not a pit and progress towards the gold is made, update the position
	            if (!isPit && (nextX != currentX || nextY != currentY)) {
	                currentX = nextX;
	                currentY = nextY;
	                steps++;
	                path.add("(" + currentX + "," + currentY + ")");
	            } else {
	                // If no progress towards the gold is made, break the loop
	                return -1; // No possible path to the gold
	            }
	        }

	        if (steps > dungeon.length * dungeon[0].length) {
	            return -1; // No possible solution
	        }

//	        System.out.println(path); // Displaying the path taken
	        return steps;
	    }

	    public static void main(String[] args) {
	    	Scanner in = new Scanner(System.in);
	        int[][] dungeon = {
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 1, 0},
	            {0, 1, 0, 0, 0},
	            {0, 0, 0, 1, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0}
	        };

	        System.out.println("Enter the AdventurerRow and AdventurerCol");
	        int adventurerRow = in.nextInt();
	        int adventurerCol = in.nextInt();
	        System.out.println("Enter the GoldRow and GoldCol");
	        int goldRow = in.nextInt();
	        int goldCol = in.nextInt();
	        System.out.println("Enter the number of pits:");
	        int numOfPits = in.nextInt();
	        
	        List<int[]> pitPositions = new ArrayList<>();
	        for (int i = 1; i <= numOfPits; i++) {
	            System.out.println("Position of pit " + i + ": ");
	            int pitsRow = in.nextInt();
	            int pitsCol = in.nextInt();
	            int[] pit = {pitsRow, pitsCol};
	            pitPositions.add(pit);
	        }

	        int steps = shortestPath(dungeon, adventurerRow, adventurerCol, goldRow, goldCol, pitPositions);

	        if (steps == -1) {
	            System.out.println("No possible solution");
	        } else {
	            System.out.println("Minimum number of steps: " + steps);
	        }
	    }
	}