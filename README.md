📘 Algorithms and Data Structures assignment 3

This repository contains two custom implementations of essential data structures in Java:

✅ MyHashTable<K, V> – A hash table using separate chaining

✅ BST<K, V> – A binary search tree with in-order iteration and key-value traversal

Both classes are fully generic and demonstrate understanding of low-level data structure mechanics without relying on Java's built-in collections.

🔧 Features
🔹 MyHashTable<K, V>
✅ Separate chaining with linked lists

✅ Generic key-value pairs

✅ Custom key class with user-defined hashCode() (no Objects.hash())

✅ Methods:

put(K key, V value)

get(K key)

remove(K key)

contains(V value)

getKey(V value)

getChainLength(int index) — for distribution testing

🔹 BST<K, V>
✅ Generic Binary Search Tree

✅ Node deletion with two-child handling (successor replacement)

✅ In-order iterator returns custom Entry<K, V> objects

✅ Tracks size of tree dynamically

✅ Methods:

put(K key, V value)

get(K key)

delete(K key)

size()

iterator() → allows for-each access to keys & values

🧪 Testing
Hash Table
Inserted 10,000 random key-value pairs using a custom MyTestingClass

Verified uniform distribution of hash buckets

Tuned custom hashCode() for balanced spread

Binary Search Tree
Inserted multiple keys, including duplicates and edge values

Validated:

correct in-order traversal

dynamic size tracking

correctness of node deletion (including root & nodes with two children)

