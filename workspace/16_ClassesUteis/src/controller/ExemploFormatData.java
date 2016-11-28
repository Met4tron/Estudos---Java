package controller;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class ExemploFormatData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date data = new Date();
		System.out.println("Data: "+data);
		
		Date dataInserida = new Date(1,0,1);
		System.out.println("Data inserida: "+dataInserida);
		
		Calendar data2 = new GregorianCalendar();
		System.out.println("Data2: "+data2);
		
		data2.set(2015, 8, 14);
		System.out.println(data2.getTime());
		System.out.println("Mês: "+data2.get(Calendar.MONTH));
		System.out.println("Dia da semana: "+data2.get(Calendar.DAY_OF_WEEK));
		System.out.println("Dia do mês: "+data2.get(Calendar.DAY_OF_MONTH));
		System.out.println("Dia do ano: "+data2.get(Calendar.DAY_OF_YEAR));
		
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL);
		Calendar data3 = new GregorianCalendar();
		System.out.println("Data 3(FULL): "+df3.format(data3.getTime()));
		
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Data 3(LONG): "+df4.format(data3.getTime()));
		
		DateFormat df5 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Data 3(MEDIUM): "+df5.format(data3.getTime()));
		
		DateFormat df6 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Data 3(SHORT): "+df6.format(data3.getTime()));
		
		TimeZone tz = TimeZone.getTimeZone("GMT+8:00");
		TimeZone.setDefault(tz);
		System.out.println(DateFormat.getTimeInstance().format(new Date()));
		
		
	}

}
