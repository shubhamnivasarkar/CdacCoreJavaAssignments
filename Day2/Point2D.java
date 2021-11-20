class Point2D{

private int x;
private int y;


public Point2D(int x,int y){
    this.x=x;
    this.y=y;
}
    public String getDetails(){
        return "x: "+x+" y: "+y;
    }

    public boolean isEqual(Point2D point){
        return this.x==point.x && this.y==point.y;

    }
    

    public Point2D createNewPoint(int offSetx, int offSety){
    return new Point2D(x+offSetx,y+offSety);
    }

    public double calDistance (Point2D point){
    return Math.sqrt(Math.pow(point.x-x,2)+Math.pow(point.y-y,2));
    }
}
