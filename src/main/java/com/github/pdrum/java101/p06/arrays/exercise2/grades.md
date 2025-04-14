### 📌 **Problem Statement: Student Grades Manager (Java Arrays Exercise)**

You are required to create a simple Java program that helps manage student grades for a class. 
The program will allow the user to **store grades**, **find the highest, lowest, and average grades**,
**search for a grade**, and **update a grade** at a specific index.

---

#### **Requirements**
1. **Input:**
    - An integer array of size **10** to store student grades.
    - Grades are provided by the user, one at a time.
    - Menu options to choose from various operations.

2. **Operations:**  
   Your program should support the following operations, selected via a menu:
    - **1. Find Highest Grade**: Displays the highest grade in the array.
    - **2. Find Lowest Grade**: Displays the lowest grade in the array.
    - **3. Calculate Average Grade**: Calculates and displays the average of all grades (as a decimal value).
    - **4. Search for a Grade**: Takes a grade as input and checks if it exists in the array. Outputs whether the grade was found or not.
    - **5. Update a Grade**: Takes an index (0-9) and a new grade as input, then updates the grade at that index.
    - **6. Exit**: Exits the program.

3. **Output:**
    - Display appropriate messages for each operation.
    - Show results of searches, highest, lowest, average grade calculations, and updated arrays.

---

#### **Example Run**

```
Enter grades for 10 students:
Grade 1: 85
Grade 2: 90
Grade 3: 78
Grade 4: 92
Grade 5: 88
Grade 6: 76
Grade 7: 95
Grade 8: 89
Grade 9: 80
Grade 10: 84

MENU:
1. Find Highest Grade
2. Find Lowest Grade
3. Calculate Average Grade
4. Search for a Grade
5. Update a Grade
6. Exit

Choose an option: 1
Highest Grade: 95

Choose an option: 2
Lowest Grade: 76

Choose an option: 3
Average Grade: 85.7

Choose an option: 4
Enter grade to search: 92
Grade found.

Choose an option: 5
Enter index to update (0-9): 2
Enter new grade: 100
Grade updated.

Choose an option: 6
Program terminated.
```

---

#### **Constraints**
- The array size is fixed at **10**.
- Grades must be entered as integers.
- The index for updating grades should be between **0 and 9** (inclusive).

---

### Notes

```java
int sum = 1;
int count = 3;
double average = (double) sum / count;
```

```java
while (true) {
    if (condition) {
        break;
    }
}
```