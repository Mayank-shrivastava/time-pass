import java.util.concurrent.CompletableFuture;

public class App {
    public static int compute(int n) {
        return n * 4;
    }

    public static CompletableFuture<Integer> create(int n) {
        return CompletableFuture.supplyAsync(() -> compute(n));
    }

    public static void main(String[] args) throws Exception {
        create(4)
                .thenAcceptAsync(System.out::println);
    }
}
