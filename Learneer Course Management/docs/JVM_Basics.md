
### ====== JVM Basics =======

## JDK (Java Development Kit)

* JDK is a complete software package used to develop, compile, and run Java programs.
* It includes tools like: JVM( Java Virtual Machine ), JRE ( Java Run Time Environment ),
and Development Tools like:- javac ( compiles Java code into bytecode ), java ( Runs the Program ),
and Debuggers and other utilities.
* It is used to develop Java programs.

### JRE (Java Runtime Environment)

* JRE is used to run Java programs, not to develop them.
It is the part of java that allows ypu to run Java programs 
by providing the necessary environment, including the JVM, 
and essential libraries.
* It contains: JVM(Java Virtual Machine), and Core libraries.

### JVM (Java Virtual Machine)

* JVM is the engine that runs Java programs. It takes compiled Java code (bytecode)
and converts it into machine code so your computer can understand it.
* It converts bytecode into machine code and executes it.
* Platform dependent (different for Windows, Linux, etc.)

## 2. What is Bytecode?

* Bytecode is the intermediate, platform-independent code generated when
a Java program is compiled. When you write code in .java file and compile
it using the Java compiler(javac), it produces a .class file containing 
bytecode instead od machine-specific instructions. This bytecode is not
directly understandable by the computer's hardware but can be executed 
by Java Virtual Machine (JVM), which converts it into machine code for 
the specific system. 
* It is not machine-specific, so it can run on any system with JVM.

## 3. Write Once, Run Anywhere (WORA)

* WORA is a key feature of java that allows a program to be written one time 
and executed on any platform without modification. This is possible because
Java code is not directly converted into machine-specific instructions. 
Instead, it is compiled into an intermediate form called bytecode,
which is stored in a .class file. Since bytecode is platform-independent,
the same file can be used across different operating systems like Windows, Linux, or macOS.

* The execution od bytecode is handled by the JVM, which acts as a bridge between
the bytecode and the underlying system. Each operating system has its own JVM that
understands how to convert bytecode into machine-level instructions fot that specific system.

## 4. Summary Flow

* Java Code (.java)compile through Compiler (javac) it convert .java file to Bytecode (.class),
this bytecode converts into machine code by the help of JVM and this Machine Code run on System & we get Output.

