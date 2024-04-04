package org.tfoc.config;

import lombok.experimental.UtilityClass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@UtilityClass
public class PhoneKeysConfig {

    public Map<Integer, List<String>> getPhoneKeysMap() {

        Map<Integer, List<String>> keysMap = new HashMap<>();
        keysMap.put(2, List.of("a", "b", "c"));
        keysMap.put(3, List.of("d", "e", "f"));
        keysMap.put(4, List.of("g", "h", "i"));
        keysMap.put(5, List.of("j", "k", "l"));
        keysMap.put(6, List.of("m", "n", "o"));
        keysMap.put(7, List.of("p", "q", "r", "s"));
        keysMap.put(8, List.of("t", "u", "v"));
        keysMap.put(9, List.of("w", "x", "y", "z"));

        return keysMap;
    }
}
