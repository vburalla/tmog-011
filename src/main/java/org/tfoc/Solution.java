package org.tfoc;

import org.tfoc.config.PhoneKeysConfig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * The class containing the solution to this exercise
 */


public class Solution {

    private final Map<Integer, List<String>> phoneKeysMap;

    public Solution() {
        this.phoneKeysMap = PhoneKeysConfig.getPhoneKeysMap();
    }

    public List<String> letterCombinations(String digits) {
        if(!digits.isEmpty()) {
            if (digits.length() > 1) {
                List<String> combinations = phoneKeysMap.get(Character.getNumericValue(digits.charAt(0)));
                List<String> suffixes = letterCombinations(digits.substring(1));
                List<String> output = new ArrayList<>();
                for (String combination : combinations) {
                    for (String suffix : suffixes) {
                        output.add(combination + suffix);
                    }
                }
                return output;
            } else {
                return phoneKeysMap.get(Integer.valueOf(digits));
            }
        }
        return Collections.emptyList();
    }

}
