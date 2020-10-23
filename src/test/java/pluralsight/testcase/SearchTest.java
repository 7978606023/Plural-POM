package pluralsight.testcase;

import org.testng.annotations.Test;

import pluralsight.pages.HomePage;
import pluralsight.pages.SearchPage;


public class SearchTest extends BaseTestClass {

    HomePage home = new HomePage();
    SearchPage search = new SearchPage();

    @Test
    public void basicFilterByTest() {

        home.search("Java");
        search.filterBySkillLevel("Beginner");
        search.filterByRole("Software Development");
        
    }

}
