package enums;

public enum Day {
    
    MONDAY("WeekDay"),
    TUESDAY("WeekDay"),
    WEDNESDAY("WeekDay"),
    THURSDAY("WeekDay"),
    FRIDAY("WeekDay"),
    SATURDAY("WeekEnd"),
    SUNDAY("WeekEnd");

    private String info;

  private Day(String info ){
    this.info = info;
  }

  public String getInfo(){
    return this.info;
  }
}
