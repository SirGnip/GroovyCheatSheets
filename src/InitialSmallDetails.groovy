println '\n========== ' + this.getClass()

// Single line comment

/* Multiple
line
comment
 */

/** GroovyDoc comment (two asterisks in a comment before a class, field, method */


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
/* Note: can omit the "def" in variable declarations, but it isn't recommended. Using "def" makes variable locally scoped.
(No "def" creates variables in global-ish scope. Convenient for short scripts but could be dangerous with larger programs.)
 */

// An explicitly typed variable will have checks performed to make sure the correct type of object is assigned
Integer i1 = 42
//i1 = 'hello' // ERROR: Groovy runtime check will not allow this

// "def" means the variable is untyped and can have objects of different types assigned to it
def i2 = 42
i2 = 'hello'

// Boolean
def good = true
def bad = false
