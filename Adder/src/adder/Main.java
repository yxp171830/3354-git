package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide integers values to add");   
        } catch (IllegalArgumentException e) {
	    	 System.err.println("Please provide more than 1 argument");   
	}
    }

    private static int addArguments(String[] args) throws Exception {
	 	 if(args.length == 0) throw new Exception();
	 	 If(args[0].compareTo("-") == 1) {
		 	int sum = 0;
		 	for(int i = 1; i < args.length; i++) {
		 		sum = sum + Integer.valueOf(args[i]);
			}
		 	return -sum;
	 	 }
	 	 else {
		 	for(int i = 0; i < args.length; i++) {
		 		sum = sum + Integer.valueOf(args[i]);
			}
		 	return sum;
	 	 }
    }
}
