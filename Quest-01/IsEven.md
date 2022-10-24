Des instructions
Créer un fichier IsEven.java.

Écrivez une fonction isEven qui renvoie vrai si l'entier passé en paramètre est pair, sinon renvoie faux.

Fonctions attendues
```java
public class IsEven {
    public static boolean isEven(int a) {
        // your code here
    }
}
```
Usage
Voici un ExerciseRunner.java possible pour tester votre fonction :
```java

public class ExerciseRunner {

    public static void main(String[] args) {
        System.out.println(IsEven.isEven(2));
        System.out.println(IsEven.isEven(26));
        System.out.println(IsEven.isEven(57));
    }
}
```
et sa sortie :

```bash
$ javac *.java -d build
$ java -cp build ExerciseRunner
true
true
false
$
```