// When we call a function, it occupies space in the call stack.

// All variables and data related to the function are stored in memory.

// If too many function calls are made (especially in recursion), the stack memory can get full.

// This situation is called a **stack overflow**, and it leads to a runtime error.

// In such cases, the stack can become dangerous for the program’s stability.

// That's why it's essential to always define a proper base case in recursion.

//If there's no base case to stop the recursion, the stack keeps growing.
// Eventually, this leads to a stack overflow error, crashing the program.

