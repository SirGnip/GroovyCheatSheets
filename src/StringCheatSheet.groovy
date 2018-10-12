println '\n========== ' + this.getClass()

/* Note:

- single quoted strings are of type "String" and are immutable
- It appears that a double quoted string is a "GString", and when interpolation takes place, it results in a "String"
*/

def first = 'John'
def last = 'Doe'
def full = first + ' ' + last
println full

println 'line 1\nline 2'

// no linefeed
print 'a'
print 'b'

// multiline
def quote = '''Four score and seven
    years ago, our fathers
    brought forth on this continent'''

// String interpolation
println "Name is $full and so is ${full}"  // interpolation
println "Four times ten is ${4 * 10}"  // interpolate arbitrary expression

// String interpolation with dot syntax
o = [shape:'circle', color:'orange']
println "The $o.shape is of color $o.color."

println """Hello $full,
    We thought you should know your $o.shape is $o.color."""

// Example string methods
quote.toLowerCase()
quote.toLowerCase().findAll(/[aeiou]/)  // returns List of matching letters
'abc'.padLeft(6, '_')  // ___abc
