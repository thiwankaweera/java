import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the name of the country: ");
        String country = scanner.nextLine().trim().toLowerCase();
        
        System.out.print("Enter the month of the year: ");
        String month = scanner.nextLine().trim().toLowerCase();
        
        String season = findSeason(country, month);
        
        if (season != null) {
            System.out.println("The season in " + country + " during " + month + " is: " + season);
        } else {
            System.out.println("Invalid country or month provided.");
        }
    }
    
    public static String findSeason(String country, String month) {
        switch (country) {
            case "australia":
                return getAustraliaSeason(month);
            case "spain":
            case "japan":
                return getSpainJapanSeason(month);
            case "mauritius":
                return getMauritiusSeason(month);
            case "malaysia":
            case "sri lanka":
                return getMalaysiaSriLankaSeason(month);
            default:
                return null;
        }
    }
    
    public static String getAustraliaSeason(String month) {
        switch (month) {
            case "december":
            case "january":
            case "february":
                return "Summer";
            case "march":
            case "april":
            case "august":
                return "Winter";
            case "september":
            case "october":
            case "november":
                return "Spring";
            default:
                return null;
        }
    }
    
    public static String getSpainJapanSeason(String month) {
        switch (month) {
            case "december":
            case "january":
            case "february":
                return "Winter";
            case "march":
            case "april":
            case "may":
                return "Spring";
            case "june":
            case "july":
            case "august":
                return "Summer";
            case "september":
            case "october":
            case "november":
                return "Autumn";
            default:
                return null;
        }
    }
    
    public static String getMauritiusSeason(String month) {
        switch (month) {
            case "november":
            case "april":
                return "Summer";
            case "may":
                return "Autumn";
            case "june":
            case "july":
            case "august":
            case "september":
                return "Winter";
            case "october":
                return "Spring";
            default:
                return null;
        }
    }
    
    public static String getMalaysiaSriLankaSeason(String month) {
        switch (month) {
            case "december":
            case "january":
            case "february":
                return "Northeast Monsoon";
            case "march":
            case "april":
                return "Inter Monsoon";
            case "may":
            case "september":
                return "Southeast Monsoon";
            case "october":
            case "november":
                return "Inter Monsoon";
            default:
                return null;
        }
    }
	public static void displaySeason(String season, String country, String month) {
 
		System.out.println("The season in " + country + " during " + month + " is: " + season);
	}
}

