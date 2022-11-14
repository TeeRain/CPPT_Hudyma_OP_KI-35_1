import static java.lang.System.out;
import java.io.*;

public class SpaceshipDriver {
    public static void main(String[] args) throws FileNotFoundException
    {



        Spaceship ship1 = new Spaceship();
        out.println(Spaceship.getSpaceshipCountCount());
        out.println(ship1.getStartShipFuel());
        ship1.MoveDown();
        ship1.MoveUp();

    }



}