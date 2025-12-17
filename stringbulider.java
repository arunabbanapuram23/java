public class stringbulider {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append(sb);
        System.out.println(sb.insert (4,"my name"));
        System.out.println(sb.delete(14,16));
        System.out.println(sb.reverse());
    }
}
