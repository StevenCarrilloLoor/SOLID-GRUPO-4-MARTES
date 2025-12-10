package lsp.before;

class Fish extends Animal {
    @Override
    public void walk() {
        throw new UnsupportedOperationException("Fish can't walk.");
    }
}