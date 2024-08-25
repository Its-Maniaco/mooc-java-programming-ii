
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> nicks = new HashMap<>();
        nicks.put("matthew", "matt");
        nicks.put("michael", "mix");
        nicks.put("arthur", "artie");
        System.out.println(nicks.get("matthew"));
    }

}
