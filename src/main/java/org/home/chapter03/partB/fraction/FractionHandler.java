package org.home.chapter03.partB.fraction;

import java.util.List;

public class FractionHandler {
    
    public void sumEven(List<Fraction> input) {
        
        for (int i = 2; i < input.size(); i += 2) {
            if (i != input.size() - 1) {
                int tempM = input.get(i).getM() * input.get(i + 1).getN() + input.get(i + 1).getM() * input.get(i).getN();
                int tempN = input.get(i).getN() * input.get(i + 1).getN();
                input.get(i).setM(tempM);
                input.get(i).setN(tempN);
            }
        }
    }
}
