Instructions
Create a file Wedding.java.

Write a function createCouple that returns a map of name which associates randomly a name from the first list to a name of the second list.
If the lists have different size, some names from the bigger list will not be ignored.

Expected Functions
import java.util.Set;
import java.util.Map;

``` java
public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
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
        System.out.println(Wedding.createCouple(Set.of("Pikachu", "Dracaufeu", "Tortank"), Set.of("Legolas", "Aragorn", "Gimli")));
    }
}
```
and its output :

``` bash
$ javac *.java -d build
$ java -cp build ExerciseRunner 
{Pikachu=Legolas, Tortank=Gimli, Dracaufeu=Aragorn}
$ 
```
