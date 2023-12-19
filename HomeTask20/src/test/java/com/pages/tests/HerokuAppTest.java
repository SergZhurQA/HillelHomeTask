package com.pages.tests;

import com.pages.utils.HerokuAppBase;
import com.utils.FilesOperations;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class HerokuAppTest extends HerokuAppBase {

    @Test
    public void readFileContentTest() {

        downloadPage.downloadFile(testProperties.getProperty("fileName"));

        Assert.assertTrue(FilesOperations.fileIsDownload(testProperties.getProperty("filePath"), 5), "File is not exist.");

        Assert.assertTrue(FilesOperations.fileExtensionIsCorrect(testProperties.getProperty("filePath"), ".csv"));

        Assert.assertFalse(FilesOperations.fileIsEmpty(testProperties.getProperty("filePath")), "File is empty!");

        List<String> expectedHeader = Arrays.asList(testProperties.getProperty("header").split(","));
        List<String> expectedRowOne = Arrays.asList(testProperties.getProperty("rowOne").split(","));

        Assert.assertEquals(expectedHeader, FilesOperations.getAllHeaders(testProperties.getProperty("filePath")), "Headers are different!");

        Assert.assertEquals(expectedRowOne, FilesOperations.getRowByNumber(testProperties.getProperty("filePath"), 1), "Different content in first row!");
    }
}
