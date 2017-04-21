public class Banknote {
    private final int[] bankCount;

    public Banknote(int[] bankCount) {

        this.bankCount = bankCount;
    }

    public int fiveHundred() {
        return this.bankCount[0];
    }

    public int oneHundred() {
        return this.bankCount[1];
    }

    public int fifty() {
        return this.bankCount[2];
    }

    public int twenty() {
        return this.bankCount[3];
    }

    public int ten() {
        return this.bankCount[4];
    }
}
