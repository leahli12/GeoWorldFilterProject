public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.pausetime = 1;
//        for(int x=0;x<500;x+=100)
//        {
//            System.out.println(x);
//            plane.teleport(x, 50);
//            plane.square(100);
//        }
//        fives();
//        negatives();
//        rowOfSmallSquares();
        plane.isTrail = false;
        plane.move(100);
        plane.isTrail = true;
//        columnOfSmallSquares();
        plane.isTrail = false;
        plane.startingAngle(0);
        plane.move(200);
        plane.startingAngle(90);
        plane.isTrail = true;
//        gridOfSmallSquares();
        plane.teleport(0,0);
        gridOfSmallSquares2();
        crisscross();
    }
    public void fives(){
        for(int x = 5; x < 36; x += 5){
            System.out.println(x);
        }
    }

    public void negatives(){
        for(int x = 5; x > -13; x-=1){
            System.out.println(x);
        }
    }

    public void rowOfSmallSquares(){
        plane.trailWidth=5;
        for(int x = 0; x < 10; x += 1){
            plane.square(10);
            plane.startingAngle(0);
            plane.move(10);
            plane.startingAngle(90);
        }
    }
    public void columnOfSmallSquares(){
        plane.trailWidth=5;
        //put your loop here
        for(int x = 0; x < 10; x += 1){
            plane.square(10);
            plane.startingAngle(90);
            plane.move(10);
        }
    }
    public void gridOfSmallSquares(){
        plane.teleport(300, 100);
        for(int x = 1; x < 11; x+=1){
            plane.setColor(200, 150, x * 24);
            rowOfSmallSquares();
            plane.teleport(300, (x * 10) + 100);
        }
    }

    public void gridOfSmallSquares2(){
        plane.teleport(600, 300);
        for(int x = 1; x < 11; x +=1){
            plane.setColor(150, x*10, 200);
            columnOfSmallSquares();
            plane.teleport(x*10 + 600, 300);
        }
    }

    public void crisscross(){
        plane.teleport(400,300);
        int across = 0;
        for (int x = 1; x < 11; x += 1){
            plane.setColor(across * 10, 0, 100);
            plane.square(10);
            plane.teleport(400, across * 10 + 300);
            for (int h = 1; h < 11; h += 1) {
                plane.setColor(across * 10, h*10, 100);
                plane.teleport(across * 10 + 400, h*10 + 300);
                plane.square(10);
            }
            plane.teleport(x * 10 + 400, 300);
            across += 1;
        }
        plane.teleport(550, 200);
    }
}
