/*
 * Project 2: Stats Tracker
 * Name:
 * Date:
 * Description: (one sentence about what your program tracks)
 *
 * CIS 1130 starter code. The menu already works. Your job:
 *   1. Replace the sample data in main with your own theme
 *      (at least 5 rows and 4 columns).
 *   2. Fill in every method marked TODO. Each one compiles now but
 *      doesn't do its job yet.
 *   3. Delete these instructions and the TODO comments when you finish.
 *
 * Use your DESIGN.md pseudocode as your guide. Test after each method.
 * In Week 6, you'll change this program to use a class you write.
 */
import java.util.Scanner;

public class StatsTracker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // TODO: Replace the sample data with your own theme and data.
        // names[i] is the label for row i of values.
        // columns[c] is the label for column c of values.
        // If your data has decimals, change int[][] to double[][] here
        // and in every method below.
        String title = "Pickup Basketball Points";
        String rowLabel = "Player";
        String[] names = {"Ava", "Ben", "Cara", "Dev", "Eli"};
        String[] columns = {"G1", "G2", "G3", "G4"};
        int[][] values = {
            {12, 18,  9, 15},   // Ava
            { 8, 11, 14, 10},   // Ben
            {20, 16, 22, 19},   // Cara
            { 5,  9,  7, 12},   // Dev
            {14, 13, 17, 11}    // Eli
        };

        int choice;
        do {
            printMenu(title);
            choice = readInt(input, "Choose an option (1-6): ");
            System.out.println();

            switch (choice) {
                case 1:
                    showTable(rowLabel, names, columns, values);
                    break;
                case 2:
                    search(input, names, columns, values);
                    break;
                case 3:
                    sortByAverage(names, values);
                    printRanking(names, values);
                    break;
                case 4:
                    columnReport(names, columns, values);
                    break;
                case 5:
                    updateValue(input, names, columns, values);
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Please choose a number from 1 to 6.");
            }
            System.out.println();
        } while (choice != 6);

        input.close();
    }

    // ---------------------------------------------------------------
    // Provided for you. You don't need to change these.
    // ---------------------------------------------------------------

    /** Prints the main menu. */
    public static void printMenu(String title) {
        System.out.println("--- " + title + " ---");
        System.out.println("1. Show table");
        System.out.println("2. Search by name");
        System.out.println("3. Sort by average (highest first)");
        System.out.println("4. Column report");
        System.out.println("5. Update a value");
        System.out.println("6. Quit");
    }

    /**
     * Prompts until the user types a whole number, then returns it.
     * It also clears the rest of the line, so input.nextLine()
     * works correctly afterward when you read a name.
     */
    public static int readInt(Scanner input, String prompt) {
        System.out.print(prompt);
        while (!input.hasNextInt()) {
            input.nextLine();   // throw away the bad input
            System.out.print("Please enter a whole number: ");
        }
        int number = input.nextInt();
        input.nextLine();       // clear the rest of the line
        return number;
    }

    /** Prints each row's name and average. Used after sorting. */
    public static void printRanking(String[] names, int[][] values) {
        System.out.println("Sorted by average, highest first:");
        for (int r = 0; r < names.length; r++) {
            System.out.printf("%-10s %6.2f%n", names[r], rowAverage(values, r));
        }
    }

    // ---------------------------------------------------------------
    // Your methods. Fill in each TODO.
    // ---------------------------------------------------------------

    /** Returns the total of every value in one row. */
    public static int rowTotal(int[][] values, int row) {
        // TODO: Loop across the columns of this row and add them up.
        return 0;
    }

    /** Returns the average of one row. */
    public static double rowAverage(int[][] values, int row) {
        // TODO: Use rowTotal, then divide by the number of columns.
        // Watch out for integer division!
        return 0.0;
    }

    /**
     * Option 1: Prints a neat, labeled table. Each row shows the name,
     * every value, the row's total, and the row's average.
     */
    public static void showTable(String rowLabel, String[] names,
                                 String[] columns, int[][] values) {
        // TODO: Print a header line: rowLabel, each column label,
        //       then "Total" and "Avg".
        // TODO: For each row, print the name, each value, the total,
        //       and the average (2 decimal places).
        // Tip: printf widths like %-8s (left) and %5d (right) line
        //      up your columns.
        System.out.println("Show table is not done yet.");
    }

    /**
     * Returns the index of the row whose name matches target,
     * ignoring capitalization, or -1 if there is no match.
     */
    public static int findRow(String[] names, String target) {
        // TODO: Linear search. Compare with equalsIgnoreCase.
        return -1;
    }

    /**
     * Option 2: Asks for a name. Shows that row's values, total, and
     * average, or a not-found message.
     */
    public static void search(Scanner input, String[] names,
                              String[] columns, int[][] values) {
        // TODO: Read a name with input.nextLine().
        // TODO: Call findRow. Check for -1 before using the result!
        System.out.println("Search is not done yet.");
    }

    /**
     * Option 3: Sorts the rows by average, highest first, with
     * selection sort. Names must stay lined up with their rows.
     */
    public static void sortByAverage(String[] names, int[][] values) {
        // TODO: Selection sort. Find the row with the HIGHEST average
        //       from position i to the end, then swap it into position i.
        // Tip: each row of a 2D array is a 1D array, so you can swap
        //      a whole row at once:
        //          int[] tempRow = values[i];
        //          values[i] = values[best];
        //          values[best] = tempRow;
        //      Then swap names[i] and names[best] the same way.
        System.out.println("Sort is not done yet.");
    }

    /**
     * Option 4: For each column, prints its average and its highest
     * value, along with the name that value belongs to.
     */
    public static void columnReport(String[] names, String[] columns,
                                    int[][] values) {
        // TODO: For each column c, loop DOWN the rows to find the total
        //       and the row with the highest value.
        System.out.println("Column report is not done yet.");
    }

    /**
     * Option 5: Asks for a name, a column number, and a new value, then
     * stores it. Rejects names that aren't found, column numbers out of
     * range, and values that don't make sense for your data.
     */
    public static void updateValue(Scanner input, String[] names,
                                   String[] columns, int[][] values) {
        // TODO: Read a name and use findRow to find its row.
        // TODO: Show the column labels with numbers starting at 1, then
        //       read a column number with readInt. Users count from 1;
        //       array indexes start at 0.
        // TODO: Read and validate the new value, store it, and confirm.
        System.out.println("Update is not done yet.");
    }
}
