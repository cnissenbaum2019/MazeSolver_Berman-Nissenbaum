public class UserOfMazeSolver{

	public static void main(String[] commandLine) throws java.io.FileNotFoundException {

		Maze myMaze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );

		MazeSolver IWantMySolverTo = new MazeSolver();

		//VERY PROUD OF MY NAMING CONVENTIONS
		System.out.println(IWantMySolverTo.solve(myMaze));
		

		System.out.println(myMaze);

	}
}