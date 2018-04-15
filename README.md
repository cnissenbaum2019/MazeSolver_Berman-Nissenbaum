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
move, you first take a snapshot to return to later. 
Then, you first attempt to move west. If you cannot, go north. If
you cannot, go east. If you cannot, go south. Each time you move,
drop a wall in the previously occupied square to avoid revisiting
If you reach a state where you cannot move, bactrack to the snapshot
until you can move in a different direction.
Once you reach the treasure, stop.

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

Returns false for empty maze, but is followed by error message.
Doesn't come out of the solve with an unchanged maze (some stepping stones dropped along the way)

## v1

Returns false for empty maze, no error message.

## v1 bug list

Doesn't come out of the solve with an unchanged maze (some stepping stones dropped along the way)
