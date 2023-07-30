package objects;

import java.util.Scanner;

public class HomeArea {

    private Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        HomeArea calculator = new HomeArea();

        Rectangle firstRoom = calculator.getRoom();
        Rectangle secondRoom = calculator.getRoom();
        double total = calculateAreaOfRoom(firstRoom, secondRoom);

        System.out.println("Area of both rooms: " + total);

    }

    public Rectangle getRoom(){
        System.out.println("Length of room?");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the room");
        double width = scanner.nextDouble();

        return new Rectangle(length, width);
    }

    public static double calculateAreaOfRoom(Rectangle firstRoom, Rectangle secondRoom){
        return (firstRoom.calculateArea() + secondRoom.calculateArea());
    }
}
