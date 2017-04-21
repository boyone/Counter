public class Counter {

    public Banknote change(int amount) {
        int[] bank = {500, 100, 50, 20, 10};
        int[] bankCount = new int[bank.length];

        for (int i = 0; i < bank.length; i++) {
            bankCount[i] = amount / bank[i];
            amount %= bank[i];
        }

        return new Banknote(bankCount);
    }
}
