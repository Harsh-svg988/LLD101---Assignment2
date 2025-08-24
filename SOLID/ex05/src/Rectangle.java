class Rectangle implements Shape {
    private final int w, h;
    Rectangle(int w, int h) { this.w = w; this.h = h; }
    public int area() { return w * h; }
}