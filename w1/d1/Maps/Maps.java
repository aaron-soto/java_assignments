
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Maps {
    public void trackList() {
        HashMap<String, String> trackListMap = new HashMap<String, String>();

        trackListMap.put("Yankee Doodle", "Yankee doodle wentto town, riding on a pony.");
        trackListMap.put("Twinkle Twinkle Little Star", "Twinkle Twinkle Little Star, how I wonder what you are.");
        trackListMap.put("Old Mcdonald", "Old McDonald had a farm, EIEIO.");
        trackListMap.put("B.I.N.G.O", "And Bingo was his Name-O.");

        Set<String> keys = trackListMap.keySet();
        for (String key : keys) {
            System.out.println("Track: " + key + " | Lyrics: " + trackListMap.get(key));
            
        }
        String result = "";
        result = trackListMap.entrySet().stream().filter(map -> "Old Mcdonald".equals(map.getKey())).map(map -> map.getKey()).collect(Collectors.joining());
        
    }
}