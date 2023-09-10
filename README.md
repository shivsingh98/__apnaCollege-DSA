# Arrays :

Array is a list of element of the <mark>same</mark> type placed in a <mark>contiguous</mark> memory location.

- In java array indexing starts from 0 (zero).
- In memory every part of 1 byte.
- In java you can assume char takes 1 byte for simplicity.But Java char takes up 2 bytes in memory.
- type of Arrays is <mark> static </mark> means you can not change size in runtime.
- In Array default value:
  - int ==> 0
  - float ==> 0.0
  - String ==> ""
  - char ==> ''
  - boolean ==> false

## Operations in Arrays :

- **Create**
- **Input**
- **Output**
- **Update**

### Creating Array

<mark>dataType</mark> arrayName[] = new <mark>dataType</mark>[size];

- here **new** keyword allocate location in memory for array.
- here **size** is the size of array.
- We can find the length of array using <mark>.length</mark> property.

```java
// creating an array

int marks[] = new int[50];

int numbers[] = {1, 2, 3};

int moreNumbers[] = {4, 5, 6};

Stringvfruits[] = {"apple", "mango", "orange"};

 // Input/output and update
         int marks[] = new int[50];

         Scanner sc = new Scanner(System.in);
        //  int phy;
        //  phy = sc.nextInt();

        marks[0] = sc.nextInt(); // phy
        marks[1] = sc.nextInt(); //che
        marks[2] = sc.nextInt();//math

        System.out.println("phy : " + marks[0]);
        System.out.println("che : " + marks[1]);

        marks[2] = marks[2] + 1;
        System.out.println("math : " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("percentage = " + percentage + "%");

        // length of array
        System.out.println(marks.length);
```
