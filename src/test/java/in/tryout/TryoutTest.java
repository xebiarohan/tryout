package in.tryout;

import static org.junit.Assert.assertEquals;

class TryoutTest {

    private Tryout instance;

    @org.junit.Before
    public void setUp() throws Exception {
        instance = new Tryout();

    }

    @org.junit.Test
    public void testReturnTrue() throws Exception {
        assertEquals(instance.returnTrue(), true);
    }
}
