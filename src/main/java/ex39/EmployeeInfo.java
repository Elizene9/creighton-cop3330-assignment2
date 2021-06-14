package ex39;

import java.util.*;

// Sorts employee info
public class EmployeeInfo {

    public String[] lname = {"Johnson", "Xiong", "Michaelson ", "Jacobson", "Jackson", "Webber"};
    public String[] fname = {"John", "Tou", "Michaela", "Jake", "Jacquelyn", "Sally"};
    public String[] title = {"Manager", "Software Engineer", "District Manager",
            "Programmer", "DBA", "Web Developer"};
    public String[] date = {"2016-12-31", "2016-10-05", "2015-12-19", "",
            "", "2015-12-18"};

    public void sortList(List<Map> lastNames) {

        takeInfo access = new takeInfo();

        String[] Title = new String[6];
        String[] Date = new String[6];
        int[] sorted = new int[6];

        String[] lastName = new String[]{"Johnson", "Xiong", "Michaelson ", "Jacobson", "Jackson", "Webber"};
        String[] firstName = new String[]{"John", "Tou", "Michaela", "Jake", "Jacquelyn", "Sally"};
        Arrays.sort(lname);
        for (int j = 0; j < 6; j++) {
            for (int k = 0; k < 6; k++) {

                if (lastName[j] == lname[k]) {
                    sorted[j] = k;
                    break;
                }
            }
        }
        for (int m = 0; m < 6; m++) {
            firstName[sorted[m]] = fname[m];
            Date[sorted[m]] = date[m];
            Title[sorted[m]] = title[m];
        }

        int check = correct(lastName, lname);
        access.PrintData(lname, firstName, Date, Title);
    }

    int correct (String[] LastNameOld, String[] LastNameNew) {

        Arrays.sort(LastNameOld);
        Arrays.sort(LastNameNew);
        for (int i = 0; i < LastNameNew.length; i++) {

            if (!LastNameOld[i].equals(LastNameNew[i]))
                return 0;
        }

        return 1;


    }

}



