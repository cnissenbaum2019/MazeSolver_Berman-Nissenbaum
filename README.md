# MazeSolver_Berman-Nissenbaum

## personnel
William Berman and Cooper Nissenbaum

## statement of problem
Return a boolean representing the following statement:
"This maze is navigable."

## recursive abstraction
The recursive abstraction solves the maze with a new explorer positioning.

## base case
If the current position is the position of the ending point, then terminate the path here.

## English or pseudocode description of algorithm

In order to make your way through a maze, every time you
come to an intersection*, you make a right turn. If there
is no right turn to make, go straight. If
you reach a dead end or return to a previous location and
orientation, backtrack to the last intersection. If all directions
of the intersection have been exhausted, treat the intersection
as if it were a dead end. Once you reach the treasure, stop.

*An intersection is any branching portion of the path, where 
there are two possible ways to travel it does not include a 
left-turn or right-turn

## class(es), with fields and methods
Displayer class: 

    fields: windowheight, console
    methods: constructor, atTopOfWindow

Maze class:

    fields: TREASURE, WALL, STEPPING_STONE, (cardinal directions), maze, MAX_RANKS, rankCount, explorerPosition
    methods: constructors, toString, go, explorerIsOnA
  
Vector class (within maze class): 
  
    fields: rank, file
    methods: constructors, add, equals

UserOfMaze class:

    fields: displayer
    methods: main, moveTest, dropTest, copyConstructTest, displayerTest, snapshotDemo

## version0 wish list

It works

## version0 bug list

Can only solve mazes where the treasure is exactly EAST of the explorer and there are stone inbetween
