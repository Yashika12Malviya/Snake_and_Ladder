import player.Player;

import java.util.HashMap;
import java.util.Scanner;
import dice.Dice;
import coordinates.Coordinates;
import jumper.Jumper;
import board.Board;
import game.Game;

public class Main {
    public static void main(String[] args) throws Exception{


        HashMap<String , Jumper> map = new HashMap<>();
        map.put(new String("6"), new Jumper(new Coordinates(9, 5), new Coordinates(6,6)));
        map.put(new String("97"), new Jumper(new Coordinates(0, 1), new Coordinates(9,9)));
        map.put(new String("21"), new Jumper(new Coordinates(7, 0), new Coordinates(0,9)));
        map.put(new String("64"), new Jumper(new Coordinates(3,3 ), new Coordinates(7,4)));

        Player p1 = new Player();
        p1.SetPlayerDetailsFromUserInput(p1);
        Player p2 = new Player();
        p2.SetPlayerDetailsFromUserInput(p2);


        System.out.println("Player name : " + p1.GetPlayerName());
        System.out.println("Player name : " + p2.GetPlayerName());

        Dice dice = new Dice();
        System.out.println(dice.diceRoll());

        Coordinates c = new Coordinates(9,8);
        Coordinates d = new Coordinates(5,9);
        //ndSystem.out.println(c.PrintCoordinates());

       Jumper j =  new Jumper(c,d);
        System.out.println(j.getJumperName());;

        Board b = new Board(10, map);
        b.PrintBoard();

        Game game =  new Game(b, new Player[]{p1,p2}, dice);
        game.play();

    }

}