package com.duobank.pages;

import com.duobank.utilities.Driver;
import com.duobank.utilities.SeleniumUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplicationListPage {

    public ApplicationListPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='#'][.='Next']")
    public WebElement paginationNextButton;

    @FindBy(xpath = "//a[@href='#']/parent::li[contains(@class, 'active')]/a")
    public WebElement currentActivePageNumber;

    @FindBy(xpath = "(//table[@id='DataTables_Table_0']//th)[1]")
    public WebElement applicationListTableHeaderFirst;

    @FindBy(xpath = "(//table[@id='DataTables_Table_0']//th)[3]")
    public WebElement applicationListTableHeaderThird;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr")
    public List<WebElement> applicationListTableRows;

    public static void waitForPaginationNextButton(){
        SeleniumUtils.waitForVisibility(By.xpath("//a[@href='#'][.='Next']"), 5);
    }

    public static void waitApplicationListTableHeaderFirst(){
        SeleniumUtils.waitForVisibility(By.xpath("(//table[@id='DataTables_Table_0']//th)[1]"), 5);
    }

    public static void waitApplicationListTableHeaderThird(){
        SeleniumUtils.waitForVisibility(By.xpath("(//table[@id='DataTables_Table_0']//th)[3]"), 5);
    }

    public void clickPaginationNextButton(){
        paginationNextButton.click();
    }

    public void clickApplicationListTableHeaderFirst(){
        applicationListTableHeaderFirst.click();
    }

    public void clickApplicationListTableHeaderThird(){
        applicationListTableHeaderThird.click();
    }

    public boolean checkApplicationListSorted(int headerIndex, boolean asc){
        List<Integer> sortedList = new ArrayList<>();

        for (WebElement eachRow: applicationListTableRows) {
            sortedList.add(Integer.parseInt(eachRow.findElement(By.xpath("(.//td)["+headerIndex+"]")).getText()));
        }

        List<Integer> checkList = new ArrayList(sortedList);

        if(asc){
            Collections.sort(checkList);
        }
        else{
            Collections.sort(checkList, Collections.reverseOrder());
        }

        return sortedList.equals(checkList);
    }

    public String getFirstBorrowerInformation(){
        return applicationListTableRows.get(0).getText();
    }

    public void clickViewDetailOnGivenRow(int row){
        SeleniumUtils.jsClick(applicationListTableRows.get(row).findElement(By.xpath("(.//td)[4]/a")));
    }

}
