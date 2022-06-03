package javacodechecker;

public class MissingDefaultCaseInSwitch {
    public void missing() {
        int points = 1;
        // EMB-ISSUE: CodeIssueNames.MISSING_DEFAULT_CASE_IN_SWITCH
        switch (points) {
            case 0:
                result = new BigDecimal(INTEREST_RATE_AT_ZERO_POINTS);
           

            case 1:
                result = new BigDecimal(INTEREST_RATE_AT_ONE_POINTS);
               

            case 2:
                result = new BigDecimal(INTEREST_RATE_AT_TWO_POINTS);
                break;
        }
        // EMB-ISSUE: CodeIssueNames.MISSING_DEFAULT_CASE_IN_SWITCH/no-detect
        switch (points) {
            case 0:
                result = new BigDecimal(INTEREST_RATE_AT_ZERO_POINTS);
                break;
            default:
                System.out.println("4");
                break;
            case 1:
                result = new BigDecimal(INTEREST_RATE_AT_ONE_POINTS);
                break;

            case 2:
                result = new BigDecimal(INTEREST_RATE_AT_TWO_POINTS);
                break;
        }
    }
}
