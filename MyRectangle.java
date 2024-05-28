package QAP2;

public class MyRectangle {
    private myPoint topLeft;
    private myPoint bottomRight;

    public MyRectangle(myPoint topLeft, myPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    //add coordinates
    public MyRectangle(int x1, int y1, int x2, int y2){
        this.topLeft = new myPoint(x1, y1);
        this.bottomRight = new myPoint(x2, y2);
    }

    //get and set
    public myPoint getTopLeft(){
        return topLeft;
    }

    public void setTopLeft(myPoint topLeft){
        this.topLeft = topLeft;
    }
    public myPoint getBottomRight(){
        return bottomRight;
    }

    public void setBottomRight(myPoint bottomRight){
        this.bottomRight = bottomRight;
    }

    //width
    public int getWidth(){
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    //height
    public int getHeight(){
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    //area
    public int getArea(){
        return getWidth() * getHeight();
    }

    //perimeter
    public int getPerimeter(){
        return 2 * (getWidth() + getHeight());
    }

    //to string
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight +
               ", width=" + getWidth() + ", height=" + getHeight() +
               ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
    }
}
