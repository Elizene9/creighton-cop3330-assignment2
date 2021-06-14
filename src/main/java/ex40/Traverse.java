package ex40;

import java.util.*;

public class Traverse {

    public List<String> traverse(String user, List<String> list) {

        EmployeeInfo access = new EmployeeInfo();
        List<String> newList = new ArrayList<String>();

        System.out.println(list.size());
        for (int i = 0; i < 24; i++) {

            System.out.println(list.get(i));
                if (list.get(i).contains(user) || list.get(i).equals(user)) {

                    for (int j = 0; j < 6; j++) {

                        if (list.get(i).equals(access.lname[j])) {
                            newList.add(access.fname[j]);
                            newList.add(list.get(i));
                            newList.add(access.title[j]);
                            newList.add(access.date[j]);
                        }

                        else if (list.get(i).equals(access.fname[j])) {

                            newList.add(list.get(i));
                            newList.add(access.lname[j]);
                            newList.add(access.title[j]);
                            newList.add(access.date[j]);

                        }

                        else if (list.get(i).equals(access.title[j])) {

                            newList.add(access.fname[j]);
                            newList.add(access.lname[j]);
                            newList.add(list.get(i));
                            newList.add(access.date[j]);
                        }

                        else if (list.get(i).equals(access.date[j])) {
                            newList.add(access.fname[j]);
                            newList.add(access.lname[j]);
                            newList.add(access.title[j]);
                            newList.add(list.get(i));

                        }

                    }
            }
        }
        System.out.println("Name                | Position          | Separation Date\n" +
                "--------------------|-------------------|----------------");
        int k;

        System.out.println(newList);
        return newList;
    }
}
