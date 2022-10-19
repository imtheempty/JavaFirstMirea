package ru.mirea.task7;

class MovableRectangle implements Movable{
    public int x,y,xSpeed,ySpeed;
    String A;
    String to_string(int k) {
        A = Integer.toString(k);
        return A;
    }
    int SpeedTest(int topLeft,int bottomRight,int xSpeed,int ySpeed) {
        if(topLeft+xSpeed==bottomRight+xSpeed && topLeft+ySpeed==bottomRight+ySpeed)return 1;
        else return -1;
    }
    public MovableRectangle(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
    }

    @Override
    public void moveDown() {
        y=y-ySpeed;
    }

    @Override
    public void moveLeft() {
        x=x-xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }

    public static void main(String[] args) {

    }
}