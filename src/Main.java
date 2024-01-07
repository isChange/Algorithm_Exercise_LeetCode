import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println(createId(1));
        System.out.println(createLotId(1,LocalDateTime.now()));
    }

    public static String createId(Integer num){
        num++;
        StringBuffer sb = new StringBuffer("TAIJI");
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonth().getValue();
        String str = (month + "").length() == 1 ? "0"+month : month +"";
        int dayOfMonth = now.getDayOfMonth();
        sb.append(year).append(str).append(dayOfMonth);
        for (int i = 0; i < 5 - num.toString().length(); i++) {
            sb.append(0);
        }
        sb.append(num);
        return sb.toString();
    }
    public static String createLotId(Integer num , LocalDateTime now){
        StringBuffer sb = new StringBuffer("TJ");
        int year = now.getYear();
        int month = now.getMonth().getValue();
        String strMonth = (month+"").length() == 2 ? month+"" : "0" + month;
        int dayOfMonth = now.getDayOfMonth();
        String strDay = (dayOfMonth+"").length() == 2 ? dayOfMonth+"" : "0" + dayOfMonth;
        int hour = now.getHour();
        String strHour = (hour+"").length() == 2 ? hour+"" : "0" + hour;
        int minute = now.getMinute();
        String strMinute = (minute+"").length() == 2 ? minute+"" : "0" + minute;
        sb.append(year).append(strMonth).append(strDay).append(strHour).append(strMinute);
        for (int i = 0; i < 5 - num.toString().length(); i++) {
            sb.append("0");
        }
        sb.append(num);
        return sb.toString();
    }
}