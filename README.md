# 🚀 Data Structures and Algorithms in Java

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![DSA](https://img.shields.io/badge/DSA-Master-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-success?style=for-the-badge)

**Master the Art of Problem Solving** 💡

*A comprehensive, beautifully crafted guide to conquering Data Structures & Algorithms*

[🎯 Quick Start](#-getting-started) • [📚 Learn](#-data-structures) • [🧠 Practice](#-algorithms) • [🏆 Contribute](#-contributing)

---

</div>

## 🌟 Why This Guide?

> **"The best time to learn DSA was yesterday. The second best time is NOW!"** ⏰

- ✅ **Complete Coverage** - From basics to advanced topics
- ✅ **Visual Learning** - Clear explanations with complexity analysis
- ✅ **Interview Ready** - Crack FAANG interviews with confidence
- ✅ **Real-world Applications** - Understand where to use what
- ✅ **Java Powered** - Industry-standard implementations

---

## 📖 Table of Contents

- [🎯 Getting Started](#-getting-started)
- [📦 Data Structures](#-data-structures)
- [🧮 Algorithms](#-algorithms)
- [⚡ Complexity Analysis](#-complexity-analysis)
- [💎 Best Practices](#-best-practices)
- [🎓 Resources](#-resources)

---

## 🎯 Getting Started

### Prerequisites 📋

```java
☑️ Java Development Kit (JDK) 8+
☑️ Passion for Problem Solving
☑️ Coffee ☕ (Optional but Recommended)
```

### Quick Setup 🛠️

```bash
# Clone the repository
git clone https://github.com/yourusername/java-dsa

# Compile and run
javac YourDataStructure.java
java YourDataStructure
```

---

## 📦 Data Structures

<details open>
<summary><h3>🔢 Arrays - The Foundation</h3></summary>

> Fixed-size sequential collection of elements stored in contiguous memory

**⚡ Performance**
- Access: `O(1)` 🟢
- Search: `O(n)` 🟡
- Insert: `O(n)` 🟡
- Delete: `O(n)` 🟡

**🎯 Use Cases**
- 📊 Storing fixed-size data
- 🧱 Building other data structures
- 🎲 Matrix operations

```java
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(numbers[0]); // O(1) access!
```

</details>

<details>
<summary><h3>🔗 Linked Lists - Dynamic Chains</h3></summary>

> Linear collection where elements link to each other through pointers

**📌 Types**
- ➡️ Singly Linked List
- ⬅️➡️ Doubly Linked List
- 🔄 Circular Linked List

**⚡ Performance**
- Access: `O(n)` 🟡
- Search: `O(n)` 🟡
- Insert (head): `O(1)` 🟢
- Delete (head): `O(1)` 🟢

**🎯 Use Cases**
- 🎵 Music playlists
- 🌐 Browser history (back/forward)
- 💾 Memory management

</details>

<details>
<summary><h3>📚 Stacks - LIFO Magic</h3></summary>

> Last In, First Out - Like a stack of plates! 🍽️

**⚡ Performance**
- Push: `O(1)` 🟢
- Pop: `O(1)` 🟢
- Peek: `O(1)` 🟢

**🎯 Use Cases**
- ↩️ Undo/Redo functionality
- 🔙 Function call stack
- 🧮 Expression evaluation
- 🏃 Backtracking algorithms

**🎨 Visual**
```
    [3] ← Top
    [2]
    [1]
    ━━━
```

</details>

<details>
<summary><h3>🎫 Queues - FIFO Fairness</h3></summary>

> First In, First Out - Like a ticket line! 🎟️

**📌 Types**
- ➡️ Simple Queue
- 🔄 Circular Queue
- ⭐ Priority Queue
- ⬅️➡️ Deque (Double-Ended)

**⚡ Performance**
- Enqueue: `O(1)` 🟢
- Dequeue: `O(1)` 🟢

**🎯 Use Cases**
- 🖨️ Print job management
- 🎮 Game turn systems
- 🌊 BFS algorithms
- 💼 Task scheduling

</details>

<details>
<summary><h3>🗂️ Hash Tables - Lightning Fast Lookup</h3></summary>

> Key-value pairs with O(1) average access time! ⚡

**⚡ Performance**
- Insert: `O(1)` avg 🟢
- Delete: `O(1)` avg 🟢
- Search: `O(1)` avg 🟢

**🔧 Collision Resolution**
- 🔗 Chaining (Linked Lists)
- 📍 Open Addressing (Probing)

**🎯 Use Cases**
- 🗄️ Database indexing
- 💾 Caching systems
- 🔍 Fast lookups
- 📊 Frequency counting

</details>

<details>
<summary><h3>🌳 Trees - Hierarchical Power</h3></summary>

#### 🌲 Binary Trees

> Each node has at most 2 children

**🔄 Traversals**
- 📍 Inorder (Left → Root → Right)
- 📍 Preorder (Root → Left → Right)
- 📍 Postorder (Left → Right → Root)
- 📍 Level Order (BFS)

#### 🎯 Binary Search Trees (BST)

> Left < Parent < Right

**⚡ Performance**
- Search: `O(log n)` avg 🟢
- Insert: `O(log n)` avg 🟢
- Delete: `O(log n)` avg 🟢

#### ⚖️ AVL Trees - Self Balancing

> Height difference ≤ 1 for all nodes

**🔄 Rotations**
- ↰ Left-Left (LL)
- ↱ Right-Right (RR)
- ↰↱ Left-Right (LR)
- ↱↰ Right-Left (RL)

#### 🔴⚫ Red-Black Trees

> Self-balancing with color properties

**📏 Properties**
- ✅ Root is always black
- ✅ Red nodes → Black children
- ✅ Same black height on all paths

**🎯 Use Cases**
- 🗺️ TreeMap in Java
- 📦 TreeSet in Java
- 🗃️ Database implementations

</details>

<details>
<summary><h3>🏔️ Heaps - Priority Management</h3></summary>

> Complete binary tree with heap property

**📌 Types**
- ⬆️ Max Heap (Parent ≥ Children)
- ⬇️ Min Heap (Parent ≤ Children)

**⚡ Performance**
- Insert: `O(log n)` 🟢
- Extract: `O(log n)` 🟢
- Peek: `O(1)` 🟢
- Heapify: `O(n)` 🟢

**🎯 Use Cases**
- ⭐ Priority Queues
- 📊 Heap Sort
- 🔝 K largest/smallest elements
- 📈 Median maintenance

</details>

<details>
<summary><h3>🕸️ Graphs - Network of Connections</h3></summary>

> Vertices connected by edges - model anything! 🌐

**📌 Types**
- ➡️ Directed (Digraph)
- ↔️ Undirected
- ⚖️ Weighted
- 🎯 Unweighted

**💾 Representations**
- 📊 Adjacency Matrix: `O(V²)` space
- 📝 Adjacency List: `O(V + E)` space
- 🔗 Edge List

**🎯 Use Cases**
- 👥 Social networks
- 🗺️ Maps & navigation
- 🌐 Web crawlers
- 🎬 Recommendation systems
- 🔌 Network topology

</details>

<details>
<summary><h3>🌿 Tries - Prefix Trees</h3></summary>

> Tree for storing strings efficiently

**⚡ Performance**
- Insert: `O(m)` where m = string length
- Search: `O(m)` 🟢
- Prefix Search: `O(m)` 🟢

**🎯 Use Cases**
- ⌨️ Autocomplete
- 📖 Spell checkers
- 🔍 Dictionary implementations
- 🌐 IP routing

</details>

<details>
<summary><h3>🎯 Advanced Structures</h3></summary>

#### 📊 Segment Trees
- Range queries: `O(log n)` 🟢
- Point updates: `O(log n)` 🟢

#### 🤝 Disjoint Set Union (Union-Find)
- Find: `O(α(n))` ≈ `O(1)` 🟢
- Union: `O(α(n))` ≈ `O(1)` 🟢

</details>

---

## 🧮 Algorithms

### 🔄 Sorting Algorithms

<table>
<tr>
<th>Algorithm</th>
<th>Time (Avg)</th>
<th>Time (Worst)</th>
<th>Space</th>
<th>Stable?</th>
</tr>
<tr>
<td>🫧 Bubble Sort</td>
<td>O(n²)</td>
<td>O(n²)</td>
<td>O(1)</td>
<td>✅</td>
</tr>
<tr>
<td>🎯 Selection Sort</td>
<td>O(n²)</td>
<td>O(n²)</td>
<td>O(1)</td>
<td>❌</td>
</tr>
<tr>
<td>📌 Insertion Sort</td>
<td>O(n²)</td>
<td>O(n²)</td>
<td>O(1)</td>
<td>✅</td>
</tr>
<tr>
<td>🔀 Merge Sort</td>
<td>O(n log n)</td>
<td>O(n log n)</td>
<td>O(n)</td>
<td>✅</td>
</tr>
<tr>
<td>⚡ Quick Sort</td>
<td>O(n log n)</td>
<td>O(n²)</td>
<td>O(log n)</td>
<td>❌</td>
</tr>
<tr>
<td>🏔️ Heap Sort</td>
<td>O(n log n)</td>
<td>O(n log n)</td>
<td>O(1)</td>
<td>❌</td>
</tr>
<tr>
<td>🔢 Counting Sort</td>
<td>O(n + k)</td>
<td>O(n + k)</td>
<td>O(k)</td>
<td>✅</td>
</tr>
<tr>
<td>🎯 Radix Sort</td>
<td>O(d × n)</td>
<td>O(d × n)</td>
<td>O(n + k)</td>
<td>✅</td>
</tr>
</table>

---

### 🔍 Searching Algorithms

| Algorithm | Time | Space | Best For |
|-----------|------|-------|----------|
| 📍 Linear Search | O(n) | O(1) | Unsorted data |
| 🎯 Binary Search | O(log n) | O(1) | Sorted arrays |
| 🦘 Jump Search | O(√n) | O(1) | Sorted arrays |
| 📐 Interpolation | O(log log n) | O(1) | Uniform distribution |
| 🔺 Ternary Search | O(log₃ n) | O(1) | Unimodal functions |

---

### 🗺️ Graph Algorithms

<details>
<summary><h4>🌊 Breadth-First Search (BFS)</h4></summary>

**⏱️ Time:** `O(V + E)`  
**💾 Space:** `O(V)`

**🎯 Perfect For:**
- 🎯 Shortest path (unweighted)
- 🌊 Level-order traversal
- 🎮 Finding connected components

```java
// Explore level by level - like ripples in water! 🌊
```

</details>

<details>
<summary><h4>🏊 Depth-First Search (DFS)</h4></summary>

**⏱️ Time:** `O(V + E)`  
**💾 Space:** `O(V)`

**🎯 Perfect For:**
- 🔍 Cycle detection
- 📋 Topological sorting
- 🧩 Solving mazes
- 🌳 Finding paths

```java
// Explore as deep as possible first! 🏊‍♂️
```

</details>

<details>
<summary><h4>🛣️ Shortest Path Algorithms</h4></summary>

#### 🎯 Dijkstra's Algorithm
- **Time:** `O((V + E) log V)`
- **Use:** Non-negative weights
- **Perfect for:** GPS navigation 🗺️

#### ⚡ Bellman-Ford Algorithm
- **Time:** `O(V × E)`
- **Use:** Negative weights allowed
- **Bonus:** Detects negative cycles! 🔄

#### 🌐 Floyd-Warshall Algorithm
- **Time:** `O(V³)`
- **Use:** All-pairs shortest path
- **Perfect for:** Distance matrices

</details>

<details>
<summary><h4>🌳 Minimum Spanning Tree</h4></summary>

#### 🔗 Kruskal's Algorithm
- **Time:** `O(E log E)`
- **Approach:** Edge-based (sort & union)
- **Uses:** Union-Find data structure

#### 🌲 Prim's Algorithm
- **Time:** `O((V + E) log V)`
- **Approach:** Vertex-based (greedy)
- **Perfect for:** Dense graphs

</details>

---

### 💎 Dynamic Programming

> **"Those who cannot remember the past are condemned to repeat it!"** - But not in DP! 😎

**🔑 Key Concepts**
- 🔄 Overlapping Subproblems
- ⭐ Optimal Substructure
- 📝 Memoization (Top-Down)
- 📊 Tabulation (Bottom-Up)

**🏆 Classic Problems**

| Problem | Difficulty | Application |
|---------|-----------|-------------|
| 🐰 Fibonacci | ⭐ Easy | Introduction to DP |
| 📏 LCS | ⭐⭐ Medium | DNA sequencing |
| 📈 LIS | ⭐⭐ Medium | Stock prices |
| 🎒 Knapsack | ⭐⭐⭐ Hard | Resource allocation |
| ⛓️ Matrix Chain | ⭐⭐⭐ Hard | Optimization |
| ✏️ Edit Distance | ⭐⭐ Medium | Spell checkers |
| 💰 Coin Change | ⭐⭐ Medium | Currency systems |

---

### 🎯 Greedy Algorithms

> **Make the best choice NOW!** 💪

**✨ Characteristics**
- ✅ Locally optimal choice
- ⚡ Fast and efficient
- ❌ Not always globally optimal

**🏆 Classic Problems**
- ⏰ Activity Selection
- 🌳 Huffman Coding
- 💰 Fractional Knapsack
- 💼 Job Sequencing
- 🚂 Minimum Platforms

---

### 🔙 Backtracking

> **Try, fail, learn, retry!** 🎯

**🔄 Strategy**
1. Build solution incrementally
2. Check if valid
3. If invalid → Backtrack!
4. Try next possibility

**🏆 Classic Problems**

```
♛ N-Queens Problem        🎲 Sudoku Solver
🐭 Rat in a Maze          🎨 Graph Coloring
🚶 Hamiltonian Path       🧩 Subset Sum
```

---

### 🔀 Divide and Conquer

> **Divide → Conquer → Combine** 🎯

**📋 Strategy**
1. ✂️ Divide problem into subproblems
2. ⚔️ Conquer by solving recursively
3. 🔗 Combine the solutions

**🌟 Examples**
- 🔀 Merge Sort
- ⚡ Quick Sort
- 🎯 Binary Search
- 📊 Strassen's Matrix Multiplication
- 📍 Closest Pair of Points

---

### 🔤 String Algorithms

#### 🔍 Pattern Matching

| Algorithm | Time | Space | Best For |
|-----------|------|-------|----------|
| 🐌 Naive | O(n×m) | O(1) | Small patterns |
| ⚡ KMP | O(n+m) | O(m) | General purpose |
| 🎲 Rabin-Karp | O(n+m) | O(1) | Multiple patterns |
| 🚀 Boyer-Moore | O(n/m) | O(m) | Large alphabets |

#### 🎨 String Tricks
- 🔄 Palindrome checking
- 🔀 Anagram detection
- ↩️ String reversal
- 📏 Longest common subsequence

---

### 🔢 Bit Manipulation

> **Work with bits - be a wizard!** 🧙‍♂️

**⚙️ Common Operations**
```java
& AND    | OR    ^ XOR    ~ NOT
<< Left Shift    >> Right Shift
```

**✨ Magic Tricks**
- 🎯 Check if power of 2: `n & (n-1) == 0`
- 🔢 Count set bits
- 🔄 Swap without temp variable
- ⚡ Fast multiplication/division by 2

**🎯 Use Cases**
- 💾 Space optimization
- ⚡ Fast operations
- 🔐 Cryptography
- 🎮 Graphics programming

---

## ⚡ Complexity Analysis

### ⏱️ Time Complexity Cheat Sheet

```
O(1)      ⚡⚡⚡⚡⚡  Instant!        Hash lookup, array access
O(log n)  ⚡⚡⚡⚡   Super fast     Binary search, balanced trees
O(n)      ⚡⚡⚡     Fast           Linear search, simple loops
O(n log n)⚡⚡      Good           Merge sort, heap sort
O(n²)     ⚡        Slow           Nested loops, bubble sort
O(2ⁿ)     🐌        Very slow      Recursive fibonacci
O(n!)     🐌🐌      Extremely slow Permutations
```

### 📊 Visual Complexity

```
Runtime ↑
   |           
   |                                    ⚠️ O(n!)
   |                              ⚠️ O(2ⁿ)
   |                         🟡 O(n²)
   |                    🟢 O(n log n)
   |              🟢 O(n)
   |         🟢 O(log n)
   |    🟢 O(1)
   |_________________________→ Input Size
```

---

## 💎 Best Practices

### 🎯 Choosing the Right Structure

```
Need fast access by index?        → 🔢 Array
Frequent insertions/deletions?    → 🔗 Linked List
Need fast lookup?                 → 🗂️ Hash Table
Need sorted data?                 → 🌳 BST/TreeMap
Need min/max quickly?             → 🏔️ Heap
Need to model relationships?      → 🕸️ Graph
```

### 💻 Code Quality Checklist

- [ ] ✅ Clean, readable code
- [ ] 📝 Meaningful variable names
- [ ] 💬 Comments for complex logic
- [ ] 🎯 Handle edge cases
- [ ] 🧪 Test thoroughly
- [ ] ⚡ Optimize after correctness

### 🎓 Interview Preparation

```java
// The UMPIRE Approach
✅ Understand the problem
✅ Match with patterns
✅ Plan your approach
✅ Implement your solution
✅ Review and test
✅ Evaluate time/space complexity
```

**📅 Daily Practice Plan**
- Week 1-2: Arrays & Strings 📝
- Week 3-4: Linked Lists & Stacks/Queues 🔗
- Week 5-6: Trees & Graphs 🌳
- Week 7-8: Dynamic Programming 💎
- Week 9-10: Advanced Topics 🚀

---

## 🎓 Resources

### 📚 Must-Read Books

| Book | Author | Level |
|------|--------|-------|
| 📘 Introduction to Algorithms | CLRS | Advanced |
| 📗 Cracking the Coding Interview | Gayle Laakmann | Interview Prep |
| 📙 Data Structures in Java | Robert Lafore | Beginner |

### 🌐 Online Platforms

```
🏆 LeetCode       - Practice problems (Easy → Hard)
💻 HackerRank     - Compete & learn
🎯 CodeForces     - Competitive programming
📖 GeeksforGeeks  - Tutorials & practice
🎓 Coursera       - Structured courses
```

### 🛠️ Java Collections Framework

| Interface | Implementation | When to Use |
|-----------|---------------|-------------|
| List | ArrayList 📋 | Random access |
| List | LinkedList 🔗 | Insertions |
| Set | HashSet 🗂️ | Unique + Fast |
| Set | TreeSet 🌳 | Unique + Sorted |
| Map | HashMap 🗄️ | Key-value pairs |
| Map | TreeMap 🗺️ | Sorted keys |
| Queue | PriorityQueue ⭐ | Priority-based |

---

## 🏆 Contributing

We ❤️ contributions! Here's how you can help:

1. 🍴 Fork the repository
2. 🌿 Create a feature branch
   ```bash
   git checkout -b feature/AmazingFeature
   ```
3. 💻 Add your awesome code
4. ✅ Commit your changes
   ```bash
   git commit -m '✨ Add some AmazingFeature'
   ```
5. 📤 Push to the branch
   ```bash
   git push origin feature/AmazingFeature
   ```
6. 🎉 Open a Pull Request

### 📝 Contribution Guidelines

- ✅ Add detailed comments
- ✅ Include complexity analysis
- ✅ Follow Java naming conventions
- ✅ Test your code thoroughly
- ✅ Update documentation

---

## 📜 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 🙏 Acknowledgments

```
💖 Thanks to the amazing CS community
🌟 Inspired by thousands of problem solvers
🚀 Built with passion for learning
```

---

## 💬 Connect & Support

<div align="center">

**Found this helpful? Give it a ⭐!**
<!--
[![GitHub Stars](https://img.shields.io/github/stars/yourusername/java-dsa?style=social)](https://github.com/yourusername/java-dsa)
[![Follow](https://img.shields.io/github/followers/yourusername?style=social)](https://github.com/yourusername) -->

**Questions? Reach out!** 📧

[💼 LinkedIn](https://linkedin.com/in/shashank-soni815) • [🐦 Twitter](https://twitter.com/yourhandle) • [📧 Email](mailto:shashanksoni815@gmail.com)

---

**Made with ❤️ and lots of ☕**

**Last Updated:** December 2025 📅

---

### 📈 Journey to Mastery

```
Beginner → Intermediate → Advanced → Expert → Master
   🌱         🌿           🌳          🏆        👑
```

**Remember:** *"The expert in anything was once a beginner!"* 

Keep coding! Keep growing! 🚀✨

</div>
