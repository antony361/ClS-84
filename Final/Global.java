public class Global {

    public static int checkTotal(Attendee[] arr) { // checks to see which index of the array are actually being used
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                total++;
        }
        return total;
    }

    static Attendee[] Atd = new Attendee[50];
// really messy way for me to properly transfer the total and the object array
}
