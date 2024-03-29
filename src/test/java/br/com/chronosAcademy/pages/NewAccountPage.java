package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.maps.NewAccountMap;
import br.com.chronosAcademy.steps.core.Driver;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
    NewAccountMap newAccountMap;

    public NewAccountPage(){
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(), newAccountMap);
    }

    public String getTextNewAccount(){
        Driver.visibilityOf(newAccountMap.textCreateAccount);
        return newAccountMap.textCreateAccount.getText();
    }

}
