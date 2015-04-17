package iut.tdd;

public class Convert {

	public static String num2text(String input) {

		if (true) {
			switch (input) {
			case "0":
				return "zéro";
			case "1":
				return "un";
			case "2":
				return "deux";
			case "3":
				return "trois";
			case "4":
				return "quatre";
			case "5":
				return "cinq";
			case "6":
				return "six";
			case "7":
				return "sept";
			case "8":
				return "huit";
			case "9":
				return "neuf";
			case "10":
				return "dix";
			case "11":
				return "onze";
			case "12":
				return "douze";
			case "13":
				return "treize";
			case "14":
				return "quatorze";
			case "15":
				return "quinze";
			case "16":
				return "seize";

			case "20":
				return "vingt";
			case "21":
				return "vingt et un";
			case "31":
				return "trente et un";
			case "41":
				return "quarante et un";
			case "51":
				return "cinquante et 1";
			case "61":
				return "soixante et un";
			}

		} else if (input.length() == 2) {

			//return "10" + num2text(input.substring(beginIndex, endIndex));

		}

		return "erreur";
	}

	public static String text2num(String input) {

		switch (input) {
		case "zéro":
			return "0";
		}
		return "erreur";

	}

}