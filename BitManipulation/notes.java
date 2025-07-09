// We are now studying Bit Manipulation.
// In mathematics, we use the decimal number system which has 10 digits: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
// But in computer systems, the binary number system is used.
// "Binary" means 2, so it only has two digits: 0 and 1.
// Everything stored or processed inside a computer is represented in binary form (combinations of 0s and 1s).



// To convert a decimal number into binary form:
// 1. Keep dividing the number by 2.
// 2. Write down the remainder each time.
// 3. Continue until the quotient becomes 0.
// 4. The binary number is formed by reading the remainders from **bottom to top**
//    (i.e., from the last remainder to the first).
//
// Example: Convert 13 to binary
// 13 / 2 = 6 remainder 1
//  6 / 2 = 3 remainder 0
//  3 / 2 = 1 remainder 1
//  1 / 2 = 0 remainder 1
// So, binary of 13 = 1101


// To convert a binary number into a decimal number:
// 1. Start from the **rightmost digit** (least significant bit).
// 2. Multiply each binary digit (0 or 1) by 2 raised to the power of its position index.
// 3. Add all the results together.
//
// Example: Convert binary 1101 to decimal
// Positions (index):   3   2   1   0
// Binary digits:       1   1   0   1
// Calculation:     (1×2^3) + (1×2^2) + (0×2^1) + (1×2^0)
//               =   8    +   4    +   0    +   1  = **13**
//
// So, binary 1101 = decimal 13


// BIT-WISE OPERATOR

// 1. bit-wise AND ->  &
// 2. bit-wise OR  ->  |
// 3. bit-wise XOR ->  ^
// 4. bit-wise one's compliment -> ~
// 5. bit-wise left Shift  -> <<
// 6. bit-wise Right Shift -> >> 

// AND Operation (&):
// - Compares two bits.
// - If both bits are 1, result is 1. Otherwise, result is 0.
// - Truth table:
//   1 & 1 = 1
//   1 & 0 = 0
//   0 & 1 = 0
//   0 & 0 = 0

// OR Operation (|):
// - Compares two bits.
// - If at least one bit is 1, result is 1. Otherwise, result is 0.
// - Truth table:
//   1 | 1 = 1
//   1 | 0 = 1
//   0 | 1 = 1
//   0 | 0 = 0

// XOR Operation (^):
// - Compares two bits.
// - If the bits are different, result is 1. If they are the same, result is 0.
// - Truth table:
//   1 ^ 1 = 0
//   1 ^ 0 = 1
//   0 ^ 1 = 1
//   0 ^ 0 = 0

// One's Complement (~) — also called NOT operator:
// - Works on a **single bit** (unary operator).
// - It flips the bit: 1 becomes 0, and 0 becomes 1.
//   ~1 = 0
//   ~0 = 1


// Note:
// - In Java (and most programming languages), integers are stored in 32-bit format (for `int` type).
// - That means 5 is not just `101`, but is actually stored as:
//   00000000 00000000 00000000 00000101  (32-bit binary)
// - When we apply one's complement (~) on 5:
//   ~00000000 00000000 00000000 00000101
// =  11111111 11111111 11111111 11111010
// - This result is interpreted as a **negative number** in Java, using **Two's Complement** format.
//   So, ~5 = -6
//
// Similarly:
// ~0 = 11111111 11111111 11111111 11111111 (all 1s) = -1
//
// Why this happens:
// - Java uses **two's complement** to represent negative numbers.
// - In two's complement, the most significant bit (leftmost) is used as the **sign bit**:
//   - If it's 0 -> the number is positive
//   - If it's 1 -> the number is negative
// - This is why applying ~ (bitwise NOT) on a number gives you -(number + 1)


//  Left Shift Operator (<<)
// Syntax: a << b
// This shifts the binary digits of 'a' to the left by 'b' positions.
// Each left shift is equivalent to multiplying the number by 2.
//
// Example:
// int a = 5;           // binary: 0000 0101
// int result = a << 1; // shifts left by 1 -> 0000 1010 (which is 10)
// int result = a << 2; // shifts left by 2 -> 0001 0100 (which is 20)