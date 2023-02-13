package com.epam.qavn.webdriverio.formPage;

import com.epam.qavn.core.AbstractTest;
import com.epam.qavn.pages.FormPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SubmitFormTests extends AbstractTest {

    FormPage formPage;

    @BeforeClass
    public void initData() {
        formPage = new FormPage(driver);
    }

    @Test
    public void activeFormTest() {
        boolean messageIsDisplayed = formPage
                .tapFormsMenu()
                .fillForm("This is text", true, FormPage.FormDropdown.APPIUM)
                .tapButtonActive()
                .isActiveMessagePopupDisplayed();
        Assert.assertTrue(messageIsDisplayed, "Active message is not displayed");
        formPage.tapButtonOkOnMessagePopup();
    }

}
