package com.example.web_gptregenerate.convertor;

public class DateConvertor {
    /* Here is the explanation for the code above:
1. We check if the source is not null, if yes, we will proceed to the next step.
2. We create a new instance of SimpleDateFormat with the format yyyy-MM-dd hh:mm:ss.
3. We parse the source with the SimpleDateFormat.
4. If the parsing is successful, we will return the date, if not we will return null. */
    public static java.util.Date convertToDate(String source) {
        if (source == null) {
            return null;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            return simpleDateFormat.parse(source);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
