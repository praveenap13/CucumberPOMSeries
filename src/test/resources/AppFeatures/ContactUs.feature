Feature: Contact us feature

Scenario Outline: Contact us scenario with de\ifferent set of data
Given user navigates to contact us page 
When user fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
And user clicks on send button
Then it shows successful message "Your message has been successfully sent to our team."

Examples:
|SheetName|RowNumber|
|contactus|0|
|contactus|1|



