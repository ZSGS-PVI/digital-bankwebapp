package dungeon_game;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question3 {

	static int shortestPath(int[][] dungeon, int adventurerRow, int adventurerCol, int goldRow, int goldCol,
			int monsRow, int monsCol) {
		int steps = 0;
		int currentX = adventurerRow;
		int currentY = adventurerCol;

		List<String> path = new ArrayList<>();
		path.add("(" + currentX + "," + currentY + ")");

		while (currentX != goldRow || currentY != goldCol) {

			if (currentY < goldCol && !(currentX == monsRow && currentY + 1 == monsCol)) {
				currentY++;
			}

			else if (currentY > goldCol && !(currentX == monsRow && currentY - 1 == monsCol)) {
				currentY--;
			}

			else if (currentX < goldRow && !(currentX + 1 == monsRow && currentY == monsCol)) {
				currentX++;
			} else if (currentX > goldRow && !(currentX - 1 == monsRow && currentY == monsCol)) {
				currentX--;
			}

			steps++;

			path.add("(" + currentX + "," + currentY + ")");

			if (steps > dungeon.length * dungeon[0].length) {
				return -1; // No possible solution
			}
		}

		System.out.println("Adventurer's path:");
		for (String pos : path) {
			System.out.print(pos + " -> ");
		}
		System.out.println("(" + adventurerRow + "," + adventurerCol + ")"); // Adding the final gold position to the
																				// path
		return steps;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] dungeon = { { 0, 0, 0, 0, 0 },
				            { 0, 0, 0, 1, 0 }, 
				            { 0, 0, 0, 0, 0 }, 
				            { 0, 0, 0, 0, 0 },
				            { 0, 0, 0, 0, 0 }, 
				            { 0, 0, 0, 0, 0 } };

		System.out.println("Enter the AdventurerRow and AdventurerCol");
		int AdventurerRow = in.nextInt(); // 5;
		int AdventurerCol = in.nextInt(); // 1;
		
		System.out.println("Enter the MonsterRow and MonsterCol");
		int monsterRow = in.nextInt(); // 3;
		int monsterCol = in.nextInt(); // 1;

		System.out.println("Enter the GoldRow and GoldCol");
		int goldRow = in.nextInt(); // 4;
		int goldCol = in.nextInt(); // 3;
		
		System.out.println("Enter the TriggerRow and TriggerCol");
		int triggerRow = in.nextInt(); // 3;
		int triggerCol = in.nextInt(); // 1;

	

		int steps = shortestPath(dungeon, AdventurerRow, AdventurerCol, goldRow, goldCol, monsterRow, monsterCol);

		if (steps == -1) {
			System.out.println("No possible solution");
		} else {
			System.out.println("Minimum number of steps: " + steps);
		}
	}
}
