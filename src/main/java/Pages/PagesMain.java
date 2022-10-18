package Pages;

public class PagesMain {
    public static void main(String[] args) {

//        Page loginScreen = new Page("Login", 1, "www.legionIT.com/login");
//        loginScreen.pageId = 1;
//        loginScreen.pageName = "Login";
//        loginScreen.URL = "www.legionIT.com/login";

//        loginScreen.openPage();
//        loginScreen.clickButton("Login");
//        loginScreen.closePage();
//
//        Page aboutScreen = new Page();
//        aboutScreen.setPageId(2);
//        aboutScreen.setPageName("About");
//        aboutScreen.setURL("www.legionIT.com/about");
//
//        aboutScreen.openPage();
//        aboutScreen.clickButton("exit");
//        aboutScreen.closePage();

//        LoginPage loginPage = new LoginPage();
//        loginScreen.setPageName("LoginPage");
//        loginPage.setURL("http://....");
//
//        loginPage.openPage();
//        loginPage.setUsername("name");
//        loginPage.setPassword("12345");
//        loginPage.populateCredential();

//        Page page = new Page();
//        page.getDeveloperName();

        LoginPage loginPage = new LoginPage();
        loginPage.getDeveloperName();
        loginPage.setPageId(1);
        loginPage.setPageName("Login");
        AboutPage aboutPage = new AboutPage();
        aboutPage.getDeveloperName();
    }

}


