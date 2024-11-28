Data Structures and Algorithms (DSA) Repository
This repository contains my solutions to various problems in Data Structures and Algorithms (DSA). It is aimed at providing a comprehensive collection of coding problems, algorithmic challenges, and solutions, showcasing my proficiency and understanding of core DSA concepts.

The repository is organized into multiple directories, each focusing on a specific data structure or algorithm. It serves as both a personal learning resource and a reference for anyone looking to improve their understanding of DSA.

Repository Structure:
/Arrays: Contains problems and solutions related to arrays, including sorting, searching, and manipulation techniques.
/Linked-Lists: Includes implementations of singly linked lists, doubly linked lists, and various algorithms on lists.
/Stacks-and-Queues: Problems related to stack and queue data structures, including applications like parenthesis matching, balancing symbols, and more.
/Trees: Covers binary trees, binary search trees, AVL trees, heaps, and various tree traversals and algorithms.
/Graphs: Graph-related problems and algorithms, including depth-first search (DFS), breadth-first search (BFS), and shortest path algorithms like Dijkstra and Floyd-Warshall.
/Dynamic-Programming: Includes a variety of dynamic programming problems that involve optimization, recursive problem-solving techniques, and tabulation/memoization methods.
/Backtracking: Solves problems involving backtracking techniques, including N-Queens, Sudoku solver, and permutation generation.
/Sorting-and-Searching: A collection of different sorting algorithms (QuickSort, MergeSort, BubbleSort) and searching techniques (binary search, linear search).
/Greedy-Algorithms: Focuses on greedy algorithms to solve optimization problems, such as interval scheduling, coin change problem, and Huffman coding.
/Strings: String manipulation problems, pattern matching algorithms, and string searching algorithms.
/Mathematics: Algorithms related to number theory, prime numbers, GCD, and other mathematical problems.
Languages and Technologies Used:
C++
Python
Java
JavaScript
SQL (for database-related problems)
Key Topics Covered:
Time Complexity and Space Complexity Analysis

Understanding Big-O notation for evaluating algorithm performance.
Array Manipulation & Searching

Sorting, searching algorithms (like Binary Search), and array-related techniques.
Linked Lists & Recursion

Deep dive into linked list structures and their applications.
Stack & Queue Algorithms

Applications like depth-first search (DFS), breadth-first search (BFS), and balanced parentheses problems.
Tree Traversals

Preorder, inorder, postorder traversals, and Binary Search Tree (BST) algorithms.
Graph Theory

Shortest path algorithms (Dijkstra, Bellman-Ford), and graph traversals (BFS, DFS).
Dynamic Programming

Solving optimization problems using memoization and tabulation techniques.
Greedy Algorithms

Solving problems that require making locally optimal choices.
Backtracking Algorithms

Solving problems like N-Queens and Sudoku solver using backtracking.
String Algorithms

Regular expressions, pattern matching, and string searching algorithms like KMP, Rabin-Karp.
Mathematical Algorithms

Solving number theory problems, prime number generation, and modular arithmetic.
How to Use This Repository:
Clone the repository to your local machine:
git clone https://github.com/yourusername/dsa.git
Navigate to the specific folder for the data structure or algorithm you want to explore.
Open the problem description and corresponding solution in your preferred IDE or text editor.
Feel free to submit pull requests or issues for improvements or questions.
Contributing:
Contributions are welcome! If you have any new problems or solutions related to data structures and algorithms, feel free to submit a pull request. Please follow the standard GitHub workflow for contributing:

Fork the repository.
Create a new branch.
Make your changes.
Submit a pull request.
Why This Repository Exists:
This repository is created with the intent of solving algorithmic problems, improving problem-solving skills, and sharing solutions with the community. The challenges are sourced from various competitive programming platforms, interview preparation websites, and coding challenges.

Related Resources:
LeetCode: LeetCode
Codeforces: Codeforces
HackerRank: HackerRank
GeeksforGeeks: GeeksforGeeks
Competitive Programming Handbook: [Link to resource]
Contact Information:
For any questions or issues regarding the repository, feel free to reach out via GitHub Issues or email me at demo12demoalterasonicalfa@myy.local-master.io






Valid Parentheses

Step-by-step approach:

Declare a character stack (say temp).
Now traverse the string exp. 
If the current character is a starting bracket ( ‘(‘ or ‘{‘  or ‘[‘ ) then push it to stack.
If the current character is a closing bracket ( ‘)’ or ‘}’ or ‘]’ ) then pop from the stack and if the popped character is the matching starting bracket then fine.
Else brackets are Not Balanced.
After complete traversal, if some starting brackets are left in the stack then the expression is Not balanced, else Balanced.
![Check-Valid-Parentheses - 1](https://github.com/user-attachments/assets/d6377b43-58f2-43c2-a58d-ca3d02dbc440)

