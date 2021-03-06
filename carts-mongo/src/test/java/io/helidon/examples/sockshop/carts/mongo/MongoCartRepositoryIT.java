package io.helidon.examples.sockshop.carts.mongo;

import io.helidon.examples.sockshop.carts.CartRepository;
import io.helidon.examples.sockshop.carts.CartRepositoryTest;

import static io.helidon.examples.sockshop.carts.mongo.MongoProducers.*;

/**
 * Integration tests for {@link io.helidon.examples.sockshop.carts.mongo.MongoCartRepository}.
 */
class MongoCartRepositoryIT extends CartRepositoryTest {
    public CartRepository getCartRepository() {
        String host = System.getProperty("db.host","localhost");
        int    port = Integer.parseInt(System.getProperty("db.port","27017"));

        return new MongoCartRepository(carts(db(client(host, port))));
    }
}
