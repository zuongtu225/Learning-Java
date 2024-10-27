package Method;

public class Method {
    public  Method(){
//    Static Methods
//        được gọi mà không cần tạo một đối tượng của lớp.
        class MathUtils {
            static int add(int a, int b) { // Phương thức tĩnh
                return a + b;
            }
        }

//        public class Main {
//            public static void main(String[] args) {
//                int sum = MathUtils.add(5, 10); // Gọi phương thức tĩnh mà không cần tạo đối tượng
//                System.out.println("Sum: " + sum); // In ra: Sum: 15
//            }
//        }
    }
}
