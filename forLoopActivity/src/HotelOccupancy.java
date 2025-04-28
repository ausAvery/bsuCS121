import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numFloors;
        int numRoomsPerFloor;
        int numRoomsOccupied;
        int numTotalRooms = 0;
        int numTotalOccupied = 0;
        double occupancyRate;

        System.out.print("How many floors are in the hotel? ");
        numFloors = Integer.parseInt(console.nextLine());

        for (int i = 1; i <= numFloors; i++){
            System.out.printf("How many rooms are on floor %d? ", i);
            numRoomsPerFloor = Integer.parseInt(console.nextLine());
            numTotalRooms += numRoomsPerFloor;

            System.out.printf("How many rooms on floor %d are occupied? ", i);
            numRoomsOccupied = Integer.parseInt(console.nextLine());
            numTotalOccupied += numRoomsOccupied;

            numRoomsPerFloor = 0;
            numRoomsOccupied = 0;
        }

        occupancyRate = ((double)numTotalOccupied / numTotalRooms);
        int occupancyPercent = (int) (occupancyRate * 100);

        System.out.printf("Floors: %d\n", numFloors);
        System.out.printf("Rooms: %d\n", numTotalRooms);
        System.out.printf("Occupied Rooms: %d\n", numTotalOccupied);
        System.out.printf("Vacant Rooms: %d\n", numTotalRooms - numTotalOccupied);
        System.out.printf("Occupancy: %.2f %s%d%s", occupancyRate, "(", occupancyPercent, "%)");

        console.close();
    }
}
