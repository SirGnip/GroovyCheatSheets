println '\n========== ' + this.getClass()

// basic declaration
def a = 1

// primitive integer types
byte  b = 1
char  c = 2
short s = 3
int   i = 4
long  l = 5
def bin = 0b10001011  // binary
def oct = 024         // octal
def hex = 0xfa        // hexadecimal

// decimals
def w = 3.14
float x = 3.14
double y = 3.14
def z = 3.14 // Becomes a BigDecimal (infinite precision)
assert z instanceof BigDecimal

// scientific notation
def exp1 = 1.23e2   // 123
def exp2 = 1.23e-3  // 0.00123
