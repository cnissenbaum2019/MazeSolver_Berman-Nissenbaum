public class UserOfMazeSolver{

	public static void main(String[] commandLine) throws java.io.FileNotFoundException {

		//10x10 maze
		Maze myMaze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );

		MazeSolver IWantMySolverTo = new MazeSolver();

		//System.out.println(IWantMySolverTo.solve(myMaze));
		IWantMySolverTo.solve(myMaze);

		System.out.println(myMaze);

	}
}