package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource("provideTestCasesAndSolutions")
    void testSolution(String input, List<String> expectedOutput) {

        List<String> result = solution.letterCombinations(input);
        assertEquals(expectedOutput, result);
    }

    private static Stream<Arguments> provideTestCasesAndSolutions() {

        return Stream.of(
                Arguments.of("23", List.of("ad","ae","af","bd","be","bf","cd","ce","cf")),
                Arguments.of("358",List.of("djt","dju", "djv", "dkt", "dku", "dkv", "dlt", "dlu", "dlv", "ejt", "eju", "ejv", "ekt", "eku", "ekv", "elt", "elu", "elv", "fjt", "fju", "fjv", "fkt", "fku", "fkv", "flt", "flu", "flv")),
                Arguments.of("", new ArrayList<>()),
                Arguments.of("2", List.of("a","b","c"))
        );
    }

}