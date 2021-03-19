/*1.who is the creator of kotlin? Google
* 2.which of these is used to handle null exceptions in Kotlin ? Elvis operator
*3. which of these is true for kotlin variables? Var cannot be changed
*4. */
fun main(){
//4 apple as a mutable variable
    var Apple="apple"

//  banana as a mutable variable

    val Banana="apple"
// 5   apple as a mutable variable declaring data type
    var apple:String
    apple="apple"
    //banana as a immutable variable declaring data type
    val banana:String
    banana="banana"
    var fruits= arrayOf("apples","bananas","pears")

    println("item 3 was ${fruits.get(2)}")
    fruits[2]="grapes"

    println("${fruits.get(2)} is item 3 after modification")

    println("$Apple $banana $apple $Banana" +
            "+ \tAddition of two variables \ta + b\n" +
            "- \tSubtraction of two variables \ta - b\n" +
            "* \tMultiplication of two variables \ta * b\n" +
            "/ \tDivision of two variables \ta / b\n" +
            "% \tModulus of two variables. It will return remainder when a is divided by b. \ta % b" +
            "< \tChecks if one variable is less than other. It returns true if the operand on the left is less than the operand on the right, otherwise returns false. \ta < b\n" +
            "> \tChecks if one variable is greater than other. It returns true if the operand on the left is greater than the operand on the right, otherwise returns false. \ta > b\n" +
            "<= \tChecks if one variable is less than or equal to other. It returns true if the operand on the left is less than or equal to the operand on the right, otherwise returns false. \ta <= b\n" +
            ">= \tChecks if one variable is greater than or equal to other. It returns true if the operand on the left is greater than or equal to the operand on the right, otherwise returns false. \ta >= b" +
            "= \tAssign a value to a variable \ta = 10\n" +
            "+= \tAdd and assign a value to a variable \ta+=b\n" +
            "-= \tSubtract and assign a value to a variable \ta-=b\n" +
            "*= \tMultiply and assign a value to a variable \ta*=b\n" +
            "/= \tDivide and assign a value to a variable \ta/=b\n" +
            "%= \tMudulus and assign a value to a variable \ta%=b" +
            "== \tChecks if two objects are equal and returns true \ta == b\n" +
            "!= \tChecks if two objects are not equal and returns true \ta != b\n" +
            "=== \tChecks if two variable refer to same object \ta === b\n" +
            "!== \tChecks if two variable does not refer to same object \ta !== b" +
            "+ \tUnary plus, returns positive value \t+a\n" +
            "- \tUnary minus, returns negative value \t-b\n" +
            "++ \tIncrement operator, increase value by 1 \ta++, ++a\n" +
            "-- \tDecrement operator, decrease value by 1 \tb--, --b" +
            "&& \tAND operator, return true if both inputs are true \ta && b\n" +
            "|| \tOR operator, return true if any one is true \ta || b\n" +
            "! \tNOT operator, return negation of variable \t!a" +
            "1. Nullable operator (?)\n" +
            "\n" +
            "Kotlin doesn't allow a field to be null by default. To make a field nullable, we need to assign ? operator.\n" +
            "\n" +
            "var message: String = null       // Error\n" +
            "var nullableMessage: String? = null       // No error\n" +
            "\n" +
            "2. The !! operator\n" +
            "\n" +
            "The null pointer assertion operator(!!) will convert any value to non-null type and throws an exception if the value is null.\n" +
            "\n" +
            "val message: String? = null\n" +
            "println(message!!.length)\n" +
            "\n" +
            "This code will not throw any error during compile time but it will throw error at runtime. This operator is not preferred to use.\n" +
            "3. Safe call operator( ?. )\n" +
            "\n" +
            "This operator is one of the most important operator in Kotlin. It saves us from null pointer exception. As the name suggests, it helps us to safely call any variable or method of an object by checking if object is null or not.\n" +
            "\n" +
            "val message: String? = null\n" +
            "println(message?.length)       // It will return null\n" +
            "println(message!!.length)     // It will through null pointer exception\n" +
            "\n" +
            "Here in first case, it will check if message is null. If yes, then instead of calling the method, it will return null.\n" +
            "4. Elvis operator\n" +
            "\n" +
            "The Elvis operator in Kotlin is used to assign some other value if the reference is null.\n" +
            "\n" +
            "For example:\n" +
            "\n" +
            "var message: String? = null\n" +
            "println(message?:\"Message is null\")       \n" +
            "\n" +
            "message = \"Hello World\"\n" +
            "println(message?:\"Message is null\")\n" +
            "\n" +
            "\n" +
            "Message is null\n" +
            "Hello World\n" +
            "\n" +
            "Here in first case, when message is null, condition after elvis operator is used and \"Message is null\" is printed. In second case, when message is not null, message is printed itself.")
}
/*6.what's Null safety and nullable types in kotlin ?what is the Elvis operator?
When you have a nullable reference b , you can say "if b is not null , use it, otherwise use some non-null value":
 is a binary operator that returns its first operand if
 that operand evaluates to a true value, and otherwise evaluates and returns its second operand .

* 7.What is the entry point of every kotlin program?
The main() function in Kotlin is the entry point to a Kotlin program.

* 8.How is a function declared?
by declaring function by the word fun then the name of the function followed by parentheses and curly brackets
 eg fun main(){....}

* 9.define fruits as a kotlin array with the items apple,bananas and pears?
* 10.access the items number 3 from above array using get
* 11.Modify the above item by giving the value of another fruit
* 12.print out the list of operators found in kotlin using the println statement
* give a brief explanation of each on the output. */