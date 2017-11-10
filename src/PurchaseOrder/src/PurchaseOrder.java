import java.util.ArrayList;

public class PurchaseOrder {
    private ArrayList<Position> positions;
    private int numberOfAddedPositions;
    private int maximalNumberInOrder;

    PurchaseOrder() {};

    PurchaseOrder (ArrayList<Position> positions, int numberOfAddedPositions, int maximalNumberInOrder) {
        this.positions = positions;
        this.numberOfAddedPositions = numberOfAddedPositions;
        this.maximalNumberInOrder = maximalNumberInOrder;
    }

    public void addPosition(Position position) {
        this.positions.add(position);
    }

    public double getPurchaseValue () {
        double value = 0;
        for(Position position : positions) value += position.computeValue();
        return  value;
    }

}
