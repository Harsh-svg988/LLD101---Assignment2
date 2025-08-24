class Frame {
    private final byte[] data;
    Frame(byte[] d) { this.data = d; }
    int size() { return data.length; }
}
