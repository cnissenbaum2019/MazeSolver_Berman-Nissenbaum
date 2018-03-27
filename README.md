# MazeSolver_Berman-Nissenbaum
Solves Mazes

Statement of the Problem:
Return a boolean representing the following statement:
"This maze is navigable."

Recursive abstraction:
The recursive abstraction solves the maze with an already exhausted
portion removed.

Possible Algorithm:
In order to make your way through a maze, every time you
come to a two-way intersection, you make a right turn. If
you reach a dead end or return to a previous location and
orientation, you backtrack to the last intersection and turn
left instead.
