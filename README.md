# Problem Statement

The NEU Library offers a variety of resources, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

# UML Class Diagram
![Capture](https://github.com/Nayunnie1/SOLIDwithDesignPattern/assets/58744536/0e882b3b-899b-4701-8c96-a4eafbf5a910)
