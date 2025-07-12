# Effective Robot - Customer Management Test Automation

A comprehensive test automation suite built with Katalon Studio to test the Prieds Technology customer management system.

## 🚀 Project Overview

This project automates testing for a customer management web application, covering:
- Customer registration and validation
- Customer search functionality
- Customer information updates
- User interface validation
- Comprehensive negative testing scenarios

## 📋 Prerequisites

- **Katalon Studio** (version 8.0 or higher)
- **Java JDK** (version 8 or higher)
- **Web Browser** (Chrome, Firefox, or Edge)
- **Git** (for version control)

## 🛠️ Setup Instructions

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd effective-robot
   ```

2. **Open in Katalon Studio:**
   - Launch Katalon Studio
   - Select `File` → `Open Project`
   - Navigate to the project folder and open `effective-robot.prj`

3. **Configure Browser:**
   - Go to `Project` → `Settings` → `Execution`
   - Set your preferred browser (Chrome recommended)

## 📁 Project Structure

```
effective-robot/
├── Object Repository/          # Web element definitions
│   ├── cust management/       # Customer management page objects
│   ├── dashboard/            # Dashboard page objects
│   ├── search customer/      # Search functionality objects
│   └── update customer/      # Update functionality objects
├── Test Cases/               # Test case definitions
│   ├── Functionality/        # Functional test cases
│   │   ├── positive-testcase/    # Happy path scenarios
│   │   ├── negative-testcase/    # Error handling scenarios
│   │   └── negative-testcase2/   # Additional validation tests
│   └── User Interface/       # UI validation tests
├── Test Suites/             # Test suite configurations
├── Scripts/                 # Groovy test scripts
├── Reports/                 # Test execution reports
└── Profiles/               # Execution profiles
```

## 🧪 Test Scenarios

### ✅ Positive Test Cases
- **Customer Registration**: Complete customer registration with valid data
- **Customer Search**: Search for existing customers by ID
- **Customer Update**: Update customer information successfully

### ❌ Negative Test Cases
- **Empty Field Validation**: Test individual field validation
- **Duplicate Customer ID**: Prevent duplicate customer registration
- **Invalid Data Formats**: Test with invalid email, phone numbers, etc.
- **Required Field Validation**: Ensure all mandatory fields are validated

### 🎨 UI Test Cases
- **Login Page**: Validate login interface elements
- **Dashboard Page**: Verify dashboard layout and navigation
- **Customer Management Page**: Test customer management UI components

## 🏃‍♂️ Running Tests

### Run Individual Test Cases
1. Navigate to `Test Cases` folder
2. Right-click on desired test case
3. Select `Run` → `Browser Type`

### Run Test Suites
1. Navigate to `Test Suites` folder
2. Right-click on desired test suite:
   - `functional.ts` - Positive test scenarios
   - `functional-negativecase.ts` - Negative test scenarios
   - `user interface.ts` - UI validation tests
3. Select `Run` → `Browser Type`

### Command Line Execution
```bash
# Run specific test suite
katalon -runMode=console -projectPath="." -testSuiteCollectionPath="Test Suites/functional"

# Run with specific browser
katalon -runMode=console -projectPath="." -testSuiteCollectionPath="Test Suites/functional" -browserType="Chrome"
```

## 📊 Test Reports

Test execution reports are automatically generated in the `Reports/` directory:
- **HTML Reports**: Detailed test execution results
- **CSV Reports**: Test data in spreadsheet format
- **Screenshots**: Captured on test failures
- **Video Recordings**: Complete test execution videos

## 🔧 Configuration

### Test Data
- Customer test data is managed within individual test scripts
- Modify test data directly in the Groovy scripts for different scenarios

### Environment Configuration
- Base URL and environment settings can be configured in `Profiles/default.glbl`
- Browser preferences are set in project settings

## 🤝 Contributing

1. Create a feature branch: `git checkout -b feature/new-test-case`
2. Add your test cases following the existing structure
3. Commit your changes: `git commit -m "Add new test case for feature X"`
4. Push to the branch: `git push origin feature/new-test-case`
5. Create a Pull Request

## 📝 Test Case Naming Convention

- **Positive Cases**: `register new customer`, `search customer`, `update customer`
- **Negative Cases**: `regist new cust but empty [field_name]`
- **UI Cases**: `[page_name] page`

## 🔍 Debugging

### Common Issues
1. **Element not found**: Update object locators in Object Repository
2. **Timeout errors**: Increase wait times in test scripts
3. **Browser compatibility**: Ensure browser drivers are up to date

### Logging
- Check execution logs in Katalon Studio's Log Viewer
- Review console output for detailed error messages

## 📞 Support

For issues or questions:
1. Check the existing test reports for similar issues
2. Review Katalon Studio documentation
3. Create an issue in the project repository

## 🏷️ Version History

- **v1.0.0**: Initial release with customer management test suite
- Comprehensive negative testing scenarios
- UI validation test cases
- Automated reporting and video recording

---

**Note**: This project follows the always-tested-code principle - all features are thoroughly tested with both positive and negative scenarios before deployment.
