import modules.MyHashTable;
import modules.MyTestingClass;
import modules.Student;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, Student> table = new MyHashTable<>(100);

        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = rand.nextInt(100000);
            String name = "Name" + rand.nextInt(1000);
            MyTestingClass key = new MyTestingClass(id, name);

            String studentName = "Student" + i;
            int age = rand.nextInt(18, 30);
            Student value = new Student(studentName, age);

            table.put(key, value);
        }

        // Теперь всё очень легко:
        for (int i = 0; i < 100; i++) {
            System.out.println("Bucket " + i + ": " + table.getChainLength(i) + " elements");
        }
    }
}
