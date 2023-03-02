// Singleton Object
// Scala classes cannot have static variables or methods. 
// Instead a Scala class can have what is called a singleton object, or sometime a companion object.
// A singleton object is declared using the object keyword.

object SingletonExample{
    // Variable of singleton object
    var str1 = "This is a Singleton Object"
     
    // Method of singleton object
    def show(): Unit =  {
        println(str1)
    }
}
 
// Singleton object with named as Main
object Main
{
    def main(args: Array[String]): Unit =  {
        // Calling method of singleton object
        SingletonExample.show()
    }
}
