
public class diceRoll {
	public static void main(String[] args) {
		int total = 0;
		// I loop through to get the number of rolls required to get the
		// matching data ten times then take the average.
		for (int k = 1; k <= 10; k++) {
			boolean finalOutput = false;
			// The starting number of rolls is specified here I started at
			// around a 1000 and found that this took really long to give me any
			// output and that I was still getting values starting around one
			// hundred thousand so I decided to start their.
			int times = 100000;
			while (finalOutput == false) {
				// Array is made storing the exact result wanted for dice rolls
				// and two other arrays are made to stores the number of times
				// each addition is rolled and final empirical result of the
				// rolls.
				double[] sol = { 0, 0, 0.027, 0.055, 0.083, 0.111, 0.138, 0.166, 0.138, 0.111, 0.083, 0.055, 0.027 };
				double[] values = new double[13];
				double[] ans = new double[13];
				for (int i = 1; i <= times; i++) {
					// Random number between 1 and 6 is made for each dice.
					// Switch stores the number of times each number is rolled.
					int num = (int) (Math.ceil((6 * Math.random())) + Math.ceil((6 * Math.random())));

					switch (num) {
					case 2:
						values[num] = values[num] + 1;
						break;
					case 3:
						values[num] = values[num] + 1;
						break;
					case 4:
						values[num] = values[num] + 1;
						break;
					case 5:
						values[num] = values[num] + 1;
						break;
					case 6:
						values[num] = values[num] + 1;
						break;
					case 7:
						values[num] = values[num] + 1;
						break;
					case 8:
						values[num] = values[num] + 1;
						break;
					case 9:
						values[num] = values[num] + 1;
						break;
					case 10:
						values[num] = values[num] + 1;
						break;
					case 11:
						values[num] = values[num] + 1;
						break;
					case 12:
						values[num] = values[num] + 1;
						break;

					}

				}
				// The hard way to format a number to the third decimal place.
				for (int i = 2; i <= 12; i++) {
					ans[i] = ((double) (((int) ((values[i] / times) * 1000)))) / 1000;
				}
				// Check to see if all the empirical result matches the exact
				// result
				// to the third decimal.
				if (ans[1] == sol[1] && ans[2] == sol[2] && ans[3] == sol[3] && ans[4] == sol[4] && ans[5] == sol[5]
						&& ans[6] == sol[6] && ans[7] == sol[7] && ans[8] == sol[8] && ans[9] == sol[9]
						&& ans[10] == sol[10] && ans[11] == sol[11] && ans[12] == sol[12])
					finalOutput = true;
				else
					finalOutput = false;

				if (finalOutput == true)
					System.out.println("Number of rolls required is " + times);
				else
					// The incrementing of times to the next number when the
					// values do not match.
					times += 10;
			}

			total += times;
		}
		System.out.println("Average amount: " + total / 10);
	}
}
