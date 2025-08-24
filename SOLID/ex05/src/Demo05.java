public class Demo05 {
    static int areaAfterResize(Shape s){
        // Instead of "resizing" via setters,
        // we simulate by creating a new shape
        Shape resized = (s instanceof Square)
            ? new Square(4)     // side 4
            : new Rectangle(5,4); // width=5, height=4
        return resized.area();
    }

    public static void main(String[] args) {
        System.out.println(areaAfterResize(new Rectangle(1,1))); // 20
        System.out.println(areaAfterResize(new Square(1)));      // 16
    }
}
