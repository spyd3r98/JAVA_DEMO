package javacodechecker;
public class StaticFinalArrayShouldBePrivate{

    // EMB-ISSUE: CodeIssueNames.STATIC_FINAL_ARRAY_SHOULD_BE_PRIVATE
    public static final int[] arr={1,2,3,4,5};

    // EMB-ISSUE: CodeIssueNames.STATIC_FINAL_ARRAY_SHOULD_BE_PRIVATE
    public static final String arr3[]=new String[3];

    // EMB-ISSUE: CodeIssueNames.STATIC_FINAL_ARRAY_SHOULD_BE_PRIVATE
    public static final String arr4[];

    // EMB-ISSUE: CodeIssueNames.STATIC_FINAL_ARRAY_SHOULD_BE_PRIVATE
    public static final String[][] arr7;

	public static final int[] arr10={1,2,3};    

    private static final int[] arr1={1,2,3};

    // EMB-ISSUE: CodeIssueNames.STATIC_FINAL_ARRAY_SHOULD_BE_PRIVATE
    private static final int[] arr5=arr1;

    // EMB-ISSUE: CodeIssueNames.STATIC_FINAL_ARRAY_SHOULD_BE_PRIVATE/no-detect
    public static final int[] arr9=arr1;

    // EMB-ISSUE: CodeIssueNames.STATIC_FINAL_ARRAY_SHOULD_BE_PRIVATE/no-detect
    private static final String array[]={"1","2","3"};


`	
    static final SecureRandom secureRandom = new SecureRandom();

	private static final SecureRandom secureRN = new SecureRandom();
    public int GenerateRandomValue(){
        return secureRandom.nextInt();
    }

}
