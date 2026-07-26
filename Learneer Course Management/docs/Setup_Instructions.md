##====== Setup Instructions =======

JDK Version Used
This project was developed and tested with **"26.0.1" 2026-04-21 **.

$ java -version
java version "26.0.1" 2026-04-21
Java(TM) SE Runtime Environment (build 26.0.1+8-34)
Java HotSpot(TM) 64-Bit Server VM (build 26.0.1+8-34, mixed mode, sharing)

##  Step 1: Install JDK

Windows:
Download from https://www.oracle.com/in/java/technologies/downloads/ run the installer.

##  Step 2: Verify Installation

* java -version
* javac -version

Both commands should print version 25.x.x (or whichever version is installed).

##  Step 3: Hello World — Confirming Java Works

Create a file called Hello.java:

* java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

# Compile and run:

* javac Hello.java
* java Hello

output:

Hello, World

##  Step 4: Compile LearnTrack

From the project root directory:

javac -d out $(find src -name "*.java")

On Windows (Command Prompt):

for /r src %f in (*.java) do javac -d out "%f"

## Step 5: Run LearnTrack

bash
java -cp out com.airtribe.learntrack.ui.Main

IDE Setup (IntelliJ IDEA — Recommended)
Open IntelliJ → File → New → Project from Existing Sources
Select the `learntrack` folder
Mark `src` as the Sources Root (right-click → Mark Directory As)
Set SDK to JDK 25
Run `Main.java` directly from the IDE