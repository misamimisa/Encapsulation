public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(50, 40, 30);
        Cargo cargo = new Cargo(50, "Shulamit Aloni 3", false, "ru29034ru", true, dimensions);
        cargo.setWeight(150);
        cargo.setDeliveryAddress("Gagarina 222");
        cargo.setDimensions(dimensions);
        dimensions.setLength(10);
        dimensions.setHeight(10);
        dimensions.setWidth(10);


        System.out.println(cargo);



        //Elevator
    /*
        Elevator elevator = new Elevator(-3, 26);
        while (true) {
            System.out.println("Enter floor number: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move(floor);
        }
    }*/
    }
}