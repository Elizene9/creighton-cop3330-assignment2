package ex39;

public class takeInfo {

    // Prints Ordered data
    public void PrintData (String[] lname, String[] fname, String[] date, String[] title) {

        System.out.printf("Name%16s/ Position%10s/ Separation Date\n", " ", "");
        for (int j = 0; j < 20; j++) {

            System.out.print("-");
            if (j == 19)
                System.out.print("/");
        }
        for (int j = 0; j < 19; j++) {

            System.out.print("-");
            if (j == 18)
                System.out.print("/");
        }
        for (int j = 0; j < 19; j++) {

            System.out.print("-");
        }
        for (int i = 0; i < lname.length; i++) {
            System.out.printf("\n%20s/ %18s/ %16s", fname[i] + " " + lname[i], title[i], date[i]);
        }

    }
}

