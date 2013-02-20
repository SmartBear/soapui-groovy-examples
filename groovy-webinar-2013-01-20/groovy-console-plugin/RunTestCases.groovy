def testCase = workspace.getProjectByName("MockService scripting").getTestSuiteByName("TestSuite").getTestCaseByName("TestCase")
testCase.run(null, false)

workspace.projectList*.testSuiteList.flatten()*.testCaseList.flatten()*.run(null, false)