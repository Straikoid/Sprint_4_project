package ru.praktikum.string_cheker;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    @DisplayName("Check the name started from letter ended with letter and contains only one space")
    public void checkNameStartedFromLetterEndedWithLetterAndContainsOneSpaceTrue() {
        Account account = new Account("Test Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertTrue("The name started from letter ended with letter and contains only one space should be valid", actual);
    }

    @Test
    @DisplayName("Check the name with length = 19")
    public void checkNameWithLengthEqual19True() {
        Account account = new Account("Test Testtesttestte");
        boolean actual = account.checkNameToEmboss();
        Assert.assertTrue("The name with length = 19 should be valid", actual);
    }

    @Test
    @DisplayName("Check the name with length = 20")
    public void checkNameWithLengthEqual20False() {
        Account account = new Account("Test Testtesttesttes");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The name with length = 20 should not be valid", actual);
    }

    @Test
    @DisplayName("Check the name with length = 3")
    public void checkNameWithLengthEqual3True() {
        Account account = new Account("T T");
        boolean actual = account.checkNameToEmboss();
        Assert.assertTrue("The name with length = 3 should be valid", actual);
    }

    @Test
    @DisplayName("Check the name with length = 2")
    public void checkNameWithLengthEqual2False() {
        Account account = new Account("T ");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The name with length = 2 should not be valid", actual);
    }

    @Test
    @DisplayName("Check the name started from space")
    public void checkNameStartedFromSpaceFalse() {
        Account account = new Account(" Test Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The name started from space should not be valid", actual);
    }

    @Test
    @DisplayName("Check the name ended with space")
    public void checkNameEndedWithSpaceFalse() {
        Account account = new Account("Test Test ");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The name ended with space should not be valid", actual);
    }

    @Test
    @DisplayName("Check the name with several spaces")
    public void checkNameWithSeveralSpacesFalse() {
        Account account = new Account("Test Test Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The name with several spaces should not be valid", actual);
    }

    @Test
    @DisplayName("Check the name doubled spaces")
    public void checkNameWithDoubledSpacesFalse() {
        Account account = new Account("Test  Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The name with doubled spaces should not be valid", actual);
    }

    @Test
    @DisplayName("Check the name without space")
    public void checkNameWithoutSpacesFalse() {
        Account account = new Account("TestTest");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The name without spaces should not be valid", actual);
    }

    @Test
    @DisplayName("Check the first name started from small char")
    public void checkNameWithFirstNameStartedFromSmallCharFalse() {
        Account account = new Account("test Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The firstname started from small char should not be valid", actual);
    }

    @Test
    @DisplayName("Check the surname started from small char")
    public void checkNameWithSurNameStartedFromSmallCharFalse() {
        Account account = new Account("Test test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The surname started from small char should not be valid", actual);
    }

    @Test
    @DisplayName("Check the first name with dash")
    public void checkNameWithDashInFirstName() {
        Account account = new Account("T-est Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertTrue("The firstname with dash should be valid", actual);
    }

    @Test
    @DisplayName("Check the surname with dash")
    public void checkNameWithDashInSurName() {
        Account account = new Account("Test T-est");
        boolean actual = account.checkNameToEmboss();
        Assert.assertTrue("The surname with dash should be valid", actual);
    }

    @Test
    @DisplayName("Check the first name with quota")
    public void checkNameWithQuotaInFirstName() {
        Account account = new Account("T'est Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertTrue("The firstname with ' should be valid", actual);
    }

    @Test
    @DisplayName("Check the surname with quota")
    public void checkNameWithQuotaInSurName() {
        Account account = new Account("Test T'est");
        boolean actual = account.checkNameToEmboss();
        Assert.assertTrue("The surname with ' should be valid", actual);
    }


    @Test
    @DisplayName("Check the first name started from digit")
    public void checkNameWithFirstnameStartedFromDigit() {
        Account account = new Account("9est Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The firstname started from digit should not be valid", actual);
    }

    @Test
    @DisplayName("Check the first name ended with digit")
    public void checkNameWithFirstnameEndedWithDigit() {
        Account account = new Account("Test9 Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The firstname ended with digit should not be valid", actual);
    }

    @Test
    @DisplayName("Check the first name with digit")
    public void checkNameWithFirstnameWithDigit() {
        Account account = new Account("T9est Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The firstname with digit inside should not be valid", actual);
    }

    @Test
    @DisplayName("Check the surname started with digit")
    public void checkNameWithSurnameStartedFromDigit() {
        Account account = new Account("Test 9est");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The surname started from digit should not be valid", actual);
    }

    @Test
    @DisplayName("Check the surname ended with digit")
    public void checkNameWithSurnameEndedWithDigit() {
        Account account = new Account("Test Test9");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The surname ended with digit should not be valid", actual);
    }

    @Test
    @DisplayName("Check the surname with digit")
    public void checkNameWitSurnameWithDigit() {
        Account account = new Account("Test T9st");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The surname with digit inside should not be valid", actual);
    }


    @Test
    @DisplayName("Check the first name started from special symbol")
    public void checkNameWithFirstnameStartedFromSpecSymbol() {
        Account account = new Account("!est Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The firstname started from special symbol should not be valid", actual);
    }

    @Test
    @DisplayName("Check the first name ended with special symbol")
    public void checkNameWithFirstnameEndedWithSpecSymbol() {
        Account account = new Account("Test? Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The firstname ended with special symbol should not be valid", actual);
    }

    @Test
    @DisplayName("Check the first name with special symbol")
    public void checkNameWithFirstnameWithSpecSymbol() {
        Account account = new Account("T~est Test");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The firstname with special symbol inside should not be valid", actual);
    }

    @Test
    @DisplayName("Check the surname started from special symbol")
    public void checkNameWithSurnameStartedFromSpecSymbol() {
        Account account = new Account("Test %est");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The surname started from special symbol should not be valid", actual);
    }

    @Test
    @DisplayName("Check the surname ended with special symbol")
    public void checkNameWithSurnameEndedWithSpecSymbol() {
        Account account = new Account("Test Test$");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The surname ended with special symbol should not be valid", actual);
    }

    @Test
    @DisplayName("Check the surname with special symbol")
    public void checkNameWitSurnameWithSpecSymbol() {
        Account account = new Account("Test T&st");
        boolean actual = account.checkNameToEmboss();
        Assert.assertFalse("The surname with special symbol inside should not be valid", actual);
    }
}
