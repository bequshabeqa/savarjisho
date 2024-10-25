public class greet {
    public void main(String[] args) {
        System.out.println(greet("Hello", "Alice!", " ", ","));
//        System.out.println("შედეგი = " + greet() + ", " + greet1());
    }
    private class overload {
    }

    public String greet(String str1, String str2, String delimeter, String delimeter2) {
        return str1 + delimeter2 + delimeter + str2;
    }

//    public String greet() {
//        System.out.println("Hello!");
//        return "Hello";
//    }
//    public String greet1() {
//        System.out.println("Alice");
//        return "Alice!";
//    }

}
