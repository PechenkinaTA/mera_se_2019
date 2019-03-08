package ru.mera.pechenkina.task11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataTime {

	public static void main(String[] args) {

		List<LocalDate> arrayWithDates = new ArrayList<LocalDate>(30);
		List<LocalDate> dates = new ArrayList<LocalDate>();
		List<String> formartedDates = new ArrayList<String>();

		for (int i = 0; i < 30; i++) {
			LocalDate randomDate = createRandomDate(1500, 2500);
			arrayWithDates.add(randomDate);
			// System.out.println(randomDate);
		}

		// Sort and grouped by centure
		Map<Object, List<LocalDate>> grouped = arrayWithDates.stream().sorted()
				.collect(Collectors.groupingBy(arrayWithDate -> arrayWithDate.getYear() / 100 + 1));
		System.out.println("Sorted dates by centure " + grouped);

		// filter by dates with Sunday
		for (LocalDate arrayWithDate : arrayWithDates) {
			if (arrayWithDate.withDayOfMonth(arrayWithDate.lengthOfMonth()).getDayOfWeek().getValue() == 7) {
				dates.add(arrayWithDate);
			}
		}
		System.out.println("Dates with Sunday in the end of month " + dates);

		// Sorted
		List<LocalDate> sortDates = arrayWithDates.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted dates " + sortDates);

		// DateFormatter&99
		formartedDates = arrayWithDates.stream()
				.map(arrayWithDate -> arrayWithDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")))
				.filter(year -> year.endsWith("99")).collect(Collectors.toList());

		System.out.println("Formated Dates that are ended to 99 " + formartedDates);

	}

	public static int createRandomIntBetween(int start, int end) {
		return start + (int) Math.round(Math.random() * (end - start));
	}

	public static LocalDate createRandomDate(int startYear, int endYear) {
		int day = createRandomIntBetween(1, 28);
		int month = createRandomIntBetween(1, 12);
		int year = createRandomIntBetween(startYear, endYear);
		return LocalDate.of(year, month, day);
	}
}
