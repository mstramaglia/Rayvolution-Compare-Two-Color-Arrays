# 🧩 Java Coding Assignment: Compare Two Color Arrays

## 📘 Objective
Write a Java method that determines whether two arrays of colors are identical.

Two arrays are considered **identical** if:
- They have the same number of elements.
- Each corresponding element (color) in both arrays matches (case-insensitive).

---

## 🧠 Learning Goals
By completing this assignment, you will:
- Practice working with **arrays** in Java.
- Learn to **iterate through arrays** using loops.
- Understand how to **compare strings** in Java.
- Handle **edge cases** such as null values, mismatched lengths, and case differences.

---

## 📝 Requirements
1. Create a method with the following signature:

   ```java
   public static boolean compareColorArrays(String[] colors1, String[] colors2)
   ```

2. The method should:
    - Return `true` if both arrays are the same length **and** contain the same elements in the same order (case-insensitive).
    - Return `false` otherwise.

3. Handle edge cases:
    - One or both arrays are `null`.
    - Arrays have different lengths.
    - Case variations like `"Red"` and `"red"` should be treated as equal.

4. Include a `main` method that tests your function with at least **three examples**.

---

## 💡 Example Input/Output

| colors1                     | colors2                     | Expected Output |
|-----------------------------|-----------------------------|-----------------|
| `{"Red", "Green", "Blue"}`  | `{"Red", "Green", "Blue"}`  | `true`          |
| `{"red", "green"}`          | `{"Red", "Green"}`          | `true`          |
| `{"Blue", "Yellow"}`        | `{"Yellow", "Blue"}`        | `false`         |
| `{"Pink"}`                  | `{"Pink", "Pink"}`          | `false`         |
| `null`                      | `{"Red"}`                   | `false`         |

---

## 🧩 Starter Code

```java
public class ColorArrayComparer {

    /**
     * Determines if two arrays of colors are identical (case-insensitive).
     * @param colors1 The first array of color names.
     * @param colors2 The second array of color names.
     * @return true if arrays are equal in length and content; false otherwise.
     */
    public static boolean compareColorArrays(String[] colors1, String[] colors2) {
        // TODO: Implement method logic here
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        String[] test1a = {"Red", "Green", "Blue"};
        String[] test1b = {"Red", "Green", "Blue"};
        System.out.println(compareColorArrays(test1a, test1b)); // true

        String[] test2a = {"red", "green"};
        String[] test2b = {"Red", "Green"};
        System.out.println(compareColorArrays(test2a, test2b)); // true

        String[] test3a = {"Blue", "Yellow"};
        String[] test3b = {"Yellow", "Blue"};
        System.out.println(compareColorArrays(test3a, test3b)); // false
    }
}
```

---

## 🧩 Helpful Java Tips

### 🔁 How to Iterate Through an Array
You can use a **for loop** to go through each element in an array.

Example:
```java
String[] colors = {"Red", "Green", "Blue"};

for (int i = 0; i < colors.length; i++) {
    System.out.println(colors[i]);
}
```

Or, using an **enhanced for loop**:
```java
for (String color : colors) {
    System.out.println(color);
}
```

👉 In this assignment, a traditional `for` loop is helpful because you’ll need to compare elements **by index** in both arrays.

---

### 🔤 How to Compare Strings in Java
In Java, **never** use `==` to compare strings — that checks if two string objects are the same in memory, not if their contents are equal.

Instead, use:
```java
string1.equals(string2);
```

To compare strings **without considering uppercase/lowercase**, use:
```java
string1.equalsIgnoreCase(string2);
```

Example:
```java
String colorA = "Red";
String colorB = "red";

if (colorA.equalsIgnoreCase(colorB)) {
    System.out.println("The colors match!");
}
```

---

### ⚠️ Common Pitfalls
- Using `==` for string comparison.
- Forgetting to check for `null` arrays.
- Assuming two arrays are equal just because their first few elements match.
- Not accounting for case differences ("red" vs. "Red").

---

## ✅ Submission Instructions
1. Implement your solution in a file named `ColorArrayComparer.java`.
2. Test your program with at least three sets of arrays.
3. Submit your `.java` file via your course submission portal or GitHub repository.

---

**Happy coding! 🎨**
