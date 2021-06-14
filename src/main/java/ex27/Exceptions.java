package ex27;

// Each method checks for an error in user input returning 1 for errors and 0 for no errors
public class Exceptions {

    public int first_name_null (String name){

        if (name.isEmpty())
            return 1;

        return 0;
    }

    public int first_name_length(String name) {

        if (name.length() < 2)
            return 1;

        return 0;
    }

    public int last_name_null (String name){

        if (name.isEmpty())
            return 1;

        return 0;
    }

    public int last_name_length(String name) {

        if (name.length() < 2)
            return 1;

        return 0;
    }

    public int id_invalid (String id) {
        char ID[] = id.toCharArray();
        int i;

        if (id.length() != 7)
            return 1;

        for (i = 0; i < 2; i++) {
            if (!Character.isLetter(ID[i]))
                return 1;
        }
        if (ID[2] != '-')
            return 1;

        for (i = 3; i < 7; i++) {
            if (!Character.isDigit(ID[i]))
                return 1;
        }
        return 0;
    }

    public int zip(int zipcode) {
        if (zipcode > 99999 || zipcode < 10000)
            return 1;

        return 0;
    }
}
