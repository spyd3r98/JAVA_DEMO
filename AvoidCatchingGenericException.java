package javacodechecker;

public class AvoidCatchingGenericException {

    public void badexample()
    {
        try
        {
            Integer.parseInt("Test");
        }
        // EMB-ISSUE: CodeIssueNames.AVOID_CATCHING_GENERIC_EXCEPTION
        catch (Exception exception)
        {
            IO.writeLine("Caught Exception");
        }

    }

    public void badexample2()
    {
        try
        {
            Integer.parseInt("Test");
        }
        // EMB-ISSUE: CodeIssueNames.AVOID_CATCHING_GENERIC_EXCEPTION
        catch (Throwable throwable)
        {
            IO.writeLine("Caught Exception");
        }

    }


    public void badexample3()
    {
        try
        {
            Integer.parseInt("Test");
        }
        // EMB-ISSUE: CodeIssueNames.AVOID_CATCHING_GENERIC_EXCEPTION
        catch (Error error)
        {
            IO.writeLine("Caught Exception");
        }

    }

    public void GoodExample1()
    {
        try
        {
            Integer.parseInt("Test");
        }
        // EMB-ISSUE: CodeIssueNames.AVOID_CATCHING_GENERIC_EXCEPTION/no-detect
        catch (IOException e)
        {
            IO.writeLine("Caught IOException");
        }

    }
}