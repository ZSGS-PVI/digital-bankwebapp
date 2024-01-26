package dungeon_game;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Question4 {



	static int shortestPath(int[][] dungeon, int adventurerRow, int adventurerCol, int goldRow, int goldCol,
            int monsRow, int monsCol, int triggerRow, int triggerCol) {
int steps = 0;
int currentX = adventurerRow;
int currentY = adventurerCol;
boolean monsterKilled = false;
boolean triggerActivated = false;

List<String> path = new ArrayList<>();
path.add("(" + currentX + "," + currentY + ")");

while ((currentX != goldRow || currentY != goldCol) && !monsterKilled) {
if (currentX == triggerRow && currentY == triggerCol) {
// Activating the trigger when reaching its location
monsterKilled = true;
triggerActivated = true;
}

if (!monsterKilled) {
if (currentY < monsCol) {
    currentY++;
} else if (currentY > monsCol) {
    currentY--;
} else if (currentX < monsRow) {
    currentX++;
} else if (currentX > monsRow) {
    currentX--;
}

steps++;
} else if (triggerActivated) {
// If monster is killed and trigger activated, proceed towards the gold
if (currentY < goldCol) {
    currentY++;
} else if (currentY > goldCol) {
    currentY--;
} else if (currentX < goldRow) {
    currentX++;
} else if (currentX > goldRow) {
    currentX--;
}

steps++;
}

path.add("(" + currentX + "," + currentY + ")");

if (steps > dungeon.length * dungeon[0].length) {
return -1; // No possible solution
}
}

System.out.println("Adventurer's path:");
for (String pos : path) {
System.out.print(pos + " -> ");
}
System.out.println("(" + adventurerRow + "," + adventurerCol + ")"); // Adding the final gold position to the path
return steps;
}

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int[][] dungeon = {
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 1, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0},
	            {0, 0, 0, 0, 0}
	        };

	        System.out.println("Enter the AdventurerRow and AdventurerCol");
	        int AdventurerRow = in.nextInt();
	        int AdventurerCol = in.nextInt();

	        System.out.println("Enter the MonsterRow and MonsterCol");
	        int monsterRow = in.nextInt();
	        int monsterCol = in.nextInt();
	        
	        System.out.println("Enter the TriggerRow and TriggerCol");
	        int triggerRow = in.nextInt();
	        int triggerCol = in.nextInt();


	        System.out.println("Enter the GoldRow and GoldCol");
	        int goldRow = in.nextInt();
	        int goldCol = in.nextInt();

	    
	        int steps = shortestPath(dungeon, AdventurerRow, AdventurerCol, goldRow, goldCol, monsterRow, monsterCol,
	                triggerRow, triggerCol);

	        if (steps == -1) {
	            System.out.println("No possible solution");
	        } else {
	            System.out.println("Minimum number of steps: " + steps);
	        }
	    }
	}


