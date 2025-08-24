class FrameCache {
    private Frame last;
    void save(Frame f) { last = f; }
    boolean hasLast() { return last != null; }
}