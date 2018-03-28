# MazeSolver_Berman-Nissenbaum

Possible Algorithm:
In order to make your way through a maze, every time you
come to an intersection, you make a right turn. If
you reach a dead end or return to a previous location and
orientation, you backtrack to the last intersection. If it's
a three-way intersection, go forward, following the same 
rules you followed after turning right. If it's a two-way 
intersection, or if you have already gone right and forward,
go left and follow the same rules again. If all directions
of the intersection have been exhausted, treat the intersection
as if it were a dead end. Once you reach the treasure, stop.

## personnel
William Berman and Cooper Nissenbaum

## statement of problem
Return a boolean representing the following statement:
"This maze is navigable."

## recursive abstraction
The recursive abstraction solves the maze with an already exhausted
portion removed.

## base case
If the current position is the position of the ending point, then terminate the path here.

## English or pseudocode description of algorithm


## class(es), with fields and methods


## version0 wish list

