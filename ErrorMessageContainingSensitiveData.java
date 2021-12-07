package javacodechecker;

public class ErrorMessageContainingSensitiveData {

    public void method1(){

        try
        {
            throw new UnsupportedOperationException();
        }
        
        catch (UnsupportedOperationException exceptUnsupportedOperation)
        {
            exceptUnsupportedOperation.printStackTrace();
        }


        try
        {
            throw new UnsupportedOperationException();
        }
                catch (Exception e)
        {
            IO.writeLine(e);
        }

        try
        {
            throw new UnsupportedOperationException();
        }
        
        catch (Exception e)
        {
            System.out.print(e);
        }

        try
        {
            throw new UnsupportedOperationException();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        try
        {
            throw new UnsupportedOperationException();
        }
        
        catch (UnsupportedOperationException exceptUnsupportedOperation)
        {
            IO.writeLine("There was an unsupported operation error");
        }

        try
        {
            throw new UnsupportedOperationException();
        }
        
        catch (UnsupportedOperationException exceptUnsupportedOperation)
        {
            IO.writeLine("There was an unsupported operation error");
        }
    }
}
