package corejavatest;
//15. Write an immutable Point class (final fields, no setters, defensive
//    copying if it holds mutable objects like a List or array).
//    Demonstrate why it's immutable by trying to modify it after creation.

final class Point {
    private final int x; // cannot be changed
    private final int y;

    Point(int x,int y){
        this.x=x;
        this.y=y;
        
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point(" +x+ "," +y+ ")";
    }

    static void main() {
        Point p=new Point(10,20);
        System.out.println(p);
        System.out.println("X: "+p.getX());
        System.out.println("Y: "+p.getY());

        //p.x=50; //cannot modify

    }
}
//why Immutable -class is final,fields are private and final,no setter methods
