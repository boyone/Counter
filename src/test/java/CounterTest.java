import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CounterTest {
    @Test
    public void
    change950has1_500banknote_4_100banknote_1_50banknote() {
        Counter counter = new Counter();

        Banknote banknote = counter.change(950);

        assertBanknote(banknote, 1, 4, 1, 0, 0);
    }

    @Test
    public void
    change870has1_500banknote_3_100banknote_1_50banknote_1_20banknote() {
        Counter counter = new Counter();

        Banknote banknote = counter.change(870);

        assertBanknote(banknote, 1, 3, 1, 1, 0);
    }

    @Test
    public void
    change2030has4_500banknote_1_20banknote_1_10banknote() {
        Counter counter = new Counter();

        Banknote banknote = counter.change(2030);

        assertBanknote(banknote, 4, 0, 0, 1, 1);
    }

    private void assertBanknote(Banknote banknote, int fiveHundred, int oneHundred, int fifty, int twenty, int ten) {
        assertEquals(fiveHundred, banknote.fiveHundred());
        assertEquals(oneHundred, banknote.oneHundred());
        assertEquals(fifty, banknote.fifty());
        assertEquals(twenty, banknote.twenty());
        assertEquals(ten, banknote.ten());
    }
}
