package ru.gb.endpoints.shop;

import ru.gb.dto.shop.OrderDto;

import static io.restassured.RestAssured.given;

@Endpoint("/order")
public class ApiOrderEndpoint extends BaseEndpoint{

    public void order(String token, OrderDto orderDto) {
        given()
                .header(getAuthHeader(token))
                .body(orderDto)
                .post(endpoint)
                .then()
                .statusCode(200);
    }
}
