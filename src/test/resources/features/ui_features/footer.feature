@Regression
  @footer
  @us07
@smoke
Feature:footer
  Scenario: US07_TC01 The user should make sure that the links in any row or column of the links at the bottom of the home page lead to the correct page.
  Given User goes to url.
  When User goes to FOOTER.
  Then The user clicks on a link.
  And The user verifies the title of the page he is directed to.
  And The user closes the page.


