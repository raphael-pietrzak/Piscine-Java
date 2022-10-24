Instructions
Create a file Palindrome.java.

Write a function isPalindrome that returns true if the String as parameter is a palindrome, i.e. can be read in both direction (e.g. 'kayak').

Expected Functions
```java
public class Palindrome {
    public static boolean isPalindrome(String s) {
        // your code here
    }
}
```
Usage
Here is a possible ExerciseRunner.java to test your function :

```java
public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("ressasser"));
        System.out.println(Palindrome.isPalindrome("Bonjour"));
    }
}
```
and its output :

```bash
$ javac *.java -d build
$ java -cp build ExerciseRunner 
true
false
$ 
```