// methods demo
def add(a: Int, b: Int): Int = a + b
val x = add(218, 101)
println(x)


// multiline methods
def multilinem(a: Int, b: Int)=
	val sum =a+b
	sum+10 
	println(sum)

multilinem(100,10)


//class demo

class Person(var firstName: String, var lastName: String):

  println("initialization begins")
  val fullName = firstName + " " + lastName

  // a class method
  def printFullName: Unit =
    // access the `fullName` field, which is created above
    println(fullName)

  printFullName
  println("initialization ends")
val john = Person("John", "Doe")
john.printFullName

// 24-Feb-2023
// case class demo
//Case Class, Immutable 

case class Rectangle(width: Int, height: Int):
	val area = width * height

val facade = Rectangle(5,3)
println(facade.area)


// facade.height=10 - ERROR, updating val

val smallRectangle = Rectangle (width =2, height =4)
val largeRectangle = smallRectangle.copy(width =4)

println(smallRectangle.area)

println(largeRectangle.area)


println(smallRectangle)
