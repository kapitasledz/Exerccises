import java.util.ArrayList;

class PurchaseOrderTest {
    ArrayList<Position> positions = new ArrayList<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Position position1 = new Position( "Chleb", 2, 2.5);
        Position position2 = new Position( "maslo", 1, 6.99);
        Position position3 = new Position( "ser", 1, 3.40);
        positions.add(position1);
        positions.add(position2);
    }

    @org.junit.jupiter.api.Test
    void getPurchaseValue() {
        // given
        PurchaseOrder myPurchaseOrder = new PurchaseOrder(positions, 2, 3 );
        // when
        double result = myPurchaseOrder.getPurchaseValue();
        // then
        org.junit.jupiter.api.Assertions.assertEquals(result,11.99);

    }

}