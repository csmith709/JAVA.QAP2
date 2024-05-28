package QAP2;

public class myLine {
    private myPoint begin;
    private myPoint end;

    // Set up the line points
    public myLine(int x1, int y1, int x2, int y2) {
        this.begin = new myPoint(x1, y1);
        this.end = new myPoint(x2, y2);
    }

    // Set up begin and end
    public myLine(myPoint begin, myPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Get and set statements
    public myPoint getBegin() {
        return begin;
    }

    public void setBegin(myPoint begin) {
        this.begin = begin;
    }

    public myPoint getEnd() {
        return end;
    }

    public void setEnd(myPoint end) {
        this.end = end;
    }

    // Get and set (int)
    // Begin
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    // End
    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    // Create begin and end x, y array then set
    public int[] getBeginXY() {
        return new int[]{begin.getX(), begin.getY()};
    }

    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()};
    }

    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    // Get length (using xDiff, yDiff)
    public double getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();  // Corrected this line
        return Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
    }

    // Get gradient
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();  // Corrected this line
        return Math.atan2(yDiff, xDiff);
    }

    // toString
    @Override
    public String toString() {
        return "myLine[begin=" + begin + ",end=" + end + "]";
    }
}
