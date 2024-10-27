package DataType;

// Data Types are divided into two group:
//  1. Primitive     - byte,short,int,long,float,double,boolean and char.
//  2. Non-Primitive - Class, Array, String, Enums and Records.

import java.util.*;

public class DataType {

    // There are 8 primitive types: byte, short, int, long, char, float, double, boolean.
    void displayPrimitive(){
        // byte
        byte smallNumber = 100; // -128  to 127
        System.out.println("Byte value: " + smallNumber);

        // short
        short mediumNumber = 30000; //  -32,768 to 32,767
        System.out.println("Short value: " + mediumNumber);

        // int
        int normalNumber = 150000; // -2,147,483,648 to 2,147,483,647
        System.out.println("Int value: " + normalNumber);

        // long
        long largeNumber = 3000000000L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println("Long value: " + largeNumber);

        // char
        char letter = 'A'; //  0 to 65,535
        System.out.println("Char value: " + letter);

        // float
        float decimalNumber = 3.14f; //  ±3.40282347E+38 (6-7 decimal digits of precision)
        System.out.println("Float value: " + decimalNumber);

        // double
        double largeDecimalNumber = 3.141592653589793; // ±1.79769313486231570E+308 (15 decimal digits of precision)
        System.out.println("Double value: " + largeDecimalNumber);

        // boolean
        boolean isJavaFun = true; //true / false value
        System.out.println("Boolean value: " + isJavaFun);

    }


    // Non-Primitive used to lưu trữ or nhóm các giá trị lại với nhau:
    // 1. Class
    // -> kiểu dữ liệu cơ bản trong lập trình OOP.
    public static class Company{
        static int displayInfo() {
              return 0;
             }
    }
    public void createInnerClass() {
        int value = Company.displayInfo();
    }


    // 2. Interface
    // -> định nghĩa một tập hợp các phương thức mà một lớp phải triển khai.
    // -> các thuộc tính và hành động của CHIM phải theo PARTTEN là bay
    interface Bird {
        void fly();
    }

    class Eagle implements Bird {
        @Override
        public void fly() {
            System.out.println("Vỗ Cánh");
        }
    }

    // Array
    // là 1 tập hợp các phần tử có cùng kiểu dữ liệu.
    int[] numbers = {1, 2, 3, 4, 5};

    // String
    // Kiểu dữ liệu chuỗi được sử dụng để lưu trữ chuỗi ký tự.
    // Chuỗi trong Java là 1 đối tượng
    String greeting = "Hello, world!";

    // Collections
    //  cung cấp các cấu trúc dữ liệu để lưu trữ và quản lý nhóm các đối tượng.
    // Java cung cấp các lớp và giao diện trong java.util  - Java Collections Framework
    // -> để làm việc với tập hợp dữ liệu, như ArrayList, HashSet, HashMap
  void createCollection(){

      // List interface
      List<String> myList = new ArrayList<>();
      myList.add("Hello");
      myList.add("World");

      // LinkedList
      // Tạo một LinkedList để lưu trữ tên
      LinkedList<String> names = new LinkedList<>();
      names.add("Charlie");
      System.out.println("Names: " + names);
      // Thêm phần tử vào đầu danh sách
      names.addFirst("David");
      System.out.println("After adding David at the beginning: " + names);
      // Truy cập phần tử
      String firstName = names.get(0);
      System.out.println("First name: " + firstName);


      // Map interface
      // Map là một cấu trúc dữ liệu lưu trữ cặp key-value
      // Một số lớp thực hiện Map: 1. HashMap - 2. LinkedHashMap  - 3. TreeMap:

      // 1. HashMap:
      // - "Sử dụng 1 bảng hash để lưu trữ các cặp key-value. Không đảm bảo thứ tự của các phần tử."
      Map<String, String> ListStudentJsons = new HashMap<>();
      ListStudentJsons.put("Name","ATus");
      ListStudentJsons.put("School","Harvard");
      System.out.println("ListStudentJsons" + ListStudentJsons);

      // 2. LinkedHashMap:
      // - " Giống như HashMap, nhưng giữ thứ tự chèn của các phần tử."
      // Tạo một LinkedHashMap để lưu trữ tên và tuổi
      LinkedHashMap<String, Integer> people = new LinkedHashMap<>();
      // Thêm cặp key-value vào LinkedHashMap
      people.put("Alice", 30);
      people.put("Bob", 25);
      people.put("Charlie", 35);
      people.put("David", 28);
      // In LinkedHashMap
      System.out.println("People: " + people);

      // Truy cập giá trị bằng khóa
      int ageOfAlice = people.get("Alice");
      System.out.println("Alice's age: " + ageOfAlice);





      // 3. TreeMap: Sắp xếp các phần tử theo thứ tự tự nhiên của khóa

    }




}
