package com.jam

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.reactive.server.WebTestClient
import spock.lang.Specification

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class WebfluxCookieSpec extends Specification {

    @Autowired
    private WebTestClient client

    def 'Sample Controller Test'() {
        given:
        def request = "/sample?data=$data"
        def response = "Hello, $data!"

        def req = client.get()
                .uri(request)
                .accept(MediaType.TEXT_PLAIN)
                .exchange()

        expect:
        req.expectStatus().isOk()
        new String(req.expectBody().returnResult().responseBody) == response

        where:
        data << ['John', 'Bob', 'Mary']
    }

}
