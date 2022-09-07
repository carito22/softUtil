package ec.com.todocompu.ShrimpSoftUtils;

import ec.com.todocompu.ShrimpSoftUtils.delegate.SistemaDelegate;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Period;
import org.joda.time.PeriodType;

public class UtilsValidacion {

    private static Locale locale = new Locale("es", "EC");

    public static String comprobarPrecioVsCosto(String nombreProducto, String nombrePrecio, BigDecimal precio,
            BigDecimal ultimoCosto, BigDecimal costoPromedio) {
        String mensaje = "";
        if (precio != null && precio.compareTo(new BigDecimal("0.00")) > 0) {
            if (ultimoCosto != null && precio.compareTo(ultimoCosto) < 0) {
                mensaje = "Producto: " + nombreProducto + ", " + nombrePrecio
                        + " es menor al ultimo precio costo.<br/>";
            }
            if (costoPromedio != null && precio.compareTo(costoPromedio) < 0) {
                mensaje += "Producto: " + nombreProducto + ", " + nombrePrecio
                        + " es menor al precio costo promedio.<br/>";
            }
        }
        return mensaje;
    }

    public static String generarSecuenciaAleatoria() {
        String sec = "";
        do {
            if (generarNumeroAleatorios(0, 1) == 0) {
                sec += generarNumeroAleatorios(0, 9);
            } else {
                sec += (char) generarNumeroAleatorios(65, 90);
            }
        } while (sec.length() < 30);
        return sec;
    }

    public static int generarNumeroAleatorios(int minimo, int maximo) {
        return (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
    }

    public static <T> boolean comprobarLista(List<T> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        return true;
    }

    public static Date fechaString_Date(String fecha) {
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = (Date) formato.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(UtilsValidacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            date = null;
        }
        return date;
    }

    public static Date fechaString_Date(String fecha, String formato) {
        DateFormat format = new SimpleDateFormat(formato);
        Date date = null;
        try {
            date = (Date) format.parse(fecha);
        } catch (ParseException ex) {
            Logger.getLogger(UtilsValidacion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            date = null;
        }
        return date;
    }

    public static Date String_Date(String fecha) {
        if (fecha.trim().length() == 10) {
            if (ValidarDatosFecha(fecha)) {
                DateFormat formato = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
                Date date = null;
                try {
                    date = (Date) formato.parse(fecha);
                } catch (ParseException ex) {
                    Logger.getLogger(UtilsValidacion.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception e) {
                    date = null;
                }
                return date;
            } else {
                return null;
            }
        } else {
            return null;
        }

    }

    private static boolean ValidarDatosFecha(String fecha) {
        boolean flag = true;

        try {
            int dia = 0, mes = 0, anio = 0;
            StringTokenizer st = new StringTokenizer(fecha, "-");
            if (st.hasMoreTokens()) {
                dia = Integer.parseInt(st.nextToken());
            }
            if (st.hasMoreTokens()) {
                mes = Integer.parseInt(st.nextToken());
            }
            if (st.hasMoreTokens()) {
                anio = Integer.parseInt(st.nextToken());
            }

            if (mes > 12) {
                return false;
            } else if (dia > 31) {
                return false;
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 30)) {
                return false;
            } else if (mes == 2 && bisiesto(anio) && dia > 29) {
                return false;
            } else if (mes == 2 && !bisiesto(anio) && dia > 28) {
                return false;
            } else {
                flag = true;
            }
        } catch (Exception e) {
            return false;
        }
        return flag;
    }

    private static boolean bisiesto(int anio) {
        if (anio % 400 == 0) {
            return true;
        } else if (anio % 4 == 0 && anio % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String fechaSistema() {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        return formato.format(fecha);
    }

    public static String fechaDate_String(Date fecha) {
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formato.format(fecha);
    }

    public static int obtenerDiasAAMMDD(String fechaMayor, String fechaMenor) {
        fechaMayor = fechaMayor == null || fechaMayor.compareToIgnoreCase("") == 0
                ? fecha(getUltimoDiaDelMes(fechaMenor, "yyyy-MM-dd"), "yyyy-MM-dd") : fechaMayor;
        fechaMenor = fechaMenor == null || fechaMenor.compareToIgnoreCase("") == 0
                ? fecha(getPrimerDiaDelMes(fechaMayor, "yyyy-MM-dd"), "yyyy-MM-dd") : fechaMenor;
        String ano = "", mes = "", dia = "";
        try {
            ano = fechaMayor.trim().substring(0, 4);
            mes = fechaMayor.trim().substring(5, 7);
            dia = fechaMayor.trim().substring(8);
            DateMidnight dateMayor = new DateMidnight(Integer.parseInt(ano), Integer.parseInt(mes),
                    Integer.parseInt(dia));

            ano = fechaMenor.trim().substring(0, 4);
            mes = fechaMenor.trim().substring(5, 7);
            dia = fechaMenor.trim().substring(8);
            DateMidnight dateMenor = new DateMidnight(Integer.parseInt(ano), Integer.parseInt(mes),
                    Integer.parseInt(dia));

            Period period = new Period(dateMenor, dateMayor, PeriodType.days());

            return period.getDays();
        } catch (Exception e) {
            return 0;
        }
    }

    public static int obtenerDiasAAMMDD(Date fechaMayor, String fechaMenor) {
        return obtenerDiasAAMMDD(UtilsDate.fechaFormatoString(fechaMayor, "yyyy-MM-dd"), fechaMenor);
    }

    public static int obtenerDiasAAMMDD(String fechaMayor, Date fechaMenor) {
        return obtenerDiasAAMMDD(fechaMayor, UtilsDate.fechaFormatoString(fechaMenor, "yyyy-MM-dd"));
    }

    public static int obtenerDiasAAMMDD(Date fechaMayor, Date fechaMenor) {
        return obtenerDiasAAMMDD(UtilsDate.fechaFormatoString(fechaMayor, "yyyy-MM-dd"),
                UtilsDate.fechaFormatoString(fechaMenor, "yyyy-MM-dd"));
    }

    public static int numeroDias(String formato, String fechaInicio, String fechaFin) {
        int retorno = 0;
        Days d = Days.daysBetween(new DateTime(UtilsValidacion.fecha(fechaInicio, formato)),
                new DateTime(UtilsValidacion.fecha(fechaFin, formato)));
        retorno = d.getDays();
        return retorno;
    }
    
    public static int numeroDias(Date fechaInicio, Date fechaFin) {
        int retorno = 0;
        Days d = Days.daysBetween(new DateTime(fechaInicio), new DateTime(fechaFin));
        retorno = d.getDays();
        return retorno;
    }

    public static String fechaSumarRestarDias(Date fecha, int numeroDias, int constante) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(fecha);
        if (numeroDias == 1) {
            c1.add(Calendar.DATE, numeroDias);
            c1.add(Calendar.DATE, -constante);
        } else {
            c1.add(Calendar.DATE, -numeroDias);
            c1.add(Calendar.DATE, constante);
        }

        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        return formato.format(c1.getTime());
    }

    public static String fechaSumarDias(Date fecha, int numeroDias) {
        Calendar c1 = Calendar.getInstance();
        c1.setTime(fecha);
        c1.add(Calendar.DATE, numeroDias);
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        return formato.format(c1.getTime());
    }

    public static String fechaSistema(String mascara) {
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat(mascara, locale);
        return formato.format(fecha);
    }

    public static String fechaServidor(String mascara) {
        return SistemaDelegate.getInstance().getFechaServidor(mascara);
    }

    public static Date fecha(String fecha, String mascara) {
        try {
            return (Date) new SimpleDateFormat(mascara).parse(fecha);
        } catch (Exception e) {
            return null;
        }
    }

    public static String fecha(Date fecha, String mascara) {
        try {
            DateFormat formato = new SimpleDateFormat(mascara);
            return formato.format(fecha);
        } catch (Exception ex) {
            return null;
        }
    }

    public static String fecha(String fecha, String mascara1, String mascara2) {
        String fechaDevolver = "";
        SimpleDateFormat formatoFecha1 = new SimpleDateFormat(mascara1);
        SimpleDateFormat formatoFecha2 = new SimpleDateFormat(mascara2);
        try {
            formatoFecha1.parse(fecha);
            fechaDevolver = formatoFecha2.format(formatoFecha1.getCalendar().getTime());
        } catch (ParseException ex) {
        }
        return fechaDevolver;
    }

    public static Boolean isFechaSuperior(String fechaFormulario, String mascara) {
        Boolean boleano = null;
        SimpleDateFormat formatoFecha = new SimpleDateFormat(mascara);
        try {
            if (formatoFecha.parse(fechaFormulario).getTime() > formatoFecha.parse(fechaSistema(mascara)).getTime()) {
                boleano = true;
            } else {
                boleano = false;
            }
        } catch (ParseException ex) {
            boleano = null;
        }
        return boleano;
    }

    public static Boolean isFechaSuperior(String fecha1, String fecha2, String mascara) {
        Boolean boleano = null;
        SimpleDateFormat formatoFecha = new SimpleDateFormat(mascara);
        try {
            if (formatoFecha.parse(fecha1).getTime() > formatoFecha.parse(fecha2).getTime()) {
                boleano = true;
            } else {
                boleano = false;
            }
        } catch (ParseException ex) {
            boleano = null;
        }
        return boleano;
    }

    public static boolean isFechaSuperior(Date fecha1, Date fecha2) {
        return (fecha1.getTime() > fecha2.getTime());
    }

    public static boolean isFechaSuperior(Date fecha) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String StringFechaActual = UtilsDate.fechaFormatoString(new Date(), "yyyy-MM-dd");
        Date fechaActual = sdf.parse(StringFechaActual);
        String StringFechaRecibida = UtilsDate.fechaFormatoString(fecha, "yyyy-MM-dd");
        Date fechaRecibida = sdf.parse(StringFechaRecibida);
        return fechaRecibida.after(fechaActual);
    }

    public static Boolean isFechaCompensacionSolidaria(String fechaFormulario, String mascara) {
        Boolean boleano = null;
        SimpleDateFormat formatoFecha = new SimpleDateFormat(mascara);
        try {
            if (formatoFecha.parse(fechaFormulario).getTime() > formatoFecha.parse("2016-05-31").getTime()
                    && formatoFecha.parse(fechaFormulario).getTime() < formatoFecha.parse("2017-06-01").getTime()) {
                boleano = true;
            } else {
                boleano = false;
            }
        } catch (ParseException ex) {
            boleano = null;
        }
        return boleano;
    }

    @Deprecated
    public static int getNumeroDia(String fecha, String mascara) {
        SimpleDateFormat formatoFecha1 = new SimpleDateFormat(mascara, locale);
        try {
            formatoFecha1.parse(fecha);
        } catch (ParseException ex) {
        }
        Calendar calendarioAux = Calendar.getInstance();
        calendarioAux.setTime(formatoFecha1.getCalendar().getTime());
        return calendarioAux.get(Calendar.DAY_OF_WEEK);
    }

    @Deprecated
    public static int getNumeroMes(String fecha) {
        SimpleDateFormat formatoFecha1 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            formatoFecha1.parse(fecha);
        } catch (ParseException ex) {
        }
        Calendar calendarioAux = Calendar.getInstance();
        calendarioAux.setTime(formatoFecha1.getCalendar().getTime());
        calendarioAux.set(calendarioAux.get(Calendar.YEAR), calendarioAux.get(Calendar.MONTH),
                calendarioAux.getActualMinimum(Calendar.DAY_OF_MONTH));
        return calendarioAux.get(Calendar.MONTH);
    }

    public static Date getPrimerDiaDelMes(String fecha, String mascara) {
        SimpleDateFormat formatoFecha1 = new SimpleDateFormat(mascara);
        try {
            formatoFecha1.parse(fecha);
        } catch (ParseException ex) {
        }
        Calendar calendarioAux = Calendar.getInstance();
        calendarioAux.setTime(formatoFecha1.getCalendar().getTime());
        calendarioAux.set(calendarioAux.get(Calendar.YEAR), calendarioAux.get(Calendar.MONTH),
                calendarioAux.getActualMinimum(Calendar.DAY_OF_MONTH));
        return calendarioAux.getTime();
    }

    public static Date getUltimoDiaDelMes(String fecha, String mascara) {
        SimpleDateFormat formatoFecha1 = new SimpleDateFormat(mascara);
        try {
            formatoFecha1.parse(fecha);
        } catch (ParseException ex) {
        }

        Calendar calendarioAux = Calendar.getInstance();
        calendarioAux.setTime(formatoFecha1.getCalendar().getTime());
        calendarioAux.set(calendarioAux.get(Calendar.YEAR), calendarioAux.get(Calendar.MONTH),
                calendarioAux.getActualMaximum(Calendar.DAY_OF_MONTH));
        return calendarioAux.getTime();
    }

    public static String convertirDdMmAaaaTOaaaaMmDd(String fecha) {
        String fechaDevolver = "";
        SimpleDateFormat formatoFecha1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat formatoFecha2 = new SimpleDateFormat("yyyy-MM-dd");
        try {
            formatoFecha1.parse(fecha);
            fechaDevolver = formatoFecha2.format(formatoFecha1.getCalendar().getTime());
        } catch (ParseException ex) {
        }
        return fechaDevolver;
    }

    public static String convertirAaaaMmDdTODdMmAaaa(String fecha) {
        SimpleDateFormat formatoFecha1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatoFecha2 = new SimpleDateFormat("dd-MM-yyyy");
        try {
            formatoFecha1.parse(fecha);
            return formatoFecha2.format(formatoFecha1.getCalendar().getTime());
        } catch (ParseException ex) {
        }
        return "";
    }

    public static boolean leerFecha(Date mensaje) {
        // JOptionPane.showMessageDialog(null, mensaje.toString().length());
        if (mensaje == null) {
            return false;
        }
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd", locale); // dia-mes-a�o
        String fecha = formato.format(mensaje);
        if (fecha.length() != formato.toPattern().length()) {
            return false;
        }
        formato.setLenient(false);// deshabilita el modo permisivo para rango de
        // 28,29,30 y 31 dias
        try {
            formato.parse(fecha);
        } catch (ParseException pe) {
            return false;
        }
        return true;
    }

    public static boolean leerNumerosDouble(String mensaje) {
        boolean retorno = true;
        try {
            Double.parseDouble(mensaje);
            // retorno=true;
        } catch (NumberFormatException x) {
            retorno = false;
        }
        return retorno;
    }

    public static boolean isEmail(String correo) {
        if (correo.indexOf('@') > -1) {
            return true;
        } else {
            return false;
        }
    }

    public static BigDecimal redondeoDecimalBigDecimal(BigDecimal d) {
        DecimalFormat formato = new DecimalFormat("#.##");
        DecimalFormatSymbols dfs = formato.getDecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        formato.setDecimalFormatSymbols(dfs);
        return new BigDecimal(formato.format(d));
    }

    public static BigDecimal redondeoDecimalBigDecimal(BigDecimal d, int precision, RoundingMode metodoRedondeo) {
        return d.setScale(precision, metodoRedondeo);
    }

    public static BigDecimal redondeoDecimalBigDecimal(BigDecimal d, String formato) {
        DecimalFormat format = new DecimalFormat(formato);
        DecimalFormatSymbols dfs = format.getDecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        format.setDecimalFormatSymbols(dfs);
        return new BigDecimal(format.format(d));
    }

    public static Double redondeoDeDoubles(Double d) {
        DecimalFormat formato = new DecimalFormat("#.##");
        DecimalFormatSymbols dfs = formato.getDecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        formato.setDecimalFormatSymbols(dfs);
        return Double.valueOf(formato.format(d));
    }

    public static List<String> separar(String listaAux, String separador) {
        List<String> lista = new ArrayList<String>();
        int indice = 0;
        int token = new StringTokenizer(listaAux, separador).countTokens();
        for (int i = 0; i < token; i++) {
            if (i == 0) {
                lista.add(listaAux.substring(indice, listaAux.indexOf(separador, indice + 1)).trim());
            } else if (i == token - 1) {
                lista.add(listaAux.substring(indice + 1, listaAux.length()).trim());
            } else {
                lista.add(listaAux.substring(indice + 1, listaAux.indexOf(separador, indice + 1)).trim());
            }
            indice = listaAux.indexOf(separador, indice + 1);
        }
        return lista;
    }

    public static List<String> separarComprobante(String comprobante) {
        List<String> comprobantes = new ArrayList<String>();
        String perCodigo = "";
        String tipCodigo = "";
        String conNumero = "";
        int indice = 0;

        perCodigo = comprobante.substring(0, comprobante.indexOf("|"));
        indice = comprobante.indexOf("|");

        tipCodigo = comprobante.substring(indice + 1, comprobante.indexOf("|", indice + 1));
        indice = comprobante.indexOf("|", indice + 1);

        conNumero = comprobante.substring(indice + 1);

        comprobantes.add(perCodigo.trim());
        comprobantes.add(tipCodigo.trim());
        comprobantes.add(conNumero.trim());

        return comprobantes;
    }

    public static String formatoCapitalizado(String sentence) {
        // sentence = "whY dId tHe Duck Eat sTuFF 111!@#$%^&*()";
        StringBuilder bob = new StringBuilder();
        if (sentence != null) {
            sentence = sentence.trim();
            if (!sentence.isEmpty()) {
                for (String string : sentence.split(" ")) {
                    if (string.compareToIgnoreCase("") != 0) {
                        bob.append(string.substring(0, 1).toUpperCase());
                        bob.append(string.substring(1).toLowerCase());
                        bob.append(" ");
                    }
                }
            }
        }
        return bob.toString().trim();
    }

    public static Boolean comprobarFormatoNumeroComprobante(String comprobante) {
        try {
            int primero = Integer.parseInt(comprobante.substring(0, 3).equals("___") ? "0" : comprobante.substring(0, 3));
            int segundo = Integer.parseInt(comprobante.substring(4, 7).equals("___") ? "0" : comprobante.substring(4, 7));
            int tercero = Integer.parseInt(comprobante.substring(8).equals("_________") ? "0" : comprobante.substring(8));
            boolean primeroComp = (primero > 0);
            boolean segundoComp = (segundo > 0);
            boolean terceroComp = (tercero > 0);
            return (primeroComp && segundoComp && terceroComp);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
