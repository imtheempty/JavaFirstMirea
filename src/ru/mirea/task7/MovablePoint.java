package ru.mirea.task7;

class MovablePoint implements Movable{
    int topLeft, bottomRight, xSpeed, ySpeed, k;
    String A;
    String to_string(int k) {
        A = Integer.toString(k);
        return A;
    }
    int SpeedTest(int topLeft,int bottomRight,int xSpeed,int ySpeed) {
        if(topLeft+xSpeed==bottomRight+xSpeed && topLeft+ySpeed==bottomRight+ySpeed)return 1;
        else return -1;
    }
    public MovablePoint(int topLeft, int bottomRight, int xSpeed, int ySpeed) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveRight() {
        topLeft+=xSpeed;
        bottomRight+=xSpeed;
    }

    @Override
    public void moveLeft() {
        topLeft-=xSpeed;
        bottomRight-=xSpeed;
    }

    @Override
    public void moveDown() {
        topLeft-=ySpeed;
        bottomRight-=ySpeed;
    }

    @Override
    public void moveUp() {
        topLeft+=ySpeed;
        bottomRight+=ySpeed;
    }

    public static void main(String[] args) {

    }
}