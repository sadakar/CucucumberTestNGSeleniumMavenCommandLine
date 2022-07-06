@Dasbhoard
Feature: Dashboard page
  I want to use this template for my Dashboard Page

Background: 
  Given User login to HRM application with UserName and Password
      | Admin | admin123 |
  @DashboardTabCountOfQuickLaunhElements
  Scenario: DashboardTabCountOfQuickLaunhElements
    Then User finds the list of quick launch elements

  @DirectoryTabNavigationFromDashboardTab
  Scenario: DirectoryTabNavigationFromDashboardTab
    Then User clicks on Directory tab and verifies the navigation
