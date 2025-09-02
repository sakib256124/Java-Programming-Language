public class Logical {

    // Function to get the i-th bit of a number n
    // If the i-th bit is 1 → return 1
    // If the i-th bit is 0 → return 0
    public static int getithbit(int n, int i) {
        int mask = 1 << i;          // Create a mask with only the i-th bit set (e.g., if i=2 → 00000100)
        if ((n & mask) == 0) {      // AND operation checks if the i-th bit in n is set or not
            return 0;               // If result = 0 → bit was 0
        } else {
            return 1;               // Otherwise bit was 1
        }
    }

    // Function to clear the i-th bit of n (set it to 0)
    public static int clearbit(int n, int i) {
        int mask = ~(1 << i);       // Create a mask where all bits are 1 except i-th bit (which is 0)
        return n & mask;            // AND with n → clears i-th bit
    }

    // Function to set the i-th bit of n (set it to 1)
    public static int setbit(int n, int i) {
        return n | (1 << i);        // OR with mask (only i-th bit 1) → forces i-th bit to 1
    }

    // clear range bits 
public static int clearrangebit(int n, int i, int j) {
    // (1 << i) - 1 → creates a mask with i ones at the right
    // Example: i=3 → (1<<3)-1 = 1000-1 = 0111
    int a = (1 << i) - 1;           

    // ~0 << (j+1) → creates a mask with ones on the left of j
    // Example: j=5 → (11111111... << 6) = 111111000000
    int b = ~0 << (j + 1);

    // Combine both masks → ones everywhere except from i to j
    int bitmask = a | b;

    // AND with n → clears the range
    return n & bitmask;
}

// set range in bit
public static int numofsetbit(int n){
    int count = 0;
    while(n !=0){
        int z = n & 1;
        if(z == 1){
            count ++;
        }
        n = n>>1;
    }
    return count;
}

    public static void main(String[] args) {
        // Bitwise OR (|): 5 (0101) | 6 (0110) = 0111 = 7
        System.out.println(5 | 6);

        // Bitwise AND (&): 6 (0110) & 5 (0101) = 0100 = 4
        System.out.println(6 & 5);

        // Bitwise XOR (^): 5 (0101) ^ 6 (0110) = 0011 = 3
        System.out.println(5 ^ 6);

        // Bitwise NOT (~): ~5 = -(5+1) = -6
        // (~5)+1 is just computing the 2's complement of 5 → -5
        System.out.println((~5) + 1);

        // Left shift (<<): a << b = a * 2^b
        // 6 << 2 → 6 * 2^2 = 24
        System.out.println(6 << 2); // 6 (00000110) becomes 00011000 (24)

        // Right shift (>>): a >> b = a / 2^b
        // 9 >> 3 → 9 / 2^3 = 1
        System.out.println(9 >> 3); // 9 (00001001) becomes 00000001 (1)

        // Odd/Even check using AND with 1
        // If last bit = 1 → odd, else even
        System.out.println(5 & 1); // 5 (0101) & 1 (0001) = 1 → odd

        // Get the 2nd bit of 10 (1010)
        // Bits: index(3)=1, index(2)=0, index(1)=1, index(0)=0
        System.out.println(getithbit(10, 2)); // → 0

        // Clear the 1st bit of 10 (1010 → index(1) is 1)
        // 10 & ~(1<<1) = 1010 & 1101 = 1000 (8)
        System.out.println(10 & ~(1 << 1));

        // Same as above but using clearbit() function
        System.out.println(clearbit(10, 1)); // → 8

        // Set the 2nd bit of 10 (1010)
        // Already 0 at index(2), so result becomes 1110 (14)
        System.out.println(setbit(10, 2)); // → 14
        System.out.println(clearrangebit(63,3,5));// 1111111 -> 
        System.out.println(numofsetbit(15));
    }
}
