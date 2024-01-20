package Day68CodeVita;

// Java find number of squares in a 
// chessboard


class GFG 
{
	// Function to return count of squares;
	static int countSquares(int n)
	{
		// A better way to write n*(n+1)*(2n+1)/6
		return (n * (n + 1) / 2) * (2 * n + 1) / 3;
	}
	
	// Driver code
	public static void main (String[] args)
	{
		int n = 3;
		System.out.println("Count of squares is "
						+countSquares(n));
	}
}

// This code is contributed by Anant Agarwal.
