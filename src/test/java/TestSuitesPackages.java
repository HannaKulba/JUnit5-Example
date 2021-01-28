import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("eu.senla.junit5.examples")
//@ExcludePackages("eu.senla.junit5.examples.package1")
//@IncludeClassNamePatterns({"^.*ATests?$"})
//@ExcludeClassNamePatterns({"^.*ATests?$"})
@IncludePackages("eu.senla.junit5.examples.package1")
public class TestSuitesPackages {
}
