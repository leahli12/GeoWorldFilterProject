public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        // HW -- Make a few (3-5) methods that would be helpful to making a scene
        // Ex. car, tree, sun, stars, bird, house
        plane.isTrail = true;
        plane.trailWidth = 5;
//        plane.pausetime = 2;
//        plane.setColor(200, 0, 0);
//        plane.startingAngle(90);
//        square();
//        plane.isTrail = false;
//        plane.startingAngle(0);
//        plane.move(40);
//        plane.startingAngle(90);
//        plane.move(40);
//        dodecagon();
        house();
        tree();
        tree();
        sun();
        shift();
    }


    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);
        plane.move(111);
        plane.turn(90);
    }

    public void dodecagon(){
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(400);
        plane.setColor(81, 50, 168);
        plane.isTrail = true;
        plane.move(50);
        plane.turn(30);
        plane.move(50);
        plane.turn(30);
        plane.move(50);
        plane.turn(30);
        plane.move(50);
        plane.turn(30);
        plane.move(50);
        plane.turn(30);
        plane.move(50);
        plane.turn(30);
        plane.move(50);
        plane.turn(30);
        plane.move(50);
        plane.turn(30);
        plane.move(50);
        plane.turn(30);
        plane.move(50);
        plane.turn(30);
        plane.move(50);
        plane.turn(30);
        plane.move(50);
    }

    public void house(){
        plane.startingAngle(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(210);
        plane.move(60);
        plane.turn(-60);
        plane.move(60);
        plane.isTrail = false;
        plane.startingAngle(180);
        plane.move(60);
        plane.startingAngle(90);
        plane.move(100);
        plane.isTrail = true;
        plane.startingAngle(-90);
        plane.move(30);
        plane.startingAngle(0);
        plane.move(20);
        plane.startingAngle(90);
        plane.move(30);
    }

    public void tree(){
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(100);
        plane.isTrail = true;
        plane.startingAngle(-90);
        plane.move(30);
        plane.startingAngle(0);
        plane.move(15);
        plane.startingAngle(90);
        plane.move(30);
        plane.startingAngle(180);
        plane.move(20);
        plane.startingAngle(-90);
        plane.move(30);
        plane.startingAngle(180);
        plane.move(50);
        plane.turn(-120);
        plane.move(130);
        plane.turn(-120);
        plane.move(130);
        plane.startingAngle(180);
        plane.move(50);
    }

    public void sun(){
        plane.isTrail = false;
        plane.startingAngle(90);
        plane.move(300);
        plane.circle(1);

        plane.isTrail = false;
        plane.startingAngle(180);
        plane.move(20);
        plane.isTrail = true;
        plane.move(100);

        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(120);
        plane.startingAngle(-90);
        plane.move(40);
        plane.isTrail = true;
        plane.startingAngle(225);
        plane.move(80);

        plane.isTrail = false;
        plane.turn(180);
        plane.move(80);
        plane.startingAngle(0);
        plane.move(60);
        plane.startingAngle(-90);
        plane.move(30);
        plane.isTrail = true;
        plane.move(90);

        plane.isTrail = false;
        plane.turn(180);
        plane.move(110);
        plane.startingAngle(0);
        plane.move(40);
        plane.startingAngle(-45);
        plane.move(30);
        plane.isTrail = true;
        plane.move(70);

        plane.isTrail = false;
        plane.turn(180);
        plane.move(100);
        plane.startingAngle(90);
        plane.move(40);
        plane.startingAngle(0);
        plane.move(30);
        plane.isTrail = true;
        plane.move(80);

        plane.isTrail = false;
        plane.turn(180);
        plane.move(120);
        plane.startingAngle(90);
        plane.move(80);
        plane.isTrail = true;
        plane.startingAngle(45);
        plane.move(100);

        plane.isTrail = false;
        plane.turn(180);
        plane.move(100);
        plane.startingAngle(180);
        plane.move(40);
        plane.startingAngle(90);
        plane.move(30);
        plane.isTrail = true;
        plane.move(90);

        plane.isTrail = false;
        plane.turn(180);
        plane.move(100);
        plane.startingAngle(180);
        plane.move(50);
        plane.startingAngle(-90);
        plane.move(20);
        plane.isTrail = true;
        plane.startingAngle(135);
        plane.move(90);
    }

    public void shift(){
        plane.isTrail = false;
        plane.move(111);
    }

}


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/