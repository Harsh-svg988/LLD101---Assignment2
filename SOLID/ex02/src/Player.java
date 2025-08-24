class Player {
    private final Decoder decoder;
    private final Renderer renderer;
    private final FrameCache cache;

    Player(Decoder decoder, Renderer renderer, FrameCache cache) {
        this.decoder = decoder;
        this.renderer = renderer;
        this.cache = cache;
    }

    void play(byte[] fileBytes) {
        Frame f = decoder.decode(fileBytes);
        renderer.render(f);
        cache.save(f);
        System.out.println("Cached last frame? " + cache.hasLast());
    }
}