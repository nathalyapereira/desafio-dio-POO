package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    public static String formataData(String pattern,LocalDate data){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return data.format(formatter);
    }
}
