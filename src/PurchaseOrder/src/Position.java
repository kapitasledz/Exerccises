public class Position {
    private String itemName;
    private int numberOfItems;
    private double itemPrice;

    Position (String itemName, int numberOfItems, double itemPrice) {
        this.itemName = itemName;
        this.numberOfItems = numberOfItems;
        this.itemPrice = itemPrice;
    }

    public double computeValue() {
        return numberOfItems*itemPrice;
    }

    public String getItemInfo () {
        StringBuilder info = new StringBuilder();
        return info.append(itemName)
                .append("                    ")
                .append(itemPrice)
                .append("    ")
                .append(numberOfItems)
                .append("          ")
                .append(computeValue())
                .toString();
    }
}
