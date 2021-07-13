package tests;

import Utilities.Utilities;
import views.IOManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IOManagerTest  {

    public static void main(String[] args) {
        IOManager io = new IOManager();

        Map<String, Integer> sampleList = new HashMap<String, Integer>();
        sampleList.put("funcional",2);
        sampleList.put("paradigmas",4);
        sampleList.put("modular",2);
        sampleList.put("programación",6);
        sampleList.put("de",3);
        sampleList.put("estructurada",3);

        List<Map.Entry<String, Integer>> resultList = new ArrayList<>(sampleList.entrySet());

        io.printResult(resultList); // Print correctly

        String sampleText = "Paradigmas de programación"+
                "1 - Programación estructurada" +
                "2 - Programación modular" +
                "3 - Programación funcional";
        String[] expected = new String[]{"paradigmas", "de", "programación", "programación", "estructurada","programación", "modular","programación", "funcional"};
        String[] resultText = Utilities.extractWords(sampleText);

        for (int i = 0; i < expected.length; i++) {
            System.out.println("Esperada: "+expected[i]+ ". Obtenida: "+resultText[i]);
        }

    }

}
