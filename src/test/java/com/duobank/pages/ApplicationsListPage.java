package com.duobank.pages;

import com.duobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplicationsListPage {
    public ApplicationsListPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBar;

    @FindBy(xpath = "(//span[@class='menu-item'])[2]")
    public WebElement applicationList;

    @FindBy(xpath = "//tr//td[2]")
    public WebElement nameText;

    @FindBy(xpath = "//tr//td[@class='sorting_1']")
    public WebElement slNumber;

    @FindBy(xpath = "//tr//td[3]")
    public WebElement loanNumber;

    @FindBy(xpath = "//td[@class='dataTables_empty']")
    public WebElement noMatchingMsg;

    @FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
    public WebElement showEntries;

    @FindBy(xpath = "(//th[@class='sorting'])[3]")
    public WebElement actionButton;


    @FindBy(xpath = "//th[contains(@aria-label, 'Borrower Name')]")
    public WebElement borrowerName;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']/tbody/tr")
    public List<WebElement> tableRows;


    @FindBy(xpath = "//select[@name='DataTables_Table_0_length']")
    public WebElement entriesButton;


    @FindBy(xpath = "//option[@value='50']")
    public WebElement entriesButtonAfterChanging;

    @FindBy(xpath = "//div[@role='status']")
    public WebElement entriesMsg;



    public boolean checkApplicationListSorted(int headerIndex, boolean asc){
        List<String> sortedList = new ArrayList<>();

        for (WebElement eachRow: tableRows) {
            if(eachRow.findElement(By.xpath("(.//td)["+headerIndex+"]")).getText().equalsIgnoreCase("asdfasdf asdf")){
                continue;
            }
            sortedList.add(eachRow.findElement(By.xpath("(.//td)["+headerIndex+"]")).getText());
        }

        List<String> checkList = new ArrayList(sortedList);

        if(asc){
            Collections.sort(checkList);
        }
        else{
            Collections.sort(checkList, Collections.reverseOrder());
        }
        for (String s: sortedList)

              {
                  System.out.println(s);
        }
        System.out.println("****");
        for (String s: checkList)

        {
            System.out.println(s);
        }
        return sortedList.equals(checkList);
    }

    public String getFirstBorrowerInformation(){
        return tableRows.get(0).getText();
    }}
