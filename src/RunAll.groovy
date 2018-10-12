println 'Running all Groovy executable cheat sheets ' + args

/* Script vs classes
Reference: http://groovy-lang.org/structure.html#_scripts_versus_classes

- You can just place raw statements in a file and run it. Groovy creates an implicit class and implicit run() method.
- You can declare methods in a file with no class declaration. Groovy creates implicit class and attaches methods to the implicit class.
- You can create a class that is the same name of the file and give it a "public static void main" and it will behave in the standard "Java" way.
- You can NOT do both. Bare statements AND a class with the same name as the file will generate an error.
 */

// this file is a script (no explicit class)

MainInScript.main(args) // runs main() method found in a script (implicit class)
MainInClass.main(args) // runs a main() in an explicit class
new NumberCheatSheet().run() // runs implicit run() method from implicit class
new InitialSmallDetails().run()
new StringCheatSheet().run()
