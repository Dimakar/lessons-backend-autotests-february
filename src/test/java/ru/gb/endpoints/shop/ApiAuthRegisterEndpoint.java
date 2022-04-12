package ru.gb.endpoints.shop;

import ru.gb.dto.shop.UserDto;

import static io.restassured.RestAssured.given;

@Endpoint("/auth/register")
public class ApiAuthRegisterEndpoint extends BaseEndpoint {

    public UserDto registerUser(UserDto userDto) {
        return given()
                .body(userDto)
                .post(endpoint)
                .then()
                .statusCode(201)
                .extract()
                .as(UserDto.class);
    }
}
