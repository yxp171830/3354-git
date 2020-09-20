package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide integers to add");   
        }
    }

    private static int addArguments(String[] args) throws Exception {
        if(args.length == 0) throw new Exception();
		 int sum = 0;
		 for(int i = 0; i < args.length; i++)
			  sum = sum + Integer.valueOf(args[i]);

        return sum;
    }
}
