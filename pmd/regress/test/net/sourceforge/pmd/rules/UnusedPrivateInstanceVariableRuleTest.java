/*
 * User: tom
 * Date: Jun 28, 2002
 * Time: 2:35:51 PM
 */
package test.net.sourceforge.pmd.rules;

import net.sourceforge.pmd.renderers.Renderer;
import net.sourceforge.pmd.RuleViolation;
import net.sourceforge.pmd.Report;
import net.sourceforge.pmd.rules.UnusedPrivateInstanceVariableRule;
import net.sourceforge.pmd.rules.UnusedLocalVariableRule;

import java.util.Iterator;

public class UnusedPrivateInstanceVariableRuleTest extends RuleTst {

    private UnusedPrivateInstanceVariableRule rule;

    public UnusedPrivateInstanceVariableRuleTest(String name) {
        super(name);
    }

    public void setUp() {
        rule = new UnusedPrivateInstanceVariableRule();
        rule.setMessage("Avoid this stuff -> ''{0}''");
    }

    public void test1() throws Throwable {
        Report report = process("UnusedPrivateInstanceVar1.java", rule);
        assertEquals(1, report.size());
    }

    public void test2() throws Throwable {
        Report report = process("UnusedPrivateInstanceVar2.java", rule);
        assertTrue(report.isEmpty());
    }

    public void test3() throws Throwable {
        Report report = process("UnusedPrivateInstanceVar3.java", rule);
        assertEquals(1, report.size());
    }

    public void test4() throws Throwable {
        Report report = process("UnusedPrivateInstanceVar4.java", rule);
        assertTrue(report.isEmpty());
    }

    public void test6() throws Throwable {
        Report report = process("UnusedPrivateInstanceVar6.java", rule);
        assertTrue(report.isEmpty());
    }
    public void test7() throws Throwable {
        Report report = process("UnusedPrivateInstanceVar7.java", rule);
        assertTrue(report.isEmpty());
    }

    public void test8() throws Throwable {
        Report report = process("UnusedPrivateInstanceVar8.java", rule);
        assertTrue(report.isEmpty());
    }

    public void test9() throws Throwable {
        Report report = process("UnusedPrivateInstanceVar10.java", rule);
        assertEquals(1, report.size());
    }

/*
    public void test10() throws Throwable {
        Report report = process("UnusedPrivateInstanceVar10.java", rule);
        assertTrue(report.isEmpty());
    }
*/
}
