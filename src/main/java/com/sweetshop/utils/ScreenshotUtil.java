package com.sweetshop.utils;
import com.sweetshop.base.BaseTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {
    public static String captureScreenshot(String testName) {
        File src =
                ((TakesScreenshot) BaseTest.driver)
                        .getScreenshotAs(OutputType.FILE);
        String path =
                "screenshots/" +
                        testName +
                        "_" +
                        new SimpleDateFormat("yyyyMMddHHmmss")
                                .format(new Date())
                        + ".png";
        try {
            FileUtils.copyFile(src, new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }
}