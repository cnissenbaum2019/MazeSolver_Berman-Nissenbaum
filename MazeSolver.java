/**
Class meant to display and solve given mazes in file format.
Uses methods/fields from --Maze.java-- to accomplish this.
**/

public class MazeSolver {

	//Fields
	// MazeTerminal named constants
    public final static int TREASURE = 0;
    public final static int WALL = 1;
    public final static int STEPPING_STONE = 2;
    
    // directions that can be searched
    public final static int EAST =  1;
    public final static int NORTH = 2;
    public final static int WEST =  4;
    public final static int SOUTH = 8;
       /* Values are pretty arbitrary. Values of 2^n might be useful
          in the unlikely event that we ever want to add north-west, etc.:
          2+4 --> 6  */
    //private Maze snapshot;

	//Constructors

	//Methods
	public boolean solve(Maze mazeToBeSolved) {

		//super-base-case - if there is no maze
		if(mazeToBeSolved.explorerPosition == null) {return false;}

		//base-case - if on the treasure, DONE
		if (mazeToBeSolved.explorerIsOnA() == TREASURE) {
			return true;
		}


		//recursive case - if in bounds, check all directions 
		//whether or not there is WALL
		else if (mazeToBeSolved.explorerIsOnA() == STEPPING_STONE) {

			//Establish a snapshot - only needed for STEPPING_STONE
			Maze snapshot = new Maze(mazeToBeSolved);

			//Move and Test every direction (whether or not there is a WALL)
			//EAST,NORTH,WEST,SOUTH
			for(int n = 1; n < 9; n = n*2) {

				//Change current stone to a WALL so explorer does not end up back here
				mazeToBeSolved.dropA(WALL);

				//move the explorer in given direction
				mazeToBeSolved.go(n);

				//System.out.println(mazeToBeSolved);
				
				//solve from the new position
				if(solve(mazeToBeSolved)) return true;

				//revert to unchanged snapshot
				mazeToBeSolved = new Maze(snapshot);

				//System.out.println(mazeToBeSolved);

			}

		}

		//backtracking case - if on a wall, go back to last safe maze 
		//(do nothing, let it run it's course and revert to snapshot)
		//System.out.print("WALL\n");
		return false;
	}
	
}