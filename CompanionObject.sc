// Companion Objects
// When a singleton object is named the same as a class, it is called a companion object. 
// A companion object must be defined inside the same source file as the class. 

class Main {
    def sayHelloWorld() : Unit=
        println("Hello World");
    
}

object Main {
  def sayHi() : Unit= 
  		println("Hi!");
    
}

// In this class you can both instantiate Main and call sayHelloWorld() or 
// call the sayHi() method on the companion object directly, like this:

var aMain : Main = new Main();
aMain.sayHelloWorld();

Main.sayHi();
