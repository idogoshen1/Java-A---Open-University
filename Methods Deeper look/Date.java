
public class Date
{ 
    private int _day;
    private int _month;
    private int _year;
    private final int MIN_DAY=1;
    private final int MAX_DAY=31;
    private final int Min_MONTH=1;
    private final int MAX_MONTH=12;
    private final int MIN_YEAR=2000;
    //constracor
    public Date(int day, int month, int year) {
        
        if(year >= 1000 && year <10000) {
            if(month >= 1 && month <= 12) {
                if((day > 0 && day <= 31) && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
                    this._day = day;
                    this._year = year;
                    this._month = month;
                }
                if((day > 0 && day <= 30) && (month == 4 || month == 6 || month == 9 || month == 11)) {
                    this._day = day;
                    this._year = year;
                    this._month = month;
                }
                if(month == 2 && day > 0 && day <=29) {
                    this._day = day;
                    this._year = year;
                    this._month = month;
                }
            }
        }
        
        
    }

    public Date(Date other) {
        this._day= other.getDay();
        this._month= other.getMonth();
        this._year = other.getyear();

    }
    //methods
    public int getDay() {
        return this._day;
    }

    public int getMonth() {
        return this._month;
    }

    public int getYear() {
        return this._year;
    }

    public void setDay(int dayToSet) {
        if(dayToSet>=1 && dayToSet<=31) {
            this._day= day;
        }
    }

    public void setMonth(int monthToSet) {
        if(monthToSet>=1 && monthToSet<=12) {
            this._month=month;
        }
    }

    public void setYear(int yearToSet) {
        if(yearToSet>=1000 && yearToSet<=9999) {
            this._year=year;
        }
    }

    public boolean equals(Date other) {
        if(this._day == other.getDay() && this._month == other.getMonth() && this._year == other.getYear()){
            return true; 
        }
        return false;
    }

    public bolean before(Date other) {
        if(this._year< other.getYear()) {
            return true;
        }
        if(this._month<other.getMonth() && this.year== other.getYear()) {
            return true;
        }
        if(this.day<other.getDay() && this.month== othe.getMonth() && this.day== other.getDay()) {
            return true;
        }
        return false;
    }

    public boolean after(Date other) {
        if(before(other) == true) {
            return false;
        }
        return true;
    }

    public boolean diffrence (Date other) {
        int year = this.year- other.getYear();
        int month = this.month- other.getMonth();
        int day = this.day-other.getDay();
        year= year*365;
        month=month*30;
        if(year<0) {
            year=year*(-1);
        }
        if(month<0) {
            month=month*(-1);
        }
        if(day<0) {
            day=day*(-1);
        }
        return (day+month+year);

   
       }
       
       public String toString() {
          return( this._day + " / " + this._month + " / " + this._year );
          
        }
}


