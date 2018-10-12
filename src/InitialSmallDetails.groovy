println '\n========== ' + this.getClass()

// Single line comments

/* multiple
line
comments
 */


// assertions
def val = 42
assert val == 42


// variable declarations
def ok = true
def count = 99
def pi = 3.14
def name = "John"
def items = ["red", 42, true]
def ages = [bob:42, john:99, smith:123]
int i = 42
// Note: can omit the "def" in variable declarations, but it isn't recommended (creates variable in global-ish scope. Convenient for short scripts but could be dangerous with larger programs)


// Boolean
def good = true
def bad = false
