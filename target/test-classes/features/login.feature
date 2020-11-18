Feature: Application Login

Scenario: home page default login
Given User is on landing page
When User login into application entering username "akhil" and password "akhil_pwd"
Then Home page should appear
And Cards information is populated


Scenario: home page default login
Given User is on landing page
When User login into application entering username "akhil_no" and password "akhil_pwd_no"
Then Home page should appear
And Cards information is not populated