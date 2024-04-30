
package apTests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
//Selenium Imports
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
///

public class TestCases {
    WebDriver driver;

    public TestCases() {
        System.out.println("Constructor: TestCases");

        WebDriverManager.chromedriver().timeout(30).setup();
        ChromeOptions options = new ChromeOptions();
        LoggingPreferences logs = new LoggingPreferences();

        // Set log level and type
        logs.enable(LogType.BROWSER, Level.ALL);
        logs.enable(LogType.DRIVER, Level.ALL);
        options.setCapability("goog:loggingPrefs", logs);

        // Set path for log file
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "chromedriver.log");

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "/Users/souvikgayen/Downloads/chromedriver-mac-x64/chromedriver");

        driver = new ChromeDriver(options);

        // Set browser to maximize and wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    public void testCase01() {
        System.out.println("Start Test case: testCase01");

        // Navigate to the Wikipedia homepage
        driver.get("https://www.wikipedia.org/");

        // Check if the title contains the word "Wikipedia"
        String title = driver.getTitle();
        if (title.contains("Wikipedia")) {
            System.out.println("Page title contains 'Wikipedia'");
        } else {
            System.out.println("Page title does not contain 'Wikipedia'");
        }

        System.out.println("end Test case: testCase01");
    }

    public void testCase02() {
        System.out.println("Start Test case: testCase02");

        // Navigate to the Wikipedia homepage
        driver.get("https://www.wikipedia.org/");

        // Locate the <h1> element with class "central-textlogo-wrapper"
        WebElement h1Element = driver.findElement(By.className("central-textlogo-wrapper"));

        // Find the text content within the <h1> element
        String h1Text = h1Element.getText();

        // Check if the text contains "Wikipedia"
        if (h1Text.contains("Wikipedia")) {
            System.out.println("header text is 'Wikipedia'.");
        } else {
            System.out.println("header text is not 'Wikipedia'.");
        }

        // Confirm the presence of footer links
        WebElement termsOfUsePresent = driver.findElement(By.xpath("//a[contains(text(),'Terms of Use')]"));
        WebElement privacyPolicyPresent = driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));

        if (termsOfUsePresent.getText().equals("Terms of Use")) {
            System.out.println("Footer links contain 'Terms of Use'");
        } else {
            System.out.println("Footer links do not contain 'Terms of Use'");
        }

        if (privacyPolicyPresent.getText().equals("Privacy Policy")) {
            System.out.println("Footer links contain 'Privacy Policy'");
        } else {
            System.out.println("Footer links do not contain 'Privacy Policy'");
        }

        System.out.println("end Test case: testCase02");
    }

    public void testCase03() {
        System.out.println("Start Test case: testCase03");

        // Navigate to the Wikipedia homepage
        driver.get("https://www.wikipedia.org/");

        // Find the search input element and enter "apple"
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("apple");
        // searchInput.submit(); // Submit the search query

        // Locate the <h3> element with class "suggestion-title" containing the text
        // "Apple Inc."
        WebElement appleIncElement = driver
                .findElement(By.xpath("//h3[@class='suggestion-title' and contains(., 'Apple Inc.')]"));
        appleIncElement.click();

        // Locate the table with class "infobox vcard"
        WebElement infoboxTable = driver.findElement(By.className("infobox"));

        // Locate the row with "Founders" label within the table
        WebElement foundersRow = infoboxTable.findElement(By.xpath(".//tr[th[contains(text(), 'Founders')]]"));

        // Get the data cell containing the list of founders
        WebElement foundersCell = foundersRow.findElement(By.tagName("td"));

        // Check if "Steve Jobs" is listed as a founder
        boolean steveJobsFound = foundersCell.getText().contains("Steve Jobs");

        if (steveJobsFound) {
            System.out.println("Steve Jobs is listed as a founder of Apple Inc.");
        } else {
            System.out.println("Steve Jobs is not listed as a founder of Apple Inc.");
        }

        System.out.println("end Test case: testCase03");
    }

    public void testCase04() {
        System.out.println("Start Test case: testCase04");

        // Navigate to the Wikipedia homepage
        driver.get("https://www.wikipedia.org/");

        // Find the search input element and enter "microsoft"
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        searchInput.sendKeys("microsoft");

        try {
            // Click on the search result link for "Microsoft"
            WebElement microsoftElement = driver
                    .findElement(By.xpath("//h3[@class='suggestion-title' and contains(., 'Microsoft')]"));
            Thread.sleep(1000);
            microsoftElement.click();

            // Locate the table with class "infobox vcard"
            WebElement infoboxTable = driver.findElement(By.className("infobox"));

            // Locate the row with "Founders" label within the table
            WebElement foundersRow = infoboxTable.findElement(By.xpath(".//tr[th[contains(text(), 'Founders')]]"));

            // Get the data cell containing the list of founders
            WebElement foundersCell = foundersRow.findElement(By.tagName("td"));

            // Check if "Bill Gates" is listed among the founders and click on his name
            if (foundersCell.getText().contains("Bill Gates")) {
                WebElement billGatesLink = foundersCell.findElement(By.linkText("Bill Gates"));
                billGatesLink.click();

                // Check if the opened URL contains "Bill_Gates"
                String currentUrl = driver.getCurrentUrl();
                if (currentUrl.contains("Bill_Gates")) {
                    System.out.println("Successfully navigated to Bill Gates' Wikipedia page.");
                } else {
                    System.out.println("Bill Gates' Wikipedia page not opened.");
                }
            } else {
                System.out.println("Bill Gates is not listed as a founder.");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println("end Test case: testCase04");
    }

    public void testCase05() {
        System.out.println("Start Test case: testCase05");

        // Navigate to the Wikipedia homepage
        driver.get("https://en.wikipedia.org/");

        // Find and click on the Main menu to expand it
        WebElement mainMenu = driver.findElement(By.id("vector-main-menu-dropdown"));
        mainMenu.click();

        // Find and click on the link for "About Wikipedia" in the menu
        WebElement aboutLink = mainMenu.findElement(By.linkText("About Wikipedia"));
        aboutLink.click();

        // Check if the opened URL contains "About"
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("About")) {
            System.out.println("Clicked on 'About Wikipedia'. URL contains 'About'.");
        } else {
            System.out.println("Clicked on 'About Wikipedia', but the URL does not contain 'About'.");
        }

        System.out.println("end Test case: testCase05");
    }
}
