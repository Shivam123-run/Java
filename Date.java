public class Date {
    private int day;
    private int month;
    private int year;
    public Date() {
        day = 1;
        month = 1;
        year = 2000;
    }
    public void setDate(int day, int month, int year) {

        if (month >= 1 && month <= 12)
            this.month = month;
        else
            this.month = 1;

        if (day >= 1 && day <= getDaysInMonth(this.month, year))
            this.day = day;
        else
            this.day = 1;

        this.year = year;
    }
    public boolean isLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        return false;
    }
    public int getDaysInMonth(int month, int year) {
        if (month == 2) {
            if (isLeapYear(year))
                return 29;
            else
                return 28;
        }
        if (month == 4 || month == 6 ||
            month == 9 || month == 11) {
            return 30;
        }
        return 31;
    }
    public void addDays(int days) {
        for (int i = 1; i <= days; i++) {
            day++;
            if (day > getDaysInMonth(month, year)) {
                day = 1;
                month++;
                if (month > 12) {
                    month = 1;
                    year++;
              }
          }
     }
  }
    public void addMonths(int months) {
        month = month + months;
        while (month > 12) {
            month = month - 12;
            year++;
        }
        int maxDays = getDaysInMonth(month, year);
        if (day > maxDays)
            day = maxDays;
    }
    public void addYears(int years) {
        year = year + years;
        if (month == 2 && day == 29) {
            if (!isLeapYear(year))
                day = 28;
        }
    }
    public void display() {
        System.out.println(
            "Date : " + day + "-" + month + "-" + year
        );
    }
}