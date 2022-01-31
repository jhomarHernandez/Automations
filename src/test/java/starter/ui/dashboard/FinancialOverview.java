package starter.ui.dashboard;

import org.openqa.selenium.By;

public class FinancialOverview {
    public static By CREDIT_AVAILABLE = By.xpath("//*[@id=\"creditAvailable\"]/div[2]");

    public static By TOTAL_BALANCE = By.xpath("//*[@id=\"totalBalance\"]/div[2]/span[1]");
}
