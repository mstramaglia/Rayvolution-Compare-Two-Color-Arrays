import static org.junit.jupiter.api.Assertions.*;

class ColorArrayComparerTest {

    @org.junit.jupiter.api.Test
    void compareColorArrays_sameColorsSameOrder() {
        String[] test1a = {"Red", "Green", "Blue"};
        String[] test1b = {"Red", "Green", "Blue"};
        assertTrue(ColorArrayComparer.compareColorArrays(test1a, test1b));
    }

    @org.junit.jupiter.api.Test
    void compareColorArrays_caseInsensitiveMatch() {
        String[] test2a = {"red", "green"};
        String[] test2b = {"Red", "Green"};
        assertTrue(ColorArrayComparer.compareColorArrays(test2a, test2b));
    }

    @org.junit.jupiter.api.Test
    void compareColorArrays_differentOrderShouldFail() {
        String[] test3a = {"Blue", "Yellow"};
        String[] test3b = {"Yellow", "Blue"};
        assertFalse(ColorArrayComparer.compareColorArrays(test3a, test3b));
    }

    // --- Additional Suggested Tests ---

    @org.junit.jupiter.api.Test
    void compareColorArrays_differentLengths() {
        String[] colors1 = {"Red", "Green"};
        String[] colors2 = {"Red", "Green", "Blue"};
        assertFalse(ColorArrayComparer.compareColorArrays(colors1, colors2));
    }

    @org.junit.jupiter.api.Test
    void compareColorArrays_singleElementMatch() {
        String[] colors1 = {"Pink"};
        String[] colors2 = {"pink"};
        assertTrue(ColorArrayComparer.compareColorArrays(colors1, colors2));
    }

    @org.junit.jupiter.api.Test
    void compareColorArrays_singleElementMismatch() {
        String[] colors1 = {"Pink"};
        String[] colors2 = {"Purple"};
        assertFalse(ColorArrayComparer.compareColorArrays(colors1, colors2));
    }

    @org.junit.jupiter.api.Test
    void compareColorArrays_bothNullShouldReturnFalseOrTrueDependingOnSpec() {
        // Adjust based on your desired behavior
        assertFalse(ColorArrayComparer.compareColorArrays(null, null));
    }

    @org.junit.jupiter.api.Test
    void compareColorArrays_oneNullShouldReturnFalse() {
        String[] colors1 = {"Red", "Green"};
        assertFalse(ColorArrayComparer.compareColorArrays(colors1, null));
    }

    @org.junit.jupiter.api.Test
    void compareColorArrays_emptyArraysShouldMatch() {
        String[] colors1 = {};
        String[] colors2 = {};
        assertTrue(ColorArrayComparer.compareColorArrays(colors1, colors2));
    }

    @org.junit.jupiter.api.Test
    void compareColorArrays_whitespaceDifferencesShouldFailUnlessTrimmed() {
        String[] colors1 = {"Red ", "Green"};
        String[] colors2 = {"Red", "Green"};
        // Depending on whether you want to trim spaces in your implementation:
        assertFalse(ColorArrayComparer.compareColorArrays(colors1, colors2));
    }

    @org.junit.jupiter.api.Test
    void compareColorArrays_extraSpacesAndCaseInsensitiveShouldFailUnlessTrimmed() {
        String[] colors1 = {" red", "green "};
        String[] colors2 = {"Red", "Green"};
        assertFalse(ColorArrayComparer.compareColorArrays(colors1, colors2));
    }

    @org.junit.jupiter.api.Test
    void compareColorArrays_duplicateValues() {
        String[] colors1 = {"Red", "Red", "Green"};
        String[] colors2 = {"Red", "Red", "Green"};
        assertTrue(ColorArrayComparer.compareColorArrays(colors1, colors2));
    }

    @org.junit.jupiter.api.Test
    void compareColorArrays_differentDuplicatePatterns() {
        String[] colors1 = {"Red", "Green", "Red"};
        String[] colors2 = {"Red", "Red", "Green"};
        assertFalse(ColorArrayComparer.compareColorArrays(colors1, colors2));
    }
}
