Delve a little deeper, do some research, and find out what do the following mean:

`public` //public is a Java keyword which declares a member's access as public. Public members are visible to all other classes. This means that any other class can access a public field or method. Further, other classes can modify public fields unless the field is declared as final .

`class` // A class is nothing but a blueprint or a template for creating different objects which defines its properties and behaviors. Java class objects exhibit the properties and behaviors defined by its class. A class can contain fields and methods to describe the behavior of an object.

`static` //It can be applied to a field, a method or an inner class. A static field, method or class has a single instance for the whole class that defines it, even if there is no instance of this class in the program. For instance, a Java entry point ( main() ) has to be static.

`void` //static means that the method is associated with the class, not a specific instance (object) of that class. This means that you can call a static method without creating an object of the class. void means that the method has no return value. If the method returned an int you would write int instead of void

`main` // Every Java application must contain a main method whose signature looks like this: public static void main(String[] args) The method signature for the main method contains three modifiers: public indicates that the main method can be called by any object.

`System` // The System class contains several useful class fields and methods. It cannot be instantiated.
Among the facilities provided by the System class are standard input, standard output, and error output streams; access to externally defined properties and environment variables; a means of loading files and libraries; and a utility method for quickly copying a portion of an array.
System is a built-in class present in java.lang package. This class has a final modifier, which means that, it cannot be inherited by other classes. It contains pre-defined methods and fields, which provides facilities like standard input, output, etc.

`out` // out is a static final field (ie, variable)in System class which is of the type PrintStream (a built-in class, contains methods to print the different data values). static fields and methods must be accessed by using the class name, so ( System.out ).
out here denotes the reference variable of the type PrintStream class.

`println` // println() is a public method in PrintStream class to print the data values. Hence to access a method in PrintStream class, we use out.println() (as non static methods and fields can only be accessed by using the refrence varialble)
