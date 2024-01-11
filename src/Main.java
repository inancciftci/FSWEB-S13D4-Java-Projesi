import com.inanc.model.Player;
import com.inanc.model.Point;
import com.inanc.model.Weapon;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6,5);
        Point second = new Point(3,1);

        System.out.println("1) distance(0,0): " + first.distance());
        System.out.println("2) distance(second): " + first.distance(second));
        System.out.println("3) distance(2,2): " + first.distance(2,2));

        Point point = new Point(0,0);
        System.out.println("4) distance(): " + point.distance());

//        Player player1 = new Player("3nonch", 100, Weapon.DEVILS_SWORD);
//        System.out.println(player1.healthRemaining());
//        player1.loseHealth(50);
//        System.out.println(player1.healthRemaining());
//        player1.restoreHealth(25);
//        System.out.println(player1.healthRemaining());
//        player1.loseHealth(76);
//        System.out.println(player1.healthRemaining());

        Player player2 = new Player("Tuso", 100, Weapon.BLADE_OF_CHAOS);
        System.out.println(player2);
        player2.loseHealth(40);
        System.out.println("(-40): " + player2.healthRemaining());
        player2.restoreHealth(30);
        System.out.println("(+30): " + player2.healthRemaining());
        player2.restoreHealth(30);
        System.out.println("(+30?)-should Be 100: " + player2.healthRemaining());
        player2.loseHealth(101);
        System.out.println("(-1?)-should Be 0: " + player2.healthRemaining());
    }


}