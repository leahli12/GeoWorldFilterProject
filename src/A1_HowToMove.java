public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
// HW: Make a picture w/ color (15-30 min)
        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        System.out.println("Hello world");
        plane.pausetime = 1; // Must be a whole number
        plane.setColor(10, 161, 25);
        plane.isTrail = true;
        plane.trailWidth = 8;
        plane.circle(0.01);
        // Leg 1
        plane.isTrail = false;
        plane.startingAngle(270);
        plane.move(50);
        plane.startingAngle(0);
        plane.move(20);
        plane.isTrail = true;
        plane.startingAngle(240);
        plane.move(40);
        plane.startingAngle(25);
        plane.move(60);
        // Leg 2
        plane.isTrail = false;
        plane.move(40);
        plane.isTrail = true;
        plane.startingAngle(350);
        plane.move(60);
        plane.startingAngle(135);
        plane.move(50);
        // Leg 3
        plane.isTrail = false;
        plane.move(110);
        plane.isTrail = true;
        plane.startingAngle(45);
        plane.move(60);
        plane.startingAngle(260);
        plane.move(40);
        // Leg 4
        plane.isTrail = false;
        plane.startingAngle(180);
        plane.move(60);
        plane.startingAngle(270);
        plane.move(35);
        plane.isTrail = true;
        plane.startingAngle(170);
        plane.move(50);
        plane.startingAngle(310);
        plane.move(60);
        // Head
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(110);
        plane.startingAngle(90);
        plane.move(40);
        plane.startingAngle(45);
        plane.isTrail = true;
        plane.move(30);
        plane.startingAngle(340);
        plane.move(20);
        plane.startingAngle(270);
        plane.move(20);
        plane.startingAngle(225);
        plane.move(20);
        plane.startingAngle(190);
        plane.move(25);
        plane.teleport(0,0);
//        Use turn method for fox?

    }

}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/