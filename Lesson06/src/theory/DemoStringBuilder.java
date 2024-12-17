package theory;

public class DemoStringBuilder {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append to the StringBuilder
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert at a specific index
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Replace part of the StringBuilder
        sb.replace(6, 8, "Java");
        System.out.println("After replace: " + sb);

        // Delete part of the StringBuilder
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        // Reverse the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Length and capacity
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

    }
}
