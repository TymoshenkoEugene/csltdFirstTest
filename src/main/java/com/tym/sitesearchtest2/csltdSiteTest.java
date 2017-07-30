package com.tym.sitesearchtest2;

import com.tym.sitesearchtest2.csltdSite;
import com.tym.sitesearchtest2.page.MainPage;
import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import org.junit.runner.RunWith;

@RunWith(WebDriverRunner.class)
@Firefox
@Chrome
@InternetExplorer
public class csltdSiteTest {

    // Site
    public csltdSite site;

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

}
