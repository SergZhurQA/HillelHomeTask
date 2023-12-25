package api.services;

import api.dto.CreateUserDTO;
import io.restassured.response.Response;

public class ReqresService extends BaseService{
    protected static final String USER_PATH = "/users/";

    public Response getSingleUser(int usersId){
        return setRequestSpec()
                .when()
                .get(USER_PATH + usersId);
    }

    public Response createUser(CreateUserDTO createUser) {
        return setRequestSpec()
                .given()
                .body(createUser)
                .when()
                .post(USER_PATH);
    }

    public Response deleteUser(int userId) {
        return setRequestSpec()
                .given()
                .when()
                .delete(USER_PATH + userId);
    }
}
