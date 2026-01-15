
# Snake & Ladder Game in Java

A classic Snakes and Ladders board game implemented in Java, demonstrating core programming concepts like Object-Oriented Programming (OOP), data structures, and algorithms. Players roll a die to move across a numbered board, climbing ladders and sliding down snakes, with the first to reach the final square winning.

## Features

*   **Player Turns:** Turn-based gameplay for 2+ players.
*   **Dice Roll:** Uses `java.util.Random` for dice outcomes (1-6).
*   **Board:** A 10x10 grid (100 squares) with specific snake and ladder positions.
*   **Snakes & Ladders:** Implemented using `HashMap` for efficient lookups (head -> tail, start -> end).
*   **Winning Condition:** First player to reach square 100 wins.
*   **Console/Basic GUI:** (Specify if console or JavaFX/Swing)

## Concepts Demonstrated

*   **Object-Oriented Design:** Classes for `Player`, `Board`, `Game`, `Dice`.
*   **Data Structures:** `HashMap` for snake/ladder mapping.
*   **Algorithms:** Logic for movement, turn management, and game state.
*   **Randomness:** `Random` class for dice simulation.

## How to Play (Console Version)

1.  Compile the Java files: `javac *.java`
2.  Run the main class: `java SnakeNLadder` (or your main class name)
3.  Follow the prompts to roll the dice and move your piece.

## Rules

*   Start at square 0 (outside the board).
*   Roll a 6 to get an extra turn (optional rule).
*   Land on a ladder base, climb to the top.
*   Land on a snake head, slide to the tail.

