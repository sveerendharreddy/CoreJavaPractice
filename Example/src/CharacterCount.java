import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

	public static void main(String[] args) {
		String input = "veerendhar";
		Map<String,Integer> resultMap = new HashMap<String,Integer>();
		String[] inputArray = input.split("");
		for(String inputLocal:inputArray) {
			if(resultMap.containsKey(inputLocal)) {
				Integer value = (Integer) resultMap.get(inputLocal);
				resultMap.put(inputLocal, ++value);
			}else {
				resultMap.put(inputLocal, 1);
			}
		}

		for(Map.Entry<String, Integer> entry:resultMap.entrySet()) {
			System.out.println("Character :"+entry.getKey()+" Count "+entry.getValue());
		}
	}

}
