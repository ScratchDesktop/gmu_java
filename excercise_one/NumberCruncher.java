package excercise_one;

/*
* Names: Suleiman Serik, Kelton Thorpe
* netID: sserik, kthorpe
* G#: 01500703, 01438600
* Lecture section: 001, 004
* Lab section: 201, 205
*/


public class NumberCruncher {
	/**
	 *
	 * This method returns true if
	 *
	 *
	 */
	public static boolean isCoprime(int input1, int input2) {
		while (input2 != 0) {
			int num = input2;
			input2 = input1 % input2;//remainder of input1/input2
			input1 = num;
		}
		return input1 == 1;
		//i did one because it returns true if the greatest common denominator is 1 and false otherwise
	}
 
 
	/**
	 *
	 * This method returns true if
	 *
	 *
	 */
	@SuppressWarnings("unused")
	public static boolean isFibonacciPrime(long input) {
		if (input < 2) return false;  // 0 and 1 arent prime
		// Check if input is in the Fibonacci sequence using a loop
		long a = 1, b = 1;
		boolean isFibonacci = (input == 1); // f(1) and f(2) are both 1 in fibonacci
		for (long i = 2; b <= input; i++) {//start at 2 and keeps running if b is less than or equsls to input
			if (b == input) {
				isFibonacci = true;
				break;//stop if its a fibonacci number
			}
			long temp = a + b;
			a = b;
			b = temp;
		}
		if (isFibonacci == false)
			return false;//if its not a fibo num then its false
		//checks for the primality of the input(if its prime)
		if (input == 2 || input == 3) return true; //2 and 3 are prime
		if (input % 2 == 0 || input % 3 == 0) return false; //takes away numbers which are multiples of 2&3
 
 
		for (long i = 5; i * i <= input; i += 6) {
			for (long j = 0; j < 2; j++) {  // check i and i+2
				if (input % (i + j * 2) == 0)
					return false;//if the remainder of input is 0 then return false
			}
		}
 
 
		return true; // Passes Fibonacci and prime checks
	}
 
 
	/**
	 *
	 * This method returns the number of steps it takes to get to 1
	 * following the collatz game rules starting at the input
	 */
	public static int countCollatzSteps(int input){
		int count =0;//start count at zero
		while(input!=1) {//base condition for while loop so it stops when input is 0
		if(input %2==0){
			input/=2;
		}
		else{
			input = (input*3)+1;
		}
		count++;
		}
	  return count;
	}
 
 
	/**
	 *
	 * This method marks off all the spots in the input array
	 * corresponding to composite numbers, leaving only the
	 * prime numbers as true.
	 */
	public static void sieveOfEratosthenes(boolean[] array) {
		int n = array.length;
		// Zero will always be false
		array[0] = false;
		if (n > 1) array[1] = false; // One is not a prime number
		for (int i = 2; i < n; i++) {
			array[i] = true;
		}
 
 
		// Start finding prime numbers
		for (int i = 2; i * i < n; i++) {
			if (array[i]) {
				for (int j = i * i; j < n; j += i) {
					array[j] = false; // Mark Multiples as false
				}
			}
		}
	}
 
 
	/**
	 * Modifies a two-dimensional array in-place. Every occurrence of item
	 * is replaced by replacement.
	 */
	public static void replaceItem(int[][] array, int item, int[] replacement) {
		for (int i = 0; i < array.length; i++) {
			int[] this_array = array[i];
 
 
			// Need to count and Store the number of replacements needed
			int count = 0;
			for (int j = 0; j < this_array.length; j++) {
				if (this_array[j] == item) {
					count++;
				}
			}
 
 
			// No replacements so we continue to next array
			if (count == 0) continue;
 
 
			// Because we are using java, we cannot easily append a new element to the array, and must manually size the new array, given there are replacements.
			int newSize = this_array.length + count * (replacement.length - 1);
			int[] return_array = new int[newSize];
			int index = 0;
			for (int j = 0; j < this_array.length; j++) {
				if (this_array[j] == item) {
					for (int k = 0; k < replacement.length; k++) {
						// Must manually spread replacement elements into the array.
						return_array[index++] = replacement[k];
					}
				} else {
					// Because we cannot append, we must keep track of the new elements being added to the array and adjust the incremented accordingly.
					return_array[index++] = this_array[j];
				}
			}
			array[i] = return_array;
		}
	}
 
 
	/**
	 *
	 * Main method. Is not tested by the tester, create your own tests here!
	 */
	public static void main(String[] args){
		// Pass
	}
 
 
 }
 
 
 
 
 
 