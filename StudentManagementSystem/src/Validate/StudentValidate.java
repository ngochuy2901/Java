package Validate;

public class StudentValidate {
    private static int maxLengthName = 100;
    private static int minStartYear = 1900;
    private static int maxAddressLength = 300;
    private static double minHeight = 50, maxHeight = 300;
    private static double minWeight = 5, maxWeight = 1000;
    private static int maxSchoolNameLength = 200;
    private static double minAvgScore = 0;
    private static double maxAvgScore = 10;

    public static boolean checkStudentValidate(int lengthName, int lengthAddress, int startYear, double weight, double height, int schoolNameLength, double avgScore) {
        if (lengthName >= maxLengthName || lengthAddress >= maxLengthName || startYear <= minStartYear || weight >= maxWeight || weight <= minWeight || height >= maxHeight || height <= minHeight || schoolNameLength >= maxSchoolNameLength || avgScore >= maxAvgScore || avgScore <= minAvgScore)
            return false;
        return true;
    }
    //, double height, double weight, int startYear, double avgScore
}
