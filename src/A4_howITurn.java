

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        // Pentagon
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 7;
        plane.setColor(50, 160, 168);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);
        plane.turn(72);
        plane.move(100);

        // Hexagon
        plane.isTrail = false;
        plane.startingAngle(90);
        plane.move(200);
        plane.setColor(50, 91, 168);
        plane.isTrail = true;
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);
        plane.turn(60);
        plane.move(100);

        // Dodecagon
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(400);
        plane.setColor(81, 50, 168);
        plane.isTrail = true;
        plane.move(100);
        plane.turn(30);
        plane.move(100);
        plane.turn(30);
        plane.move(100);
        plane.turn(30);
        plane.move(100);
        plane.turn(30);
        plane.move(100);
        plane.turn(30);
        plane.move(100);
        plane.turn(30);
        plane.move(100);
        plane.turn(30);
        plane.move(100);
        plane.turn(30);
        plane.move(100);
        plane.turn(30);
        plane.move(100);
        plane.turn(30);
        plane.move(100);
        plane.turn(30);
        plane.move(100);

    }


}
