package javacodechecker;

public class PublicCloneableMethodWithoutFinal implements Cloneable{

    //EMB-ISSUE: CodeIssueNames.PUBLIC_CLONEABLE_METHOD_WITHOUT_FINAL
    public Object clone(String accountnumber) throws
            CloneNotSupportedException
    {
       logger.info("Use final keyward");
    }
}