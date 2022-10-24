Instructions
Create a file StringContain.java.

Write a function isStringContainedIn that returns true if the first String as parameter is contained in the second String as parameter.

Expected Functions
```java
public class StringContain {
    public static boolean isStringContainedIn(String subString, String s) {
        // your code here
    }
}
```
Usage
Here is a possible ExerciseRunner.java to test your function :
```java

public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(StringContain.isStringContainedIn("Hell", "Highway to Hell"));
        System.out.println(StringContain.isStringContainedIn("Hell", "Hello World !"));
        System.out.println(StringContain.isStringContainedIn("Bonjour", "hello World !"));
    }
}
```
and its output :

```bash
$ javac *.java -d build
$ java -cp build ExerciseRunner 
true
true
false
$ 
```