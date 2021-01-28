import eu.senla.junit5.examples.package1.TestNestedClassAndAssertions;
import eu.senla.junit5.examples.package1.TestOrder;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

@RunWith(JUnitPlatform.class)
@SelectClasses({TestOrder.class, TestNestedClassAndAssertions.class})
public class TestSuitesClasses {
}
