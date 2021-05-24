Feature: Validate SignUp Functionality to ParaBank
  @Regression
  Scenario Outline: Validate SignUp Functionality to ParaBank
    Given user click Register link from HomePage
    When user enter FirstName, LastName, Address, City, State
      | Jewel | Mary | Kingston | NJ | NJ |
#      | Jewel1 | Mary1 | Kingston1 | NJ1 | NJ1 |
    And enter <Zipcode>, <PhoneNum>, <SSN>, <UserName>, <Password>, <Confirm>
    And click on Register Button
    Then message "Your account was created successfully. You are now logged in." should be displayed in Welcome Page
    Examples:
      | Zipcode | PhoneNum | SSN | UserName | Password | Confirm |
      | 7890 | 485223 | 212 | Jewel2021 | Jewel2021 | Jewel2021 |
#      | 7891 | 485224 | 213 | Sam2021 | Sam2021 | Sam2021 |

  @Regression
  Scenario: Validate SignUp Functionality to ParaBank with one row
    Given Click Register link from HomePage
    When Enter FirstName, LastName, Address, City, State, Zipcode, PhoneNum, SSN, UserName, Password, Confirm
      | Jewel | Mary | Kingston | NJ | NJ | 7890 | 485223 | 212 | 1Jewel2021 | 1Jewel2021 | 1Jewel2021 |
    And Click Register Button
    Then Message "Your account was created successfully. You are now logged in." should be displayed.


