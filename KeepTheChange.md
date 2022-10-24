Instructions
Create a file KeepTheChange.java.

Write a function computeChange that returns the list of coins that compose the change.
As parameters, we have :

the amount to decompose in different coins
the set of existing coins
The awaiting solution is the best solution, so must have the minimum of coins.
The tests are choosen to have an unique solution.

Expected Functions
import java.util.List;
import java.util.Set;

``` java
public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        // your code here
    }
}
```
Usage
Here is a possible ExerciseRunner.java to test your function :

import java.util.Set;

``` java
public class ExerciseRunner {

    public static void main(String[] args) {
        System.out.println(KeepTheChange.computeChange(18, Set.of(1, 3, 7)));
    }
}
```
and its output :

``` bash
$ javac *.java -d build
$ java -cp build ExerciseRunner 
[7, 7, 3, 1]
$ 
```
