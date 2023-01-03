public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;


    public Elevator(int minFloor, int maxFloor){
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }
    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }
    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }
    public int getCurrentFloor() {
        return currentFloor;
    }
    int i;
    public void move(int floor){
        for (i=minFloor; i <=maxFloor; i = i + 1){
            if (floor < minFloor || floor > maxFloor) {
                System.out.println("ERROR! Wrong floor!");
                break;
            }
            if (floor > currentFloor) {
                moveUp();
                System.out.println("Move Up. Current floor: " + getCurrentFloor());
            }
            if (floor == currentFloor) {
                break;
            }
            if (floor < currentFloor) {
                moveDown();
                System.out.println("Move Down. Current floor: " + getCurrentFloor());
            }
        }
    }
}
