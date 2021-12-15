import dev.ssdd.zot.JSONObject;

public class Main {
    public static void main(String[] args) {
        JSONObject j = new JSONObject();
        for (int i = 0; i < 10; i++) {
            j.put(String.valueOf(System.currentTimeMillis()),i);
            try {
                System.out.println(j);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
