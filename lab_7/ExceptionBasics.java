public class ExceptionBasics {
    public static void main(String[] args) {
        System.out.println("Hello, Exceptional World!");
        //App app = new App();
        //app.propagationExample(); // requires more propagation: add "throws Throwable" to this method
        //app.catchingExample();

        ExceptionBasics eb = new ExceptionBasics();
        eb.iGotcha(); // Calling the new method
    }

    /**
     * The syntax "throws ThrowableType" after the parameter list indicates
     * that the method is not handling the situation, the caller of the method is.
     * @throws Throwable an example creating a new Throwable instance with message "Catch me if you can!"
     */
    public void propagationExample() throws Throwable {
        // This is an example, there are conditions you want check before throwing an exception 
        throw new Throwable("Catch me if you can!");
    }

    /**
     * Notice how catching exceptions stops propagation
     */
    public void catchingExample() {
        try {
            // all lines before the line below will execute normally
            propagationExample(); // The method result is now corrupted due to the exception
            // the result of the method, if any, and until the end of this try's block will not execute. 
        } catch (Throwable t) { // "Throwable t" is the type we are aiming to catch
            System.out.println("Catch you I did!"); // and caught it is
        }

        try {
            // the Throwable may be thrown and propagated from a line within this block    
        } catch (Throwable t) {
            // and this block executes if the Throwable was in fact thrown.
        }
    }

    // New method that handles divide-by-zero exception and prints the cause
    public void iGotcha() {
        try {
            int result = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            StackTraceElement[] trace = e.getStackTrace();
            if (trace.length > 0) {
                System.out.println("Exception caused at: " + trace[0]);
            }
        }
    }
}
