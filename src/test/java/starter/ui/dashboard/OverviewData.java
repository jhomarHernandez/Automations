package starter.ui.dashboard;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class OverviewData {

    public static Question<String> creditAvailable(){
        return actor -> TextContent.of(FinancialOverview.CREDIT_AVAILABLE).answeredBy(actor).trim();
    }

    public static Question<String> totalBalance(){
        return actor -> TextContent.of(FinancialOverview.TOTAL_BALANCE).answeredBy(actor);
    }

}
