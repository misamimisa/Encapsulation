public class Cargo {
    private final double weight;
    private final String deliveryAddress;
    private final boolean turnOver;
    private final String regNumber;
    private final boolean fragile;
    private final Dimensions dimensions;

    public Cargo (double weight, String deliveryAddress,
                  boolean turnOver, String regNumber,
                  boolean fragile, Dimensions dimensions){
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.turnOver = turnOver;
        this.regNumber = regNumber;
        this.fragile = fragile;
        this.dimensions = dimensions;
    }

    public double getWeight() {
        return weight;
    }
    public String getDeliveryAddress() {
        return deliveryAddress;
    }
    public boolean isTurnOver() {
        return turnOver;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public boolean isFragile() {
        return fragile;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }

    public Cargo setWeight(double weight) {
        return new Cargo(weight, deliveryAddress, turnOver, regNumber, fragile, dimensions);
    }
    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(weight, deliveryAddress, turnOver, regNumber, fragile, dimensions);
    }
    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(weight, deliveryAddress, turnOver, regNumber, fragile, dimensions);
    }

    public String toString(){
        return "Вес: " + weight + "\n" +
                "Адрес: " + deliveryAddress + "\n" +
                "Габариты: " + "\n" + dimensions + "\n" +
                "Регистрационный номер: " + regNumber;
    }
}
