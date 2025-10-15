package week6;
public class ExceptionHandling
{
    public static void main(String[] args){
        try
        {
            int a=20,b=0,c;
            c=a\b;
            Syatem.out.println(c);
            }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException:\n"+e);
            }
        finally
        {
            system.out.println("Finally is Exception");
            }
        }
        }
