import spark.Spark;

public class KeepAlive {
    public static void keepAlive() {
        Spark.port(8080);
        Spark.get("/", (req, res) -> "Bot is alive!");
    }
}
