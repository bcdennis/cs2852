/**
 * CS2852
 * Spring 2016
 * Week 1
 */
package lecture02;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Modified driver class from benchmarking lab.<br />
 * <br />
 *
 * @author hornick
 * @author taylor (minor updates)
 * @author bdennis (minor updates)
 *
 * @version 2016.03.6
 */
public class Driver {

    private static final double MILLIS = 1000.0;
    private static final int NMAX = 10000;
    private static final int NINC = 500;

    private PrintWriter printStream;

    /**
     * Runs the benchmarking tests.
     * @param args Ignored
     */
    public static void main(String[] args)   {

        try {
            new Driver().start();
        } catch (FileNotFoundException e) {
            System.err.println("The file cannot be opened.\n"
                    + e.getMessage());
        }
        System.out.println("All done!");
    }

    /**
     * Non-static entry point.
     * Opens an output file, creates a Benchmarker object,
     * sets up a loop to run a benchmark test repeatedly,
     * prints timing results to a file,
     * and finally closes the file.
     */
    private void start() throws FileNotFoundException {

        String strFile = "SimpleArrayList_10K.csv";
        try {
            printStream = new PrintWriter(strFile);
            printStream.println("SampleSize, AddToBack, AddToFront, Contains, RandomAccess, AccessMid");
            Benchmarker benchmarker = new Benchmarker();

            List<Integer> list = new SimpleArrayList<>();

            // We want to take measurements for different numbers of items
            // (N) in the collection, so that we can see how the performance
            // varies with N. We'll vary N from some very small value (1) to
            // some large value (NMAX), incrementing N by some amount (NINC)
            // as we go.



            // Run the tests for increasing values of N (from 1 to NMAX)
            for(int n=1; n<NMAX; n+=NINC) {
                // Each time through this loop, the List is 
                // reinitialized and rebuilt, but bigger each time.
                list.clear();

                // Get the time it takes to add N elements to the List
                long nsAddToBack = benchmarker.benchAddToBack(list, n);

                // clear again to prepare for rebuilding from the front
                list.clear();

                // Get the time it takes to add N elements to the List
                long nsAddToFront = benchmarker.benchAddToFront(list, n);

                // Get the time it takes to determine that a value is not
                // in the list.
                // Note: -1 is never found since all values are positive
                long nsContains = benchmarker.benchContains(list, -1);

                // Get the time it takes to access a random element in list
                long nsAccessRandom = benchmarker.benchAccess(list);

                // Get the time it takes to access approximate middle element
                long nsAccessMiddle = benchmarker.benchAccessIndex(list, n/2);

                // print the values to a data file; time are in microseconds
                printStream.println(n + ", " + nsAddToBack/ MILLIS + ", "
                        + nsAddToFront/MILLIS + ", "
                        + nsContains/MILLIS + ", "
                        + nsAccessRandom/MILLIS + ", "
                        + nsAccessMiddle/MILLIS);
                System.out.println("Finished test for N=" + n);
            }
        } finally {
            // Be sure to flush all pending output and close the file
            if(printStream!=null) {
                printStream.flush();
                printStream.close();
            }
        }
    }
}