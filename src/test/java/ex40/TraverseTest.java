package ex40;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TraverseTest {

    @Test
    // Checks that Traverse method returns proper list
    void TraverseTestReturnsCorrectList() {

        EmployeeInfo access = new EmployeeInfo();
        List<String> info = new ArrayList<>();
        List<String> list = new ArrayList<>();
        List<String> record = new ArrayList<>();

        info.add ("John");
        info.add ("Johnson");
        info.add ("Manager");
        info.add ("2016-12-31");
        info.add ("Michaela");
        info.add ("Michaelson");
        info.add ("District Manager");
        info.add ("2015-12-19");

        for (int j = 0; j < 6; j++) {

            list.add(access.lname[j]);
            list.add(access.fname[j]);
            list.add(access.title[j]);
            list.add(access.date[j]);
        }


        Traverse call = new Traverse();

         record = call.traverse("Manager", list);

        assertEquals(info, record);

    }
}