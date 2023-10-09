package utils;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import base.BaseTest;

public class SuitListener implements ITestListener, IAnnotationTransformer {
    // this class should implement ITestListener and IAnotationTransformer

    public void onTestFailure(ITestResult result) {

        System.out.println("Test Failed");

        // need to store screenshot
        String fileName = "/screenshots/" + result.getMethod().getMethodName()
                + ".png";
        File file = ((TakesScreenshot) BaseTest.driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
        annotation.setRetryAnalyzer(RetryAnalyser.class);

    }
}
