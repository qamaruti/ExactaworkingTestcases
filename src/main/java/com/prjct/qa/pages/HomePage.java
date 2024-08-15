package com.prjct.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.prjct.qa.base.TestBase;

public class HomePage extends TestBase{
		
		    @FindBy(xpath= "//div[@class='main-menu-nav-icon icon-favorite']")
		    WebElement FavoritiesMenu;
		    @FindBy(xpath = "//*[@id=\"accordionSection-0\"]/div[1]/a")
		    WebElement FavoritiesPageLable;
		    @FindBy(xpath= "//a[@id='mainMenuItem-2']")
		    WebElement OutboundMenu;
		    @FindBy(xpath= "//*[@id=\"accordionSection-2\"]/div[1]/a")
		    WebElement OutboundPageLable;
		    @FindBy(xpath = "//*[@id=\"mainMenuItem-3\"]")
		    WebElement InboundMenu;
		    @FindBy(xpath = "//*[@id=\"accordionSection-3\"]/div[1]/a")
		    WebElement InboundPageLable;
		    @FindBy(xpath= "//*[@id=\"mainMenuItem-13\"]")
		    WebElement UsersandGroupsMenu;
		    @FindBy(xpath = "//*[@id=\"accordionSection-13\"]/div[1]/a")
		    WebElement UsersandGroupsPageLable;
		    @FindBy(xpath = "//*[@id=\"mainMenuItem-20\"]")
		    WebElement InventoryMaintainanceMenu;
		    @FindBy(xpath = "//*[@id=\"accordionSection-20\"]/div[1]/a")
		    WebElement InventoryMaintainancePageLable;
		    @FindBy(xpath = "//*[@id=\"mainMenuItem-27\"]")
		    WebElement ReportsMenu;
		    @FindBy(xpath = "//*[@id=\"accordionSection-27\"]/div[1]/a")
		    WebElement ReportsPageLable;
		    @FindBy(xpath = "//*[@id=\"mainMenuItem-36\"]")
		    WebElement UtilitiesMenu;
		    @FindBy(xpath = "//*[@id=\"accordionSection-36\"]/div[1]/a")
		    WebElement UtilitiesPageLable;
		    @FindBy(xpath = "//*[@id=\"mainMenuItem-109\"]")
		    WebElement SelfserviceReportingMenu;
		    @FindBy(xpath = "//*[@id=\"accordionSection-109\"]/div[1]/a")
		    WebElement SelfserviceReportingPageLable;

		    
			public HomePage() {
				PageFactory.initElements(driver, this);
			}
			public String verifyHomepageTitle() {
				
				 return driver.getTitle();
			}
		    public void clickSelfserviceReportingMenu() {
		        SelfserviceReportingMenu.click();
		    }
		    public void clickUtilitiesMenu() {
		        UtilitiesMenu.click();
		    }
		    public void clickReportsMenu() {
		        ReportsMenu.click();
		    }
		    public void clickInventoryMaintainanceMenu() {
		        InventoryMaintainanceMenu.click();
		    }
		    public void clickUsersandGroupsMenu() {
		        UsersandGroupsMenu.click();
		    }
		    public void clickInboundMenu() {
		        InboundMenu.click();
		    }
		    public void clickOutboundMenu() {
		        OutboundMenu.click();
		    }
		    public void clickFavoritiesMenu() {
		        FavoritiesMenu.click();
		    }
		  public String VerifyFavoritesPageLable() {
			  
		       return FavoritiesPageLable.getText();	    
		    }
		    public String VerifyOutboundPageLable() {
		        return OutboundPageLable.getText();	        
		    }
		   public String VerifyInboundPageLable() {
		        return InboundPageLable.getText();	    
		    }
		   public String VerifyUsersandGroupsPageLable() {
		      return UsersandGroupsPageLable.getText();	     
		    }
		   public String VerifyInventoryMaintainancePageLable() {
		      return InventoryMaintainancePageLable.getText();	       
		    }
		    public String VerifyReportsPageLable() {
		       return ReportsPageLable.getText();	       
		    }
		    public String VerifyUtilitiesPageLable() {
		        return UtilitiesPageLable.getText();
		    }
		   public String VerifySelfserviceReportingPageLable() {
		        return SelfserviceReportingPageLable.getText();
		    }	
	}

