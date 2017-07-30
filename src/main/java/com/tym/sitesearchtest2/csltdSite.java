package com.tym.sitesearchtest2;

import com.tym.sitesearchtest2.page.MainPage;
import com.github.webdriverextensions.WebSite;
import static com.github.webdriverextensions.Bot.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class csltdSite extends WebSite {
    // Logger
    private static final Logger log = LoggerFactory.getLogger(csltdSite.class);

    // Url
    public static String url = "csltd.com.ua";

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

    public void open(Object... arguments) {
        open(url);
    }

    @Override
    public void assertIsOpen(Object... arguments) throws Error {
        assertCurrentUrlStartsWith(url);
    }

}
