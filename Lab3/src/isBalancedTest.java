import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class isBalancedTest {
    @Test
    void testEmptyExpression() {
        assertTrue(isBalanced.isBalanced(""));
    }

    @Test
    void testBalancedParentheses() {
        assertTrue(isBalanced.isBalanced("()"));
        assertTrue(isBalanced.isBalanced("([])"));
        assertTrue(isBalanced.isBalanced("{{}}"));

        // Test with multiple brackets and different orders
        assertTrue(isBalanced.isBalanced("([{{}}])"));
        assertTrue(isBalanced.isBalanced("{{[]}}()"));

        // Ensure the stack is not empty for balanced expressions
        assertTrue(isBalanced.isBalanced("()[]{{}}"));
        assertTrue(isBalanced.isBalanced("([{{}}])"));
        assertTrue(isBalanced.isBalanced("{{[]}}()"));
    }


    // Tests for isOpen, isClose, and areMatching
    @Test
    void testIsOpen() {
        assertTrue(isBalanced.isOpen('('));
        assertTrue(isBalanced.isOpen('{'));
        assertTrue(isBalanced.isOpen('['));
        assertFalse(isBalanced.isOpen(')'));
        assertFalse(isBalanced.isOpen('}'));
        assertFalse(isBalanced.isOpen(']'));
    }

    @Test
    void testIsClose() {
        assertTrue(isBalanced.isClose(')'));
        assertTrue(isBalanced.isClose('}'));
        assertTrue(isBalanced.isClose(']'));
        assertFalse(isBalanced.isClose('('));
        assertFalse(isBalanced.isClose('{'));
        assertFalse(isBalanced.isClose('['));
    }

    @Test
    void testAreMatching() {
        assertTrue(isBalanced.areMatching('(', ')'));
        assertTrue(isBalanced.areMatching('{', '}'));
        assertTrue(isBalanced.areMatching('[', ']'));
        assertFalse(isBalanced.areMatching('(', ']'));
        assertFalse(isBalanced.areMatching('{', ')'));
        assertFalse(isBalanced.areMatching('[', '}'));
    }
}