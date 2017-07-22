/*
 * Decompiled with CFR 0_122.
 * 
 * Could not load the following classes:
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper
 *  br.gov.sp.fazenda.dsge.common.util.DateHelper$1
 */
package br.gov.sp.fazenda.dsge.common.util;

import br.gov.sp.fazenda.dsge.common.util.DateHelper;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Exception performing whole class analysis ignored.
 */
public class DateHelper {
    public static Pattern PATTERN_DATE_TIME_FORMAT = Pattern.compile("\\s*(0[1-9]|[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012]|[1-9])/(19|20)\\d{2} ([0-1][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]\\s*");
    public static Pattern PATTERN_DATE_FORMAT = Pattern.compile("\\s*(0[1-9]|[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012]|[1-9])/(19|20)\\d{2}\\s*");
    public static Pattern PATTERN_TIME_FORMAT = Pattern.compile("\\s*([0-1][0-9]|[2][0-3]):[0-5][0-9]:[0-5][0-9]\\s*");
    public static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
    public static SimpleDateFormat DATE_YEAR_FORMAT = new SimpleDateFormat("yyyy");
    public static SimpleDateFormat TIME_FORMAT = new SimpleDateFormat("HH:mm:ss");
    public static SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public static SimpleDateFormat DATE_HOUR_MINUTE_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    public static SimpleDateFormat SIMPLE_DATE_TIME_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    public static SimpleDateFormat DATE_TIME_MILLISECOND_FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss SSS");
    public static SimpleDateFormat DATE_TIME_FORMAT_BACKUP = new SimpleDateFormat("yyyyMMddHHmm");
    public static SimpleDateFormat DATE_TIME_FORMAT_EXPORT = new SimpleDateFormat("yyyyMMdd-HHmm");
    public static SimpleDateFormat DATE_FORMAT_BACKUP = new SimpleDateFormat("yyyyMMdd");
    public static SimpleDateFormat DATE_XML_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    public static SimpleDateFormat DATE_TIME_XML_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    public static SimpleDateFormat DATE_NOME_ARQUIVO_FORMAT = new SimpleDateFormat("ddMMyyyy-HHmmss");
    public static SimpleDateFormat DATE_MONTH_DECADE_FORMAT = new SimpleDateFormat("MM/yy");
    public static SimpleDateFormat DATE_TIME_XML_FORMAT310 = new /* Unavailable Anonymous Inner Class!! */;

    public DateHelper() {
    }

    public static Date getDate(String strDate) {
        return DateHelper.getDate((String)strDate, (int)0, (int)0, (int)0, (int)0);
    }

    public static Date getDate(String strDate, int hour, int minute, int second, int millisecond) {
        try {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(DATE_FORMAT.parse(strDate));
            gc.set(11, hour);
            gc.set(12, minute);
            gc.set(13, second);
            gc.set(14, millisecond);
            return gc.getTime();
        }
        catch (Exception e) {
            return null;
        }
    }

    public static boolean validaFormatoData(Pattern pattern, String strDate) {
        return pattern.matcher(strDate).matches();
    }

    public static Date getDateTime(String strDate, SimpleDateFormat simpleDateFormat) {
        try {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(simpleDateFormat.parse(strDate));
            return gc.getTime();
        }
        catch (Exception e) {
            return null;
        }
    }

    public static Date getDate(String strDate, SimpleDateFormat simpleDateFormat) {
        try {
            return simpleDateFormat.parse(strDate);
        }
        catch (Exception e) {
            return null;
        }
    }

    public static String formataDataHora(Date date, SimpleDateFormat simpleDateFormat) {
        if (date == null) {
            return null;
        }
        return simpleDateFormat.format(date);
    }

    public static String formataData(Date d) {
        if (d == null) {
            return null;
        }
        return DATE_FORMAT.format(d);
    }

    public static String formataHora(Date date) {
        if (date == null) {
            return null;
        }
        return TIME_FORMAT.format(date);
    }

    public static Date getDateFromCalendar(Calendar cal) {
        if (cal == null) {
            return null;
        }
        String myDateString = DateHelper.a((int)cal.get(5), (int)2) + "/" + DateHelper.a((int)(cal.get(2) + 1), (int)2) + "/" + DateHelper.a((int)cal.get(1), (int)4) + " " + DateHelper.a((int)cal.get(11), (int)2) + ":" + DateHelper.a((int)cal.get(12), (int)2) + ":" + DateHelper.a((int)cal.get(13), (int)2) + " " + DateHelper.a((int)cal.get(14), (int)3);
        return DateHelper.getDateTime((String)myDateString, (SimpleDateFormat)DATE_TIME_MILLISECOND_FORMAT);
    }

    private static String a(int value, int quantCasas) {
        String valueStr = "" + value;
        for (int numZeros = quantCasas - valueStr.length(); numZeros > 0; --numZeros) {
            valueStr = "0" + valueStr;
        }
        return valueStr;
    }

    public static Calendar formataCalendar(Date date) {
        GregorianCalendar dateCalendar = new GregorianCalendar();
        dateCalendar.setTime(date);
        GregorianCalendar formattedCalendar = new GregorianCalendar(dateCalendar.get(1), dateCalendar.get(2), dateCalendar.get(5));
        return formattedCalendar;
    }

    public static long getDaysBetweenDates(Date dAfter, Date dBefore) {
        return (dAfter.getTime() - dBefore.getTime()) / 86400000;
    }

    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();
        String parseStr = "02/04/2007 05:05:05 006";
        gc.setTime(DateHelper.getDateTime((String)parseStr, (SimpleDateFormat)DATE_TIME_MILLISECOND_FORMAT));
        System.out.println(parseStr + "=" + DateHelper.formataDataHora((Date)DateHelper.getDateFromCalendar((Calendar)gc), (SimpleDateFormat)DATE_TIME_MILLISECOND_FORMAT));
        System.out.println("DATE TIME FORMAT");
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_TIME_FORMAT, (String)"02/04/2007 05:05:05 006"));
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_TIME_FORMAT, (String)"02/04/2007 05:05:05 "));
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_TIME_FORMAT, (String)"02/04/2007 05:05:05"));
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_TIME_FORMAT, (String)"02/04/2007 05:05:"));
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_TIME_FORMAT, (String)"02/04/2007 05:"));
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_TIME_FORMAT, (String)"02/04/2007 "));
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_TIME_FORMAT, (String)"02/04/2007"));
        System.out.println("DATE FORMAT");
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_FORMAT, (String)"02/04/2007 05:05:05 006"));
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_FORMAT, (String)"02/04/2007 05:05:05 "));
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_FORMAT, (String)"02/04/2007 05:05:05"));
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_FORMAT, (String)"02/04/2007 05:05:"));
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_FORMAT, (String)"02/04/2007 05:"));
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_FORMAT, (String)"02/04/2007 "));
        System.out.println(DateHelper.validaFormatoData((Pattern)PATTERN_DATE_FORMAT, (String)"02/04/2007"));
    }

    public static int getHoursBetweenDates(Date dtInicio, Date dtFim) {
        if (dtInicio == null || dtFim == null) {
            return 0;
        }
        Calendar cInicio = Calendar.getInstance();
        Calendar cFim = Calendar.getInstance();
        cInicio.setTime(dtInicio);
        cFim.setTime(dtFim);
        long ini = cInicio.getTimeInMillis();
        long fim = cFim.getTimeInMillis();
        long nroHoras = (fim - ini) / 1000 / 3600;
        return (int)nroHoras;
    }

    static {
        DATE_FORMAT.setLenient(false);
        DATE_TIME_FORMAT.setLenient(false);
        TIME_FORMAT.setLenient(false);
        DATE_TIME_FORMAT_BACKUP.setLenient(false);
        SIMPLE_DATE_TIME_FORMAT.setLenient(false);
        DATE_FORMAT_BACKUP.setLenient(false);
        DATE_HOUR_MINUTE_FORMAT.setLenient(false);
        DATE_TIME_MILLISECOND_FORMAT.setLenient(false);
        DATE_TIME_FORMAT_EXPORT.setLenient(false);
        DATE_TIME_FORMAT_EXPORT.setLenient(false);
        DATE_XML_FORMAT.setLenient(false);
        DATE_TIME_XML_FORMAT.setLenient(false);
        DATE_NOME_ARQUIVO_FORMAT.setLenient(false);
    }
}

