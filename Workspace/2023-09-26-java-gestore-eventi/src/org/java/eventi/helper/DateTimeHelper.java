package org.java.eventi.helper;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class DateTimeHelper {

	public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public static final DecimalFormat PREZZO_FORMATTER = new DecimalFormat("##.00€");
	public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

}
