package com.api.tests;

import api.dto.CreateUserDTO;
import api.dto.CreateUserResponseDTO;
import api.dto.GetSingleUserResponseDTO;
import api.services.ReqresService;
import com.api.utils.TestData;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ReqresTest {
    ReqresService reqresService = new ReqresService();

    @Test
    public void getSingleUserTest() {

        int userId = 2;
        String expectedUserFirstName = "Janet";
        String expectedUserLastName = "Weaver";
        String expectedUrl = "https://reqres.in/#support-heading";

        Response response = reqresService.getSingleUser(userId);

        GetSingleUserResponseDTO actualUserDTO = response.then()
                .statusCode(TestData.statusCodes.get("ok"))
                .extract().as(GetSingleUserResponseDTO.class);

        Assert.assertEquals(actualUserDTO.getData().getFirstName(), expectedUserFirstName);
        Assert.assertEquals(actualUserDTO.getData().getLastName(), expectedUserLastName);
        Assert.assertEquals(actualUserDTO.getSupport().getUrl(), expectedUrl);

    }

    @Test
    public void getSingleUserNotFoundTest() {
        int notFoundUserId = TestData.randomNumber();
        int expectedStatusCode = TestData.statusCodes.get("notFound");
        reqresService.getSingleUser(notFoundUserId)
                .then()
                .statusCode(expectedStatusCode);
    }

    @Test
    public void createUserTest() {
        CreateUserDTO expectedUser = TestData.createUser();

        Response response = reqresService.createUser(expectedUser);

        CreateUserResponseDTO actualUserDto = response.then().statusCode(TestData.statusCodes.get("created"))
                .extract().as(CreateUserResponseDTO.class);

        Assert.assertEquals(actualUserDto.getName(), expectedUser.getName());
        Assert.assertEquals(actualUserDto.getJob(), expectedUser.getJob());
    }

    @Test
    public void deleteUserTest() {
        Response response = reqresService.createUser(TestData.createUser());
        CreateUserResponseDTO actualUserDto = response.then().statusCode(TestData.statusCodes.get("created"))
                .extract().as(CreateUserResponseDTO.class);
        reqresService.deleteUser(actualUserDto.getId())
                .then()
                .statusCode(TestData.statusCodes.get("noContent"));
    }
}
