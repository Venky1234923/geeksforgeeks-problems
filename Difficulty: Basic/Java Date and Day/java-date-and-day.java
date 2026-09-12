class Solution {
    static String findDay(int Day, int Month, int Year) {
        Calendar c = Calendar.getInstance();

        c.set(Year, Month - 1, Day);

        String day = c.getDisplayName(
            Calendar.DAY_OF_WEEK,
            Calendar.LONG,
            Locale.ENGLISH
        );

        return day.toUpperCase();
    }
}