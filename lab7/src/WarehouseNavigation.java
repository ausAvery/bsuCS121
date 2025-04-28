public class WarehouseNavigation {
    // constants variables
    static final String WALL = "📜 ";
    static final String PATH = "⬛️ ";
    static final String ROBOT = "🤖 ";
    static final String OBSTACLE = "📦 ";
    static final String TARGET = "🎯 ";
    static final int SIZE = 5;

    // SIZE x SIZE 2D array
    static String[][] warehouseLayout = new String[SIZE][SIZE];

    // setting robot position
    static int robotRow = -1;
    static int robotCol = -1;

    public static void main(String[] args) {
        System.out.println("\nOriginal warehouse:");
        initializeGrid(WarehouseNavigation.warehouseLayout);
        printGrid(warehouseLayout);
        placeObjects(warehouseLayout);
        System.out.println("\nWarehouse with objects:");
        printGrid(warehouseLayout);
    }

    static void initializeGrid(String[][] warehouseLayout) {
        for (int row = 0; row < warehouseLayout.length; row++) {
            for (int col = 0; col < warehouseLayout[row].length; col++) {
                if (row == 1 && col >= 1 && col <= 3) {
                    warehouseLayout[row][col] = PATH;
                }
                else if (row == 2 && col >= 1 && col <= 3) {
                    warehouseLayout[row][col] = PATH;
                }
                else if (row == 3 && col >= 1 && col <= 3) {
                    warehouseLayout[row][col] = PATH;
                }
                else {
                    warehouseLayout[row][col] = WALL;
                }
            }
        }
    }


    static void printGrid(String[][] warehouseLayout) {
        for (String[] row : warehouseLayout) {
            for (String col : row) {
                System.out.printf("%s", col);
            }
            System.out.println();
        }
    }

    static void placeObjects(String[][] warehouseLayout) {
        for (int row = 0; row < warehouseLayout.length; row++) {
            for (int col = 0; col < warehouseLayout[row].length; col++) {
                if (row == 1 && col == 1) {
                    warehouseLayout[row][col] = TARGET;
                }
                else if (row == 2 && col == 2 || row == 1 && col == 3) {
                    warehouseLayout[row][col] = OBSTACLE;
                }
                else if (row == 3 && col == 1) {
                    warehouseLayout[row][col] = ROBOT;
                }
            }
        }
    }
}
