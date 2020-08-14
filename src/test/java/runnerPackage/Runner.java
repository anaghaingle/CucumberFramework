package runnerPackage;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author Ajay.Gupta
 *
 */

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.FeatureWrapper;
import io.cucumber.testng.Pickle;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.core.gherkin.Feature;
import io.cucumber.core.runtime.FeaturePathFeatureSupplier;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.TestNGCucumberRunner;


@io.cucumber.testng.CucumberOptions(
        monochrome = true,
        tags= "@Login",
        features = "./src/test/resources/Feature/LoginTest.feature",
        plugin = { "pretty", "html:target/cucumber-reports","json:target/cucumber.json" },
        glue = "stepDefinition" 
                )
public class Runner extends io.cucumber.testng.AbstractTestNGCucumberTests{
	
	 private static final Predicate<Pickle> isSerial = pickle -> pickle.getTags().contains("@serial");
	private TestNGCucumberRunner testNGCucumberRunner;
	

/*	    @BeforeClass(alwaysRun = true)
	    public void setUpClass() {
	        System.out.println("Cucumber Test Class Before");
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }
	    
	    @Test(groups = "cucumber", description = "Runs Login User Feature", dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
	        System.out.println("Cucumber Test Class Inside Test");
	        System.out.println(cucumberFeature.getCucumberFeature());
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    }
	    
	    @DataProvider
	    public List<Feature> features() {
	        System.out.println("Data Provider test Class");
	        return testNGCucumberRunner.getFeatures();
	    }

	    @AfterClass(alwaysRun = true)
	    public void tearDownClass() {
	        testNGCucumberRunner.finish();

	    }*/
	
	@BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios", dataProvider = "parallelScenarios")
    public void runParallelScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) throws Throwable {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @DataProvider(parallel = true)
    public Object[][] parallelScenarios() {
        if (testNGCucumberRunner == null) {
            return new Object[0][0];
        }
        return filter(testNGCucumberRunner.provideScenarios(), isSerial.negate());
    }

/*    @Test(groups = "cucumber", description = "Runs Cucumber Scenarios in the Serial group", dataProvider = "serialScenarios")
    public void runSerialScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) throws Throwable {
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }
    
    @DataProvider
    public Object[][] serialScenarios() {
        if (testNGCucumberRunner == null) {
            return new Object[0][0];
        }

        return filter(testNGCucumberRunner.provideScenarios(), isSerial);
    }*/

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        if (testNGCucumberRunner == null) {
            return;
        }
        testNGCucumberRunner.finish();
    }

    private Object[][] filter(Object[][] scenarios, Predicate<Pickle> accept) {
        return Arrays.stream(scenarios).filter(objects -> {
            PickleWrapper candidate = (PickleWrapper) objects[0];
            return accept.test(candidate.getPickle());
        }).toArray(Object[][]::new);
    }

}
